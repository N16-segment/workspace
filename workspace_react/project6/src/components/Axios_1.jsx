import axios from "axios";
import React, { useEffect, useState } from "react";

const Axios_1 = () => {
  //서버에서 받은 데이터를 저장할 state 변수
  //문자는 빈문자, 숫자는 0하면 됨
  const [num, setNum] = useState(0);

  //컴포넌트가 마운트 될때만 서버에서 데이터를 받기 위해 useEffect를 사용
  useEffect(() => {
    //서버에서 데이터 받기
    //get 안에는 데이터를 요청할 url을 작성
    //  'http://localhost:8080:/t2' -> 원래 주소이나 가명: /api 부여
    axios.get('/api/t2')
        //통신성공 후 실행 내용 작성
        //res는 통신 성공에 대한 모든 정보가 담겨있는 객체
        .then((res)=>{
          //->통신 성공 시 num 변수에 서버에서 받아온 데이터를 저장
          setNum(res.data);
        })
        //통신실패 시 실행 내용 작성
        //error는 통신 실패에 대한 모든 정보가 담겨있는 객체
        .catch((error)=>{});

  }, []);

  return (
    <>
      <div>Axios_1</div>
      <h3>데이터 받기 1</h3>
      <p>받은 데이터 : {num}</p>
      {/* 'http://localhost:8080:/t2' */}
    </>
  );
};

export default Axios_1;
