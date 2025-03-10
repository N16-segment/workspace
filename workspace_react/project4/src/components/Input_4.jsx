import React, { useState } from 'react'

const Input_4 = () => {
  //모든 입력정보를 저장할 state 변수 생성
  const [memberInfo, setMemverInfo] = useState({
    name : '',
    tel : '',
    email : '',
    major : '국어',
  });

  //모든 input 태그의 값이 변경될 때 실행할 함수
  //input 태그에 입력한 정보를 memberInfo에 저장(변경)하는 기능
  //화살표 함수로 만든다.
  const changeMemberInfo = (e) => {
    setMemverInfo({
      ...memberInfo,
      [e.target.name] : e.target.value
    });
  };

  return (
    <>
    <div>희망과목 신청서</div>
    <br />

    이름 <input type="text" name="name" value={memberInfo.name} onChange={(e)=>{
      changeMemberInfo(e);
    }}/> 
    <br />

    연락처 <input type="text" name="tel" value={memberInfo.tel} onChange={(e)=>{
      changeMemberInfo(e);
    }}/>
    <br />

    이메일 <input type="text" name="email" value={memberInfo.email} onChange={(e)=>{
      changeMemberInfo(e);
    }}/>
    <br />

    희망과목 
    <select name='major' value={memberInfo.major} onChange={(e)=>{
      changeMemberInfo(e);
    }}>
      <option value="001">국어</option>
      <option value="영어">영어</option>
      <option value="수학">수학</option>
    </select>
    <br />

    <div>
      <h3>작성내용</h3>
      <p>이름 - {memberInfo.name}</p>
      <p>연락처 - {memberInfo.tel}</p>
      <p>이메일 - {memberInfo.email}</p>
      <p>희망과목 - {memberInfo.major}</p>
    </div>
    </>
  )
}

export default Input_4