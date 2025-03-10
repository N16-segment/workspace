import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom';
import styles from './ItemInfo.module.css'
import dayjs from 'dayjs';
import ItemDetail from './ItemDetail';

const ItemInfo = () => {
  //조회한 상품 목록 데이터를 저장할 state 변수
  const [itemList, setItemList] = useState([]);
  const nav = useNavigate();

  //상세 정보 조회 데이터를 저장할 state 변수
  const [item, setItem] = useState(null);

  //상세 정보 내용 보임/숨김 변수
  // const [isShow, setIsShow] = useState(false);

  //상세정보 바꿀때마다 값만 바꾸기 위한 state변수
  const [cnt, setCnt] = useState(0);

  //상품명 클릭 시 상세 정보 조회 함수
  const getDetail = (itemNum) => {
    axios.get(`/api/items/${itemNum}`)
    .then(res=>{
      setItem(res.data);
      // setIsShow(true);
    })
    .catch(error=>console.log(error));
  }
  
  useEffect(()=>{
    axios.get('/api/items')
    .then(res=>{
      console.log(res.data);
      setItemList(res.data);
    })
    .catch(error=>console.log(error));
  }, [cnt]);

  return (
  <>
  <div>

    {/* 상품 목록 */}
    <div className={styles.item_info_container}>

     <div className={styles.list_div}>
        <h3>상품 목록</h3>
          <table className={styles.list_table}>
            <colgroup>
              <col width={'10%'}/>
              <col width={'30%'}/>
              <col width={'30%'}/>
              <col width={'30%'}/>
            </colgroup>
            <thead>
              <tr>
                <td>No</td>
                <td>상품명</td>
                <td>상품가격</td>
                <td>판매자</td>
              </tr>
            </thead>
            <tbody>
            {
            itemList.map((item, i)=>{
              return(
            <tr key ={i}>
            <td>{itemList.length - i}</td>
            <td>
              <span onClick={e=>getDetail(item.itemNum)}>{item.itemName}</span>
              </td>
            {/* 'ㄹ'치고 한자 누르면 3번에 ￦ 표시*/}
            <td>￦{item.itemPrice.toLocaleString()}</td>
            <td>{item.seller}</td>
            </tr>
              )
            })
            }
            </tbody>
          </table>
          <p>총 {itemList.length}개의 상품이 등록되었습니다.</p>
      </div>
  
      {/* 상품 상세 정보 보임/숨김*/}
       <div className={styles.detail_div}></div>
      {
      //  isShow ? <ItemDetail item={item}/> : null
      //자바스크립트에서 거짓 && 참인 경우 앞이 거짓이므로 참은 해석하지 않고 거짓을 마지막으로 해석하는 것이므로 null에 해당하는 아무것도 없는 화면이 나오고, 상세정보를 조회하는 getDetail 함수로 데이터를 받아서 item에 데이터가 들어가면 참 && 참이므로 앞이 참이면 뒤의 참도 확인하고 마지막으로 해석되는 참을 출력하게 되므로 Item에 있는 상세정보 내용이 출력하게 된다.
      item && <ItemDetail item={item} 
      setItem={setItem} setCnt={setCnt} cnt={cnt}/>
      }
  
      </div>
    </div></>
  )
}

export default ItemInfo