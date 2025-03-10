import React, { useEffect, useState } from "react";
import OrderList from "./OrderList";
import OrderDetail from "./OrderDetail";
import axios from "axios";
import "./Order.css";

//모든 주문 내용이 들어가는 컴포넌트
const OrderInfo = () => {
  //주문목록 하나의 정보를 담을 state변수
  const [order, setOrder] = useState({});
  //주문 상세 내용이 보일지 안보일지 결정하는 state 변수
  const [isShow, setIsShow] = useState(false);

  return (
    <>
      {/* <div>OrderInfo</div> */}
      <div className="container">

        <div>
          <h3>주 문 목 록</h3>
        </div>

        {/* 주문내용이 나오는 목록 */}
        <OrderList setOrder={setOrder} setIsShow={setIsShow} />
        <br />

          <div>
            <h3>주문 상세 정보</h3>
          </div>
          
        {/* 주문상세정보가 나오는 목록 */}
        {isShow ? <OrderDetail order={order} /> : null}
        <table />
        
      </div>
    </>
  );
};

export default OrderInfo;
