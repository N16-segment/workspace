import React, { useState } from "react";

const ObjectTest = () => {
  const [monitor, setMonitor] = useState({
    brand : 'Samsung',
    price : 10000,
    color : 'black'
  });
  
  return (
    <>
      <div>ObjectTest</div>
      브랜드 : {monitor.brand} <br />
      가격 : {monitor.price} <br />
      색상 : {monitor.color} <br />
      <button type="button" onClick={() => {
       //새로운 객체 생성
      //  const copyMonitor = {...monitor};
      //  copyMonitor.brand = 'LG';
      //  setMonitor(copyMonitor);
      //위와 동일한 명령문 spread로 객체 안의 내용을 껍질을 까서 분리
      setMonitor({
        ...monitor,
        brand : 'LG'
      });

      }}>버튼</button>
    </>
  );
};

export default ObjectTest;
