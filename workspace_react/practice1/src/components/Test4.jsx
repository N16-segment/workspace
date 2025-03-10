import "./Test4.css";
import React, { useState } from 'react'

const Test4 = () => {
  const[numArr, setNumArr] = useState([0,0,0]);

  //공동으로 사용되는 함수를 밖에서 만들어서 공통으로 적용시켜주면 된다.
  function changeData(index){
    const copyArr = [...numArr];
    copyArr[index] = copyArr[index] + 1;
    setNumArr(copyArr);
  }
  //state의 값(주소값)이 변경될때만 리렌더링된다.
  
  //useState변경함수가 실행되면(변경될때만) 변수가 선언된 컴포넌트가 리렌더링 된다. 컴포넌트 새로 실행

  return (
    <>
    <div>Test4</div>
    <span onClick={()=>{
      changeData(0);
      // const copyArr = [...numArr];//[0,0,0], ...->스프레드 연산자로 흩뿌린 뒤 다시 감사서 복사함
      // copyArr[0] = copyArr[0] + 1;
      // setNumArr(copyArr);
      // // setNumArr([numArr[0] + 1, 0, 0]);//새로운 배열로 만들어서 setNumArr에 넣어줘도 된다.
    }}>{numArr[0]}</span>

    <span onClick={()=>{
      changeData(1);
      // const copyArr = [...numArr];
      // copyArr[1] = copyArr[1] + 1;
      // setNumArr(copyArr);
    }}>{numArr[1]}</span>

    <span onClick={()=>{
      changeData(2);
      // const copyArr = [...numArr];
      // copyArr[2] = copyArr[2] + 1;
      // setNumArr(copyArr);
    }}>{numArr[2]}</span>
    </>
  )
}

export default Test4