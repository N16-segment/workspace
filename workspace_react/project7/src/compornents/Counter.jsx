import React, { useState } from "react";
import Display from "./Display";
import Controller from "./Controller";

const Counter = () => {
  const[cnt, setCnt] = useState(0);

    return (
      <>
       <div>Counter</div>
       <h2>Simple Cound</h2>
       {/* 형제지간끼리는 데이터를 주고 받을 수 없다. */}
       {/* 여기에서는 카운터가 디스플레이와 콘트롤러의 부모가 된다. */}
       <Display cnt={cnt}/>
       {/* setCnt 넘기는건 함수를 넘기는 것이다. */}
       <Controller cnt={cnt} setCnt={setCnt}/>
      </>
    );
  };

export default Counter;
