import React, { useState } from "react";

const Input_1 = () => {
  //input 태그의 value 속성값을 저장할 state변수
  //태그 안 속성값에 기본적으로 자동활성해서 "" 쓰면되고,
  //변수를 넣으려면 {}를 넣으면 된다.

  const [data, setDate] = useState("");
  return (
    <>
      <h2>input태그에 데이터 입력받기</h2>
    {/* input 태그에 작성한 내용이 value속성으로 들어간다. */}
      <input
        type="text"
        onChange={(e) => {
          console.log(e.target.value);
          setDate(e.target.value);
        }}
      />

      <div>input 태그에 입력한 내용 : {data}</div>
    </>
  );
};

export default Input_1;
