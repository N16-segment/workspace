import React from 'react'
import { useParams } from 'react-router-dom'

//해당 컴포넌트가 실행될 때, num 이라는 이름으로 데이터가 전달된다.
//URL Parameter(->매개변수)로 전달되는 데이터를 받을 떄는 useParams() 훅을 사용하여 받는다.
//useParams()훅은 URL Parameter로 전달되는 데이터를 '객체' 형식으로 리턴시켜 준다.
const BoardDetail = () => {
  const params = useParams();
  const{num, age} = useParams(); //->구조분해할당으로 사용할 수 있다.
  // 유즈파라미터가 리턴하는 데이터를 출력 -> '객체' 형태로 출력된다. 
  // 예시){num: '2'}, {num: '2', age: '20'} 
  // {num->key, 2->value} 객체 요소는 {키값과 밸류(데이타)}
  console.log(params);
  //params가 변수명이다.

  return (
    <>
      <div>게시글 상세 페이지</div>
      <div>받은 num 데이터 : {params.num}</div>
    </>
  )
}

export default BoardDetail