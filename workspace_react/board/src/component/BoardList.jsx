import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useSearchParams } from 'react-router-dom';
import styles from './BoardList.module.css'
import dayjs from 'dayjs';

const BoardList = () => {
  //조회한 게시글 목록 데이터를 저장할 State변수
  const [boardList, setBoardList] = useState([]);
  const nav =useNavigate();

  const [data, setData] = useState({
    age : '',
    name : ''
  });

  const changeData = (e) => {
    setData({
      ...data,
      [e.target.name] : e.target.value 
    })
  }
  

  //서버에서 게시글 목록 받아오기
  useEffect(()=>{
    axios.get('/api/boards')
    .then((res)=>{
      console.log(res.data);
      setBoardList(res.data);
    })
    .catch((error)=>{console.log(error);});
  },[]);

  //검색창에 입력한 데이터를 저장할 변수 - select태그와 input태그 안의 두가지
  const [searchData, setSearchData] = useState({
    searchKeyword : 'TITLE',
    searchValue : ''
  }); 

  //검색창 내용 변경 시 실행되는 함수
  const changeSearchData = (e) => {
    setSearchData({
      ...searchData,
        [e.target.name] : e.target.value 
    })
  }

  console.log(searchData);

  //검색 버튼 클릭 시 실행 함수
  const searchList = () => {
    axios.get(`/api/boards?searchKeyword=${searchData.searchKeyword}&searchValue=${searchData.searchValue}`)
    .then(res => setBoardList(res.data))
    .catch(error=>console.log(error));
  }

  return (
    <>
    <div>
      <h2>자유게시판</h2>

<div>
  <select value={searchData.searchKeyword} name='searchKeyword' 
          onChange={e=>changeSearchData(e)}>
    <option value="TITLE">제목</option>
    <option value="WRITER">작성자</option>
  </select>
    <input type="text" name='searchValue' value={searchData.searchValue} 
           onChange={e=>changeSearchData(e)}/>
    <button type='button' onClick={e=>searchList()}>검색</button>
</div>

<div>
  
  <table className={styles.list}>
    <thead>
      <tr>
        <td>No</td>
        <td>제목</td>
        <td>작성자</td>
        <td>작성일</td>
        <td>조회수</td>
      </tr>
    </thead>

    <tbody>
      {
        boardList.length === 0 
        ?
        <tr>
          <td colSpan={5}>등록된 게시글이 없습니다.</td>
        </tr>
        :
        // null
        boardList.map((board, i)=>{
          return(
          <tr key={i}>
            <td>{boardList.length - i}</td>
            {/* 쿼리로 조회한 데이터만 board.~~ 가져오기 가능 */}
            <td onClick={(e)=>{nav(`/detail/${board.boardNum}`);}}>{board.title}</td>
            {/* <td onClick={(e)=>{nav(`/detail/${boardList[i].boardNum}`);}}>{board.title}</td> */}
            <td>{board.writer}</td>
            <td>{dayjs(board.regDate).format('YYYY년 MM월 DD일')}</td>
            <td>{board.readCnt}</td>
          </tr>
          )
        })
      }
    </tbody>
    
  </table>

  <button type='button' onClick={(e)=>{nav('/insert');
  }}>글쓰기</button>

  {/* 나이 이름 입력값을 Query String 방식으로 */}
  {/* 버튼 클릭 시 /test url 로 전달하세요. */}
  <div>Query String 실습</div>
  <div>나이 : <input type="text" name='age' value={data.age} onChange={e=>changeData(e)}/></div>
  <div>이름 : <input type="text" name='name' value={data.name} onChange={e=>changeData(e)}/></div>
  <button type='button' onClick={e=>nav(`/test?age=${data.age}&name=${data.name}`)}>Query String 실행</button>

</div>

      </div>
    </>
  )
}

export default BoardList