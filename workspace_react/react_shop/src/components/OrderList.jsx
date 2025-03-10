import axios from 'axios';
import React, { useEffect, useState } from 'react'

const OrderList = () => {
  //주문 목록 조회 데이터
  const [orderList, setOrderList]=useState([]);

  useEffect(()=>{
    axios.get('/api/orders')
    .then(res => {
      console.log(res.data)
      setOrderList(res.data)
    })
    .catch(error=>console.log(error));
  },[]);
  return (
    <>
    <div>
      <p>총{}건의 주문정보가 검색되었습니다.</p>
      <table>
        <thead>
          <tr>
            <td>No</td>
            <td>상품명</td>
            <td>상품단가</td>
            <td>구매수량</td>
            <td>구매가격</td>
            <td>주문자</td>
            <td>주문일</td>
          </tr>
        </thead>

        <tbody>
          {
            orderList.map((orderInfo, i)=>{
              return(
                <tr key={i}>
                  <td></td>
                  <td>{orderInfo.itemDTO.itemName}</td>
                  <td>{orderInfo.itemDTO.itemPrice}</td>
                  <td>{orderInfo.buyCnt}</td>
                  <td>{orderInfo.buyPrice}</td>
                  <td>{orderInfo.buyer}</td>
                  <td>{orderInfo.buyDate}</td>
                </tr>
            )} 
          ) 
        }   
          
        </tbody>
      </table>
    {/* 주문 목록 */}
    

    </div></>
  )
}

export default OrderList