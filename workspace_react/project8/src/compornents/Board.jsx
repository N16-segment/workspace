import React, { useEffect, useState } from "react";
import List from "./List";
import Detail from "./Detail";
import axios from "axios";
import "./Board.css";
//모든 내용이 들어가는 컴포넌트
const Board = () => {
  //게시글 하나의 정보를 담을 스테이트 변수
  const [board, setBoard] = useState({});

  //상세정보가 보일지, 안보일지 결정하는 state 변수
  const [isShow, setIsShow] = useState(false);

  return (
    <>
      {/* <div>Board</div> */}
      <div className="container">
        <div>
          <h3>게시글 목록</h3>
        </div>
        {/* 게시글 내용이 나오는 목록 */}
        <List setBoard={setBoard} setIsShow={setIsShow} />
        {isShow ? <Detail board={board} /> : null}

        <table className="board">
          {/* 게시글 상세내용이 나오는 목록 */}
          <div></div>
        </table>
        
      </div>
    </>
  );
};

export default Board;
