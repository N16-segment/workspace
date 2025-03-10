import React from "react";

const Map_forEach = () => {
  function aaa(){
    console.log(3);
  }
  //반복문 : for, for of, forEach(), map() ->() 있는 둘은 자바스크립트에 있는 함수

  const arr = [1, 3, 5]; 
  //forEach() 기본문법 - 데이터 반복수행 끝
  //()안의 내용을 반복 실행! 매개변수가 들어가는 ()안에 함수를 넣는다.
  //즉 변수가 아니라 함수이다!
  //매개변수로 두개의 변수를 받는다.
  arr.forEach((item, i)=>{
    console.log(`a=${item}, b=${i}`);
    //item는 배열에 들어있는 수를 순서대로, i는 배열의 순번(index) 0부터~
  });
  //map() 기본문법 - 데이터의 반복값을 리턴해준다. 보여준다!
  //()안의 내용을 반복 실행! ()안에 함수를 넣는다!
  //()안에 매개변수로 두개의 변수를 받는다.
  const result = arr.map((e, i)=>{
    console.log(`e=${e}, i=${i}`);12
    return e * 2;
  });
  console.log(result);

  return (
    <>
      <div>Map_forEach</div>
    </>
  );
};

export default Map_forEach;
