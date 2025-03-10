// import React from "react";
import React, { useState } from "react";
import "./Order.css";
//주문 상세정보 내용이 들어가는 컴포넌트
const OrderDetail = ({order}) => {

  return (
    <>
      <div>
        {/* <div>OrderDetail</div> */}
        <table className="orderdetail-table">
        <colgroup>
          <col width={'25%'}/>
          <col width={'25%'}/>
          <col width={'25%'}/>
          <col width={'25%'}/>
          </colgroup>

          <tbody>
            <tr>
              <td>상품번호</td>
              <td>{order.productNum}</td>
              <td>상품명</td>
              <td>{order.productName}</td>
            </tr>
            <tr>
              <td>가격</td>
              <td>{order.price}원</td>
              <td>수량</td>
              <td>{order.quantity}</td>
            </tr>
            <tr>
              <td>주문자ID</td>
              <td>{order.customerId}</td>
              <td>구매금액</td>
              <td>{order.price * order.quantity}원</td>
            </tr>
          </tbody>
        </table>
        </div>
    </>
  );
};

export default OrderDetail;
