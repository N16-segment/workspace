import React, { useState } from "react";

const Input_2 = () => {
  //이름을 입력하는 input 태그에 작성한 내용을 저장할 state변수
  const [name, setName] = useState('');
  const [age, setAge] = useState('');
  const [adress, setAdress] = useState('');

  //객체로 데이터를 만들면 한번에 많은 내용들을 한번에 변경(관리)할 수 있다.
  //모든 input 태그에 입력한 데이터를 저장할 state 변수 
  const [data, setData] = useState({
    name : '',
    age : '',
    addr : ''
  });

  //input 태그의 값이 변경되는 내용을 실행시킬 함수
  function changeData(e){
    setData({...data,
      //[] 안에 input 태그에 name 속성으로 
      // 이벤트가 발생한 속성값,
      // 각각의 이름에 해당하는 내용을 불러들인다.
      //키값이 변수일때 대괄호에 넣어야 같은 속성이 된다.
      [e.target.name] : e.target.value});
  }

  return (
    <>
      이름 : <input name="name" type="text" value={data.name} onChange={(e)=>{
          changeData(e);
        }}/> 
        <br />
      나이 : <input name="age" type="text" value={data.age} onChange={(e)=>{
          changeData(e);
        }}/> 
        <br />
        <div>
        입력받은 나이 : {data.age}
      </div>
        <br />

      이름 : <input type="text" value={data.name} onChange={(e)=>{
        //아래에 있는 객체의 data를 value에 속성값으로 넣어 준 것으로 나이와 주소도 이런식으로 하나의 객체에서 spread 해서 변경할 수 있다. {...data, name -> 기존의 데이타값은 그대로 두고 그안에서 name만 변경한다.}
        //console.log(e.target.value);
          setData({...data,
            name : e.target.value});
        }}/> 
        <br />
        <div>
          입력받은 이름 : {data.name}
        </div>
        <br />

      이름 : <input type="text" value={name} onChange={(e)=>{
        // console.log(e.target.value);
        setName(e.target.value);
      }}/> 
      <br />
        
      나이 : <input type="text" value={age} onChange={(e)=>{
        //input 태그의 값이 변경될때마다(input 태그에 입력할때마다)
        //input 태그에 작성한 데이터를 age 변수에 저장한다.
        console.log(e.target.value);
        setAge(e.target.value);

      }}/> 
      <br />

      주소 : <input type="text" value={adress} onChange={(e)=>{
        console.log(e.target.value);
        setAdress(e.target.value);

      }}/> 
      <br />
      <br />


      <div>
        입력받은 이름 : {name}
      </div>
      <div>
        입력받은 나이 : {age}
      </div>
      <div>
        입력받은 주소 : {adress}
      </div>
    </>
  );
};

export default Input_2;
