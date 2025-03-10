import React, { useState } from "react";

const Input_3 = () => {
  //select 박스에서 선택한 데이터를 저장하기 위한 state 변수
  //state 변수에 초기값은 여러 option들 중에 최초로 화면에 
  //표현하고 싶은 option 태그의 value 속성값으로 지정
  //주어진 내용들이 중복될 가능성이 많아서 진짜 데이터는 value값으로 
  //각 내용들의 고유코드를 준다. -> 찐 내용은 value 값이된다.
  //value를 넣지 않으면 일반적으로 주어진 내용(데이타)을 value의 기본값으로 인식하므로 항상 value값을 넣도록 한다.
  //select 는 우리가 선택한 눈에 보이는 데이타값의 value 값을 state 초기값으로 넣는다. 
  const [fruit, setFruit] = useState('banana');

  const [member, setMember] = useState({
    name : '',
    phone : '',
    email : '',
    subject : '',
    total : ''
  });

  function changeData(e){
    setMember({...member,
      [e.target.name] : e.target.value

    });
    
  }
  return (
    <>
      <select value={fruit} onChange={(e)=>{
        setFruit(e.target.value);
      }}>
       <option value="apple">사과</option>  
       <option value="banana">바나나</option>  
       <option value="orange">오렌지</option>  
      </select>
      <br />
      <br />
      <br />

      <table>
        <tr>
          <td>이름</td>
          <td>
            <input type="text" value={member.name} onChange={(e)=>{
              changeData(e);

            }}/>
          </td>
        </tr>
        <tr>
          <td>연락처</td>
          <td><input type="text"  value={member.phone} onChange={(e)=>{
            changeData(e);

          }}/></td>
        </tr>
        <tr>
          <td>이메일</td>
          <td><input type="text" value={member.email} onChange={(e)=>{
            changeData(e);

          }}/></td>
        </tr>
        <tr>
          <td>희망과목</td>
          <td>
            <select name="" id="" value={member.subject} onChange={(e)=>{
              setMember.subject(e.target.value);

            }}>
              <option value="국어">국어</option>
              <option value="영어">영어</option>
              <option value="수학">수학</option>
            </select>
          </td>
        </tr>
        <tr>
          <td colSpan="2">
            <textarea name="" id=""></textarea>
          </td>
        </tr>
      </table>  
      

    </>
  );
};

export default Input_3;
