import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';

const BoardInsert = () => {
  const nav = useNavigate();

  const [wirteData, setWriteData] = useState({
    title : ''
    , writer : ''
    , content : ''
  });

  const changeWriteData = (e)=>
    setWriteData({
      ...wirteData,
      [e.target.name] : e.target.value});

      console.log(wirteData);

//글등록 버튼 클릭시 서버의 insert api 실행
  const insertBoard = () => {

    if(wirteData.title === ''){
      alert('제목은 필수입력입니다.');
      return;
    }
    else if(wirteData.writer === ''){
      alert('작성자는 필수입력입니다.')
      return;
    }

    //자바로 url과 매개변수로 데이타 값을 같이 보낸다.
    //-> url은 키값이되고, 매개변수는 밸류값이 된다고 보면된다.
    // 당연히 전달한 데이터는 DB에서도 변경된다.  
    axios.post('api/boards', wirteData)
    .then(()=>{
      // if(res.data !== 1){
      // alert('알수 없는 오류가 발생했습니다.')
        alert(`${wirteData}의 작성이 완료되었습니다.`)
        nav('/');
      // }
      // alert(`${wirteData}의 작성이 완료되었습니다.`)
    })
    .catch((error)=>{console.log(error);});
  } 
    
  
  return (
    <>
    <div>
      <h2>게시글 작성 페이지</h2>

      <div>
        <table border={1}>
          <tbody>
            <tr>
              <td>제목</td>
              <td>
                <input type="text" name='title' 
                value={wirteData.title}
                onChange={(e)=>{changeWriteData(e)}} />
              </td>
            </tr>
            <tr>
              <td>작성자</td>
              <td><input type="text" name='writer' 
                value={wirteData.writer}
                onChange={(e)=>{changeWriteData(e)}} /></td>
            </tr>
            <tr>
              <td>내용</td>
              <td><textarea cols={50} rows={5} type="text" name='content' 
                value={wirteData.content}
                onChange={(e)=>{changeWriteData(e)}} /></td>
            </tr>
          </tbody>
        </table>
        <button type='button' onClick={(e)=>{
          insertBoard();
  }}>글등록</button>

      </div>
      </div></>
  )
}

export default BoardInsert