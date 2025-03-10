import React, { useState } from "react";
import "./Board.css";
//props 구조분해할당 문법 동일한 이름의 변수명으로 필요한 데이터만 받을 수 있다{매개변수명}안에 넣기
const Detail = ({board}) => {
 
  return (
    // 게시글 상세정보 테이블이 나오는 영역
    <>
      <div>
        {/* <div>Detail</div> */}
        <table className="detail-table">
          <colgroup>
          <col width={'20%'}/>
          <col width={'30%'}/>
          <col width={'20%'}/>
          <col width={'30%'}/>
          </colgroup>

          <tbody>
            <tr>
              <td>글번호</td>
              <td>{board.boardNum}</td>
              <td>작성자</td>
              <td>{board.writer}</td>
            </tr>
            <tr>
              <td>글제목</td>
              <td>{board.title}</td>
              <td>조회자</td>
              <td>{board.readCnt}</td>
            </tr>
            <tr>
              <td>글내용</td>
              <td colSpan={3}>{board.content}</td>
            </tr>
          </tbody>

        </table>
      </div>
      
    </>
  );
};

export default Detail;
