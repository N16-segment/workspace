import axios from "axios";
import React, { useEffect, useState } from "react";
import "./Order.css";

//모든 주문 목록이 들어가는 컴포넌트
const OrderList = ({setOrder, setIsShow}) => {
  //서버에서 받아오는 주문목록 데이터를 저장할 state 변수
  const[orderList, setOrderList] = useState([{
    num : 0,
    name : '상품명입니다',
    price : 0,
    quantity : 0,
    totalPrice : 0
  }]);

  //미리 표를 그려놓고 데이터를 받아온 다음 마지막에 실행하여 시간절약하기 위해 useEffect를 사용한다. 
  //마운트, 리렌더링될때 계속 실행되지 않게 하기 위해 두번째 매개변수로 빈 []의존성 배열을 넣는다.
  useEffect(()=>{
    axios.get('/api/getOrderList')
    .then((res)=>{
      console.log(res.data);
      setOrderList(res.data);
    })
    .catch((error)=>{
      console.log('오류');
    });
  }, []);


  return (
    //주문 목록이 나오는 영역
    <>
           {/* <div>OrderList</div> */}
         <div>

          <table className="orderlist-table">
            <colgroup>
            <col width={'10%'}/>
            <col width={'*%'}/>
            <col width={'20%'}/>
            <col width={'15%'}/>
            <col width={'25%'}/>
            </colgroup>

            <thead>
              <tr>
                <td>No</td>
                <td>상품명</td>
                <td>상품가격</td>
                <td>수량</td>
                <td>총 구매가격</td>
              </tr>
            </thead>

            {/* 데이터 반복 리턴 */}
            <tbody>
              {
                orderList.map((order, i)=>{
                  return(
                    /* 클릭한 행의 게시글에서  
                        orderList 에 저장된 게시글 목록 중 - order(주문 하나)
                        주문 행과 일치하는 주문 정보를 검색 */
                    <tr key={i} onClick={(e)=>{
                      for(let i = 0 ; i < orderList.length ; i++){
                        if(orderList[i].productNum == order.productNum){
                          setOrder(orderList[i]);
                        }
                      }
                      setIsShow(true);
                    }}>
                        
                      <td>{orderList.length - i}</td>
                      <td>{order.productName}</td>
                      <td>{order.price}원</td>
                      <td>{order.quantity}</td>
                      <td>{order.price * order.quantity}원</td>
                    </tr>
                  
                  )

                })
              }
            </tbody>
          </table>

          </div>  
    </>
  );
};

export default OrderList;
