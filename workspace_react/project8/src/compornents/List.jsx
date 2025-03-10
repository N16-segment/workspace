import React, { useEffect, useState } from "react";
import "./Board.css";
import axios from "axios";

//부모인 Board 컴포넌트에서 자식인 List에 데이터를 전달하기위해 props를 써야하는데 모두 받지 않고 구조분해할당으로 호출해서 사용할 내용만 받는다. 
//구조분해할당으로 받는 문법 보낼 데이터명과 동일하게 작성하고 {}안에 넣는다.
const List = ({setBoard, setIsShow}) => {
  //서버에서 받아오는 게시글 목록 데이터를 저장할 스테이트 변수
    const[boardList, setBoardList] = useState([{
      num : 0,
      title : '제목입니다',
      name : '',
      cnt : 0
    }]);
    //미리 그림을 그려놓고 데이터를 다 받아온 다음 마지막에 실행하기 위해 useEffect를 사용한다.
    //시간절약을 위해서 
    //(()=>{}, [])에서 '[]'의존성배열이 없으면 그림 다 그린후 (마운트 컴포넌트가 리렌더 될때) 계속 실행되므로 두번째 매개변수로 빈 의존성 배열을 넣는다.
    //서버에 있는 자료를 받아오기만 하면 되므로 get을 쓴다. post는 자료를 넘겨주고 받아오는 것
      useEffect(()=>{
        axios.get('/api/getBoardList')
        .then((res)=>{
          console.log(res.data);
          setBoardList(res.data);
        })
        .catch((error)=>{
          console.log('오류발생');
        });
      }, []);


  return (
    // 게시글 목록이 나오는 영역
    <>
      <div>

        <table className="list-table">
          {/* 행 너비 고정하는 태그 colgroub - col */}
          <colgroup>
          <col width={'10%'}/>
          <col width={'*%'}/>
          <col width={'20%'}/>
          <col width={'20%'}/>
          </colgroup>

          <thead>
            <tr>
              <td>No</td>
              <td>제목</td>
              <td>작성자</td>
              <td>조회수</td>
            </tr>
          </thead>
          {/* 들고 온 데이터만큼 반복
          맵은 반복하면서 리턴할 수 있다. */}
          <tbody>
              {
                boardList.map((board, i)=>{
                  return(
                    <tr key={i}>
                      <td>{boardList.length - i}</td>
                      <td>
                        <span onClick={(e)=>{
                          //클릭한 제목의 게시글에서 글번호를 찾아서 -> board.boardNum
                          //boardList 에 저장된 게시글 목록 중 -> board(게시글 하나)
                          //글번호가 일치하는 게시글 정보를 검색
                          //board.boardNum;

                          for(let i = 0 ; i < boardList.length ; i++){
                            if(boardList[i].boardNum == board.boardNum){
                              setBoard(boardList[i]);
                            }

                          }
                          setIsShow(true);
                        }}>{board.title}</span>
                        </td>
                      <td>{board.writer}</td>
                      <td>{board.readCnt}</td>
                    </tr>
                    )
                })
              }
            </tbody>

        </table>
        
      </div>
    </>
  );
};

export default List;
