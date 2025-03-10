import axios from "axios";
import React, { useEffect, useState } from "react";

const Axios_7 = () => {
  const phone = {
    brand : 'samsung',
    price : 10000,
    color : 'red'
  }

  // axios.post('/api/t8', phone).then().catch();

  const student = {
    name : 'kim',
    korScore : 80,
    engScore : 90,
    mathScore : 70
  };

  const [sum, setSum] = useState(0);
  //아래 코드의 결과 전달되는 데이터를 자바에서 받은 후 
  //전달된 국, 영, 수 점수의 총점을 다시 react로 가져와서 
  //react 화면에 총점을 보여주세요!
  //아래 student는 객체형태로만 가져갈 수 있다. const student = {};
  //axios post() 함수의 두번째 매개변수로 
  //자바로 전달할 데이터를 작성할 수 있다.
  //자바로 전달할 데이터는 객체형식으로 지정해야 함
  
  useEffect(()=>{
    axios.post('/api/t9', student)
    .then((res)=>{
      console.log(res.data);
      setSum(res.data);
    })
    .catch();
  }, []);
  
  
  return (
    <>
      <div>Axios_7</div>
    {/* 자바에서 리턴되는 변수는 리엑트에서 받을 수 있다. */}
      <div>합 : {sum}</div>
    </>
  );
};

export default Axios_7;
