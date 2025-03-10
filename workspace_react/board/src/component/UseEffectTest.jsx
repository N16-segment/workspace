import axios from 'axios';
import React, { useEffect, useState } from 'react'

//useEffect : 컴포넌트의 생애주기에 따라 기능을 구현하는 훅 
// + useEffect 안의 내용은 화면을 다 그린 후 가장 마지막에 실행 
//시점에 따라서 사용하고 싶은 코드를 만들 수 있도록 useEffect 훅을 사용한다.

//컴포넌트의 생애주기
//1. mount : 컴포넌트가 최초 렌더링 되는 시점
//2. update : 컴포넌트가 리렌더링 되는 시점
//3. unmount : 컴포넌트가 더이상 사용되지 않아 화면에서 사라지는 시점 

//useEffect(실행코드, 의존성 배열); *의존성 배열은 필요할 때만 작성
const UseEffectTest = () => {
  const [num, setNum] = useState(0);
  const [age, setAge] = useState(20);

  //컴포넌트가 마운트 될 때(새로고침-깝빡o) + 컴포넌트가 리렌더링 될 때(깜빡x)
  //어떤 리렌더링이든 무조건 실행된다.
  useEffect(()=>{//실행 순서가 다르다.
    console.log(2);//아래 1를 먼저 출력하고 2를 출력 - 전부 그리고 난 다음 출력
  }); 
  
  //컴포넌트가 마운트 될 때만 실행
  useEffect(()=>{
    console.log(3);//처음 마운트 시에만 출력되고, 버튼 누르면 실행되지 않는다.
  }, []); 

  //컴포넌트가 마운트 될 때 +
  //num이라는 state 변수의 변경으로 리렌더링 될 때 실행
  useEffect(()=>{
    console.log(4);
  }, [num]); 

  //컴포넌트가 마운트 될 때 +
  //age라는 state 변수의 변경으로 리렌더링 될 때 실행
  useEffect(()=>{
    console.log(5);
  }, [age]); 

  //컴포넌트가 마운트 될 때 +
  //num 또는 age라는 state 변수의 변경으로 리렌더링 될 때 실행
  useEffect(()=>{
    console.log(6);
  }, [num, age]);

  //mount 될 때도 실행 - return문을 제외하고 실행
  //return문 안의 내용은 unmount 시점에 실행 됨
  useEffect(()=>{
    console.log(7); // 삭제하면 mount 될 때도 실행되지 값이 없다.
    return () => {
      alert('unmount');
    }
  }, []);
  
  console.log(1);

  //list가 조회될때마다 계속 실행되므로 []빈배열을 줘야한다.
  // const [list, setList] = useEffect([]);
  // useEffect(()=>{
  //   axios.get('/api')
  //   .then(res=>{
  //     setList(res.data);
  //   })
  // }, [list]);
  
  return (
    <>
    <div>UseEffectTest</div>
    <button type='button' onClick={e=>setNum(num+1)}>num 버튼</button>
    <button type='button' onClick={e=>setAge(age+1)}>age 버튼</button>
    </>
   
  )
}

export default UseEffectTest