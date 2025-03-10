import "./Test1.css";
import React, { useState } from "react";

const Test1 = () => {
  //count숫자 데이터를 저장할 state변수 생성(useState자동완성)
  const [cnt, setCnt] = useState(0);

  //매개변수로 들어온 값으로 cnt값을 변경
  return (
    <>
      <d2>Test1</d2>
      <div className="count">{cnt}</div>
      <button type="button" onClick={()=>{
        setCnt(cnt + 1);
      }}>클릭</button>
    </>
  );
};

export default Test1;
