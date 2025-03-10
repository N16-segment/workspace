import axios from "axios";
import React, { useEffect, useState } from "react";

const Axios_8 = () => {
  //모든 입력값을 저장할 state 변수 
  const [table, setTable] = useState({
    food : '',
    amount : 1,
    extra : '토핑',
    request : '',
    date : ''
  });

  console.log(table);

  //모든 입력값이 변경될때마다 실행시킬 함수
  const getChangeTable = (e)=>{
    //table 변수의 변경 => setTaable();
    setTable({
      ...table,
      [e.target.name] : e.target.value
    });
  };

  //전송버튼 클릭시 서버로 데이터를 보내는 기능의 함수
  const sendData = ()=>{
    axios.post('/api/t10', table)
    .then((res)=>{
      alert('서버로 데이타를 전송했습니다.');
    })
    .catch();
  }

  return (
    <>
      <div>Axios_8</div>

      <table>
      <colgroup>
      <col width={'25%'}/>
      <col width={'*'}/>
      </colgroup>
       <tbody>
          {/* 음식선택 */}
          <tr>
            <td>음식선택</td>
            <td>
              <select name="food" value={table.food} onChange={(e)=>{
                getChangeTable(e);
              }}>
                <option value="" >선택</option>
                <option value="치킨">치킨</option>
                <option value="피자">피자</option>
                <option value="족발">족발</option>
              </select>
            </td>
          </tr>
          {/* 수량 */}
          <tr>
            <td>수량</td>
            <td>
              <input type="number" name="amount" value={table.amount} onChange={(e)=>{getChangeTable(e);}}/>
            </td>
          </tr>
          {/* 추가선택 */}
          <tr>
            <td>추가선택</td>
            <td>
              <input type="radio" name="extra" value={"토핑"} 
              checked={table.extra ==='토핑'} onChange={(e)=>{getChangeTable(e);}}/>토핑추가
              <input type="radio" name="extra" value={"음료"} 
              checked={table.extra ==='음료'} onChange={(e)=>{getChangeTable(e);}}/>음료추가
              <input type="radio" name="extra" value={"공기밥"} 
              checked={table.extra ==='공기밥'}onChange={(e)=>{getChangeTable(e);}}/>공기밥추가
            </td>
          </tr>
          {/* 요청사항 */}
          <tr>
            <td>요청사항</td>
            <td>
              <textarea name="request" rows={5} cols={40} value={table.request}onChange={(e)=>{getChangeTable(e);}}>
              </textarea>
            </td>
          </tr>
          {/* 주문일시 */}
          <tr>
            <td>주문일시</td>
            <td>
              <input name="date" type="date" value={table.date} onChange={(e)=>{getChangeTable(e);}}/>
            </td>
          </tr>
       </tbody>
      </table>
      {/* 버튼 -> 테이블안에 넣으려면 tr태그에 td로 감싸주기 아니면 밖으로 빼자, 실수하지 말기!*/}
      <div className="btn-div">
            <button type="button" onClick={(e)=>{
              sendData();
            }}>전송</button>
          </div>
    </>
  );
};

export default Axios_8;
