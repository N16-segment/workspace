import React, { useState } from "react";

const Test6 = () => {
  const [count, setCount] = useState(0);

  const changeCount = (val) => {
    setCount(count + val);
  };

  return (
    <>
      <div>Test6</div>
      <h3>Simple Counter</h3>
      <div>
        <p>현재 카운트</p>
        <h3>{count}</h3>
      </div>
      <button type="button" onClick={(e)=>{
        changeCount(-1);
      }}>-1</button>
      <button type="button" onClick={(e)=>{
        changeCount(-10);
      }}>-10</button>
      <button type="button" onClick={(e)=>{
        changeCount(-100);
      }}>-100</button>
      <button type="button" onClick={(e)=>{
        changeCount(100);
      }}>+100</button>
      <button type="button" onClick={(e)=>{
        changeCount(10);
      }}>+10</button>
      <button type="button" onClick={(e)=>{
        changeCount(1);
        // setCount(count + 100);
      }}>+1</button>
    </>
  );
};

export default Test6;
