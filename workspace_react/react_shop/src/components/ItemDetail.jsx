import React, { useState } from 'react'
import styles from './ItemDetail.module.css'
import dayjs from 'dayjs';
import axios from 'axios';

const ItemDetail = ({item, setItem, setCnt, cnt}) => {
  //상세 정보 조회 데이터를 저장할 state 변수는 
  //ItemInfo에서 props로 보내고 ItemDetail로 받아와서 사용
     
    const changeItem = (e) => {
      setItem({
        ...item,
        [e.target.name] : e.target.value 
      });
    }

    //수정버튼 눌렀을 때 정보가 입력되는 함수
    const updateItem = () => {
      axios.put('/api/items', item)
      .then(res => {
        alert('수정완료')
        //게시글 목록을 다시 조회한다. 
        // -> 수정된 내용을 조회하기 위해서 itemInfo에 state 변수를 만들어서 리렌더링 시켜서 변경된 데이터를 화면에 띄어준다. 변경된 내용을 props로 받아옴
        setCnt(cnt+1);
      })
      .catch(error=>console.log(error));
    }

  return (
    <>
    {/* 상품 상세 정보 */}
    <div className={styles.detail_div}>
     
      <h3>상품 상세 정보</h3>
       <table className={styles.item_detail_table}>
              <colgroup>
              <col width={'30%'}/>
                <col width={'70'}/>
              </colgroup>
              <tbody>
              <tr>
              <td>상품번호</td>
                  <td>
                    <input className='my-input wide' type="text" 
                    name='itemNum'
                    value={item.itemNum}
                    readOnly={true}/>
                  </td>
                </tr>
                <tr>
                  <td>상품명</td>
                  <td>
                    <input className='my-input wide' type="text" 
                    name='itemName'
                    value={item.itemName}
                    onChange={e=>changeItem(e)}/>
                  </td>
                </tr>
                <tr>
                  <td>상품가격</td>
                  <td>
                  <input className='my-input wide' type="text" 
                  name='itemPrice'
                  value={item.itemPrice}
                  onChange={e=>changeItem(e)}/>
                  </td>
                </tr>
                <tr>
                  <td>판매자</td>
                  <td>
                  <input className='my-input wide' type="text" 
                  name='seller'
                  value={item.seller}
                  readOnly={true}/>
                  </td>
                </tr>
                <tr>
                  <td>상품등록일</td>
                  <td>
                    <input className='my-input wide' type="text" 
                    name='regDate'
                    value={item.regDate ? dayjs(item.regDate).format('YYYY-MM-DD HH:mm:ss') : ''} readOnly={true}/>
                  </td>
                </tr>
                <tr>
                  <td>상품설명</td>
                  <td>
                    <textarea id=""
                    name='itemIntro'
                    value={item.itemIntro}
                    onChange={e=>changeItem(e)}></textarea>
                  </td>
                </tr>
              </tbody>
            </table>
             <div className={styles.btn_div}>
                  <button className='btn btn-small' type='button'
                  onClick={e=>updateItem()}>수정</button>
             </div>
        </div>
  </>
  )
}

export default ItemDetail