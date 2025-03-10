import axios from 'axios';
import React, { useEffect, useState } from 'react'

const Person = () => {
  //서버에서 받은 데이터를 저장할 state 변수
  const [person, setPerson] = useState({});
  
  //http://localhost:8080/t4
  useEffect(()=>{
    axios.get('/api/t4')
        .then((res)=>{
          console.log(res.data);
          setPerson(res.data);
        })
        .catch((error)=>{
          console.log('통신 중 오류 발생');
          console.log(error);
        });
  }, []);


  return (
    <>
    {/* 객체는 한번에 불러들일 수 없고 각각의 key로 받아야한다. */}
    <h3>Person</h3>
    <button type='button' onClick={()=>{}}>데이터 받기</button>
    <p>이름 : {person.name}</p>
    <p>나이 : {person.age}</p>
    <p>주소 : {person.addr}</p>
    </>
  )
}

export default Person