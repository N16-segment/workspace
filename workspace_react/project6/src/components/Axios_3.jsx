import axios from 'axios';
import React, { useEffect, useState } from 'react'

const Axios_3 = () => {
  //컴포넌트의 특정 생애주기에 기능을 구현할때
  //서버에서 데이터 받을 때 오래 걸리기 때문에 
  //->그림 다 그린 후 마지막에 실행
  //실행내용이 오래걸리는 내용을 넣는다.
  //코드를 다 해석하고 그 뒤에 실행하기 위해 
  // useEffect();
  //서버에서 데이터 받을 때 사용
  // axios.get();
  
  //서버에서 넘어오는 데이터를 저장할  변수의 초기값은
  //최종적으로 받는 데이터의 자료형과 일치시켜서 만들어 줌
  const [person, setPerson] = useState({});
  //서버에서 데이터를 받아 person 에 저장하는 함수
  const getPersonData = () => {
    
      //서버에서 데이터 받기
      //get : 데이터를 받아올 서버의 주소(url)
      //http://localhost:8080/t4 -> /api/t4
      axios.get('/api/t4')
      //서버와 통신 성공 시 실행할 내용 작성
      //res : 통신 성공한 모든 데이터를 객체 형태로 갖고 있다.
      //우리가 서버에서 받은 데이터 : res.data(객체이기때문에 key형태로 받아옴)
      .then((res)=>{
        console.log('통신성공');
        console.log(res.data);
        setPerson(res.data);
        
      })
      //서버와 통신 실패 시 실행할 내용 작성
      //error : 통신 실패에 대한 모든 데이터를 객체 형태로 갖고 있다.
      .catch((error)=>{
        console.log('통신실패');
        console.log(error);
      });
  };
  
  return (
    <>
    <div>Axios_3</div>
    <br />
    <input type="button" value={'버튼'}
    onClick={(e)=>{
      getPersonData();
    }}/>
    {/* input 태그 끝나고 화면에 나타내기 */}
    {/* useEffect는 리턴값을 모두 계산하고 마지막에 그림을 그리는 것이고,
    다른 태그로 명령할때는 바로 한번에 직관적으로 결과값을 줄때는 리턴안에 태그를 두고 작성한다. */}
      
    <div>
      <p>이름 : {person.name}</p>
      <p>나이 : {person.age}</p>
      <p>주소 : {person.addr}</p>
      </div>
    </>
  )
}

export default Axios_3