import React, { useState } from 'react'

const InputTest = () => {
  //id input 태그에 입력한 데이터를 저장할 변수
  //input 태그의 초기값은 화면이 뜰 때 보여주고 싶은 데이터로 초기화
  const [id, setId] = useState(''); //빈문자로 초기값 준 것 -> value={}에 넣어준다.
  const [age, setAge] = useState(''); //('') 최초로 보여주고 싶은 값
  return (
    <>
    <div>InputTest</div>
    {/* 리액트에서는 밸류에 {}중괄호를 주면 변수값을 줄 수 있다. */}
    {/* input 태그에 입력한 값을 어떻게 가져오나? */}
    {/* onChange는 input태그에 입력한 값을 {id} 변수에 저장한다. */}
    <div>id : <input id='java' type="text" name='kim' value={id}
    onChange={(e)=>{
      setId(e.target.value);
      //이벤트가 발생한 태그 -> e.target 을 말한다. input태그에 접근하는 것
      //떠있는 화면에 어떤 행위를 하는 것을 모두 총칭해서 이벤트라고 한다.
      console.log(e.target); //input태그가 나온다.
      console.log(e.target.value); //키보드로 입력한 값이 나온다.
      console.log(e.target.value); //input태그에 value속성이 있으면 value값이 나온다.
      console.log(e.target.id); // input 태그의 속성인 id의 값이 나온다.
    }}
    
    /></div>

    <div>age : <input type="text" value={age} 
    onChange={(e)=>{
      setAge(e.target.value);
      console.log(e.target.value);
    }}/></div>


    <div>name : <input type="text" /></div>
   {/* ....계속 위에서 만든 것처럼 해당 input 태그마다 State 변수를 만들기는 번거롭다. */}
   {/* 배열은 데이터를 순번으로 저장하지만, 객체는 name 같은 키로 저장하므로  */}
   {/* 많은 데이터를 (수정하고) 저장하기에는 배열보다는 객체의 형태가 좋다. */}
    </>
  )
}

export default InputTest