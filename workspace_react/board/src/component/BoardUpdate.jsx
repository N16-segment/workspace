import axios from 'axios';
import dayjs from 'dayjs';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom'

const BoardUpdate = () => {
  const nav = useNavigate();
  const {boardNum} = useParams();
  const [boardInfo, setBoardInfo] = useState({});

  const changeBoardInfo = (e)=>
    setBoardInfo({
      ...boardInfo,
      [e.target.name] : e.target.value});

   //마운트시 게시글 정보를 조회해서 boardInfo 에 저장해줘야 함
   useEffect(()=>{
    axios.get(`/api/boards/${boardNum}`)
    .then((res)=>{
      setBoardInfo(res.data);
    })
    .catch((error)=>{console.log(error);});
   }, []);   
   
   console.log(boardInfo);

   //update 기능 실행 함수 -> put은 post랑 동일
   const updateBoard = () => {
    axios.put(`/api/boards/${boardInfo.boardNum}`, boardInfo)
    .then((res)=>{
      alert('게시글이 수정되었습니다.');
      nav(`/detail/${boardInfo.boardNum}`);
    })
    .catch((error)=>{console.log(error);});
   }

  return (
    <>
    <div>
      <h2>게시판 수정 페이지</h2>

      <table border={1}>
              <tbody>
                <tr>
                  <td>작성일</td>
                  <td>{dayjs(boardInfo.regDate).format('YYYY-MM-DD HH:mm:ss')}</td>
                  <td>작성자</td>
                  <td>{boardInfo.writer}</td>
                </tr>
                <tr>
                  <td>제목</td>
                  <td colSpan={3}>
                    <input type="text" name='title'
                      value={boardInfo.title} onChange={(e)=>{changeBoardInfo(e)}}/>
                  </td>
                </tr>
                <tr>
                  <td>내용</td>
                  <td colSpan={3}>
                    <input type="text" name='content'
                      value={boardInfo.content} onChange={(e)=>{changeBoardInfo(e)}}/>
                  </td>
                </tr>
              </tbody>
            </table>

            <button type='button' onClick={(e)=>{nav('/');}}>뒤로가기</button>
            <button type='button' onClick={(e)=>{
              updateBoard();
            }}>수정</button>
      
      </div>
    </>
   
  )
}

export default BoardUpdate