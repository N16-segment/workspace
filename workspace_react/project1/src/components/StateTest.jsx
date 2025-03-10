import React, { useState } from "react";

const StateTest = () => {
  console.log(3);
  //useState는 실행 후 두 개의 데이터를 갖는 배열을 리턴
  //배열의 첫번째(0) 데이터는 소괄호 안에 작성된 데이터를 리턴한다.
  //배열의 두번째 데이터로 전달되는 것은 함수이다.
  //두번째로 리턴되는 함수는 변수의 값을 변경하는 기능을 가진 함수다.
  //useState만 변경한다고 화면에 보이는 것이 아니라 
  //함수를 선언하고 두번째 함수를 적용해주어야 보임
  let [hobby, setHobby] = useState('잠자기');
 
  return (
    <>
      <div>{hobby}</div>
      <button type="button" onClick={()=>{
        setHobby('밥먹기');
      }}>취미변경</button>
    </>
  );
};

export default StateTest;
