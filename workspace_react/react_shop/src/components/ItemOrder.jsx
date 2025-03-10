import React, { useEffect, useState } from 'react'
import styles from './ItemOrder.module.css'
import axios from 'axios';
import { useNavigate } from 'react-router-dom';

const ItemOrder = () => {
  const nav = useNavigate();

  //조회한 상품 목록을 저장할 변수
  const [itemList, setItemList] = useState([]);
  //상품 목록 조회  
  useEffect(()=>{
    axios.get('/api/items')
    .then(res=>{setItemList(res.data)})
    .catch(error=>console.log(error));
  }, []);
  //입력한 정보를 저장할 변수 - input태그에 넣어주는 데이터는 항상 key값을 넣어줘야한다.
    const [orderItem, setOrderItem] = useState({
      itemNum : '',
      itemPrice : '상품을 선택하세요',
      buyer : '',
      buyCnt : 1
    });
    console.log(orderItem);

    //이벤트가 발생한 태그의 값이 변경될 때마다 변경되는 함수
    const changeOrderData = (e) => {
      if(e.target.name === 'itemNum'){
        let price = 0;

        for(const item of itemList){
          if(item.itemNum == e.target.value){
            price = item.itemPrice;
          }
        }
        setOrderItem({
          ...orderItem,
          [e.target.name] : e.target.value,
          itemPrice : price

          // itemPrice : itemList.find((e)=>{return e.itemNum == e.target.value}).price
        });
      }
      
      else{
        setOrderItem({
          ...orderItem,
          [e.target.name] : e.target.value
        })
      }
    }
    //주문하기
    const order = () =>{
      axios.post('/api/orders', orderItem)
      .then(res=>nav('/order-list'))
      .catch(error=>console.log(error));
    }

  return (
    <>
     <div className={styles.order_div}>
      <h3>상품 주문</h3>
      <table className={styles.item_order_table}>
      <colgroup>
      </colgroup>
        <tbody>
          <tr>
            <td>주문상품</td>
            <td>
              <select name='itemNum' value={orderItem.itemNum} 
              onChange={e=>changeOrderData(e)} className='my-input wide'>
                {/* option에 있는 value값은 itemNum : ''에 있는 ''값과 동일해야 된다.*/}
                <option value="">선택</option>
                {
                  itemList.map((item, i) => {
                    return(
                      <option key={i} value={item.itemNum}>{item.itemName}</option>
                    )
                  })
                }
              </select>
              
            </td>
          </tr>
          <tr>
            <td>상품단가</td>
            <td>
            <input className='my-input wide' type="text" 
            name='itemPrice'
            value={orderItem.itemPrice}
            onChange={e=>changeOrderData(e)} readOnly={true}/>
            </td>
          </tr>
          <tr>
            <td>주문자</td>
            <td>
            <input className='my-input wide' type="text" 
              name='buyer'
              value={orderItem.buyer}
              onChange={e=>changeOrderData(e)}/>
            </td>
          </tr>
          <tr>
            <td>주문수량</td>
            <td>
            <input className='my-input wide' type="text" 
              name='buyCnt'
              value={orderItem.buyCnt}
              onChange={e=>changeOrderData(e)}/>
            </td>
          </tr>
        </tbody>
      </table>
    <div className={styles.btn_div}>
      <button className='btn btn-large' type='button'
      onClick={e=>{order()}}>주문하기</button>
    </div>
  

     </div>
    </>
  )
}

export default ItemOrder