
import axios from 'axios';
import dayjs from 'dayjs';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';
import styles from './BordDetail.module.css'

const BoardDetail = () => {
  const nav = useNavigate();
  const {boardNum} = useParams();

  //조회한 상세 정보를 저장할 state 변수
  const [board, setBoard] = useState({});

  //서버에서 정보 조회
  useEffect(() => {
    axios.get(`/api/boards/${boardNum}`)
    .then((res) => {
      console.log(res.data);
      setBoard(res.data);
    })
    .catch((error) => {console.log(error);});
  }, []);

  //게시글 삭제
  const deleteBoard = () => {
    const result = confirm('삭제할까요?');

    if(!result){
      return ;
    }

    axios.delete(`/api/boards/${boardNum}`)
    .then((res) => {
      alert('삭제 완료');
      nav('/');
    })
    .catch((error) => {console.log(error);});
  }

  return (
    <div className={styles.detail_container}>
      <div className='table-div'>
        <table className={styles.detail_table}>
          <colgroup>
            <col width={'10%'}/>
            <col width={'*'}/>
            <col width={'10%'}/>
            <col width={'15%'}/>
            <col width={'10%'}/>
            <col width={'15%'}/>
          </colgroup>
          <tbody>
            <tr>
              <td>작성일</td>
              <td>
                {dayjs(board.regDate).format('YYYY-MM-DD HH:mm:ss')}
              </td>
              <td>작성자</td>
              <td>{board.writer}</td>
              <td>조회수</td>
              <td>{board.readCnt}</td>
            </tr>
            <tr>
              <td>제목</td>
              <td colSpan={5} className={styles.left_text}>
                {board.title}
              </td>
            </tr>
            <tr>
              <td>내용</td>
              <td colSpan={5} className={styles.left_text}>
                {board.content}
              </td>
            </tr>
          </tbody>
        </table>
      </div>
      <div className={styles.btn_div}>
        <button type='button' onClick={(e) => {nav('/')}}>목록가기</button>
        <button type='button' 
                onClick={(e) => {nav(`/update/${board.boardNum}`)}}>수정</button>
        <button type='button' onClick={(e) => {deleteBoard()}}>삭제</button>
      </div>
      <div className={styles.reg_reply_div}>
        <input type="text" placeholder='작성자'/>
        <input type="text" placeholder='댓글 내용 입력'/>
        <button type='button'>댓글등록</button>
      </div>
      <div className='reply-list-div'>
        <div className={styles.reply}>
          <span>kim</span>
          <span>2025-10-10</span>
          <div>
            <p>댓글 내용입니다~</p>
            <button type='button'>삭제</button>
          </div>
        </div>
      </div>
    </div>
  )
}

export default BoardDetail