import React, { useState } from 'react'
import styles from './ItemUpdate.module.css'
import axios from 'axios';
import { useNavigate } from 'react-router-dom';
const ItemUpdate = () => {
  const nav = useNavigate();
  // 입력 데이터를 저장할 변수
  const [itemData, setItemData] = useState({
    itemName : '',
    itemPrice : '',
    seller : '',
    itemIntro : ''
  });
  const changeItemData = (e) => {
    setItemData({
      ...itemData,
      [e.target.name] : e.target.value
    })
  }

  //상품 (등록버튼 눌렀을 때) 등록 기능 함수 
  const regItem = () => {
    //둘 다 참일 경우 실행에서 반대는 둘 중 하나라도 거짓이면 실행 이거나 둘 다 참인 경우를 싸서 전체 부정하면 된다.
    if(!(itemData.itemName && itemData.itemPrice)){
      alert('상품명과 가격은 필수입니다.');
      return;
    }
    axios.post('/api/items', itemData)
    .then(res=>{
      alert('상품 등록 완료')
      nav('/')
    })
    .catch();
  }
  return (
    <>

   <div className={styles.item_update_container}>

    <h3>상품 등록</h3>
      <table className={styles.item_update_table}>
        <colgroup>
        </colgroup>
        <tbody>
          <tr>
            <td>상품명</td>
            <td>
              <input className='my-input wide' type="text" 
              name='itemName'
              value={itemData.itemName}
              onChange={e=>changeItemData(e)}/>
            </td>
          </tr>
          <tr>
            <td>상품가격</td>
            <td>
            <input className='my-input wide' type="text" 
            name='itemPrice'
            value={itemData.itemPrice}
            onChange={e=>changeItemData(e)}/>
            </td>
          </tr>
          <tr>
            <td>판매자</td>
            <td>
            <input className='my-input wide' type="text" 
            name='seller'
            value={itemData.seller}
            onChange={e=>changeItemData(e)}/>
            </td>
          </tr>
          <tr>
            <td>상품설명</td>
            <td>
              <textarea id=""
              name='itemIntro'
              value={itemData.itemIntro}
              onChange={e=>changeItemData(e)}></textarea>
            </td>
          </tr>
        </tbody>
      </table>

    <div className={styles.btn_div}>
      <button className='btn btn-small' type='button'
      onClick={e=>{regItem()}}>등록</button>
    </div>

   </div>


    </>
  )
}

export default ItemUpdate