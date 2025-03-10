import React, { useEffect, useState } from 'react'
import './Axios_5.css'
import axios from 'axios';
const Axios_5 = () => {
  //서버에서 받는 사람 목록 정보를 저장할 state 변수
  const [personList, setPersonList] = useState([]);
  //서버에서 받는 학생 목록 정보를 저장할 state 변수
  const [studentList, setStudentList] = useState([]);

  //서버에서 사람 목록 데이터 가져오는 함수 ->함수선언
  const getPersonList = ()=>{
    axios.get('/api/t5')
    .then((res)=>{
      console.log('통신성공');
      console.log(res.data);
      setPersonList(res.data);
    })
    .catch((error)=>{
      console.log('오류발생!');
    });
  }
  const getStudentList = ()=>{
    axios.get('/api/t6')
    .then((res)=>{
      console.log('통신완료');
      console.log(res.data);
      setStudentList(res.data);
    })
    .catch((error)=>{
      console.log('오류경보!');
    });
  }  

  return (
    <>
    <div>Axios_5</div>
    <table className='t1'>
      {/* table 바로 아래에 콜그룹으로 사이즈를 준다. */}
      <colgroup>
      <col width={'50%'}/>
      <col width={'50%'}/>
      </colgroup>
      <tbody>
        <tr className='t1-tr'>
          {/* 첫번째 버튼 1 내용 */}
          <td>
            {/* 버튼은 인라인 블럭이므로 부모에게 css에서 정렬값(text-align을 준다. */}
            <button type='button' onClick={(e)=>{
              getPersonList();
            }}>버튼1</button>
            
            <table border={1}>
              <thead>
                <tr>
                  <td>이름</td>
                  <td>나이</td>
                  <td>주소</td>
                  </tr>
              </thead>
              <tbody>
                {
                  personList.length === 0
                  ? 
                  <tr>
                    <td colSpan={3}>
                      버튼1을 클릭하면 데이터가 조회됩니다.
                    </td>
                  </tr>
                  :
                  personList.map((person, i)=>{
                    console.log(person);
                    return(
                      //key라는 속성으로 반복되지 않는 내용을 넣어준다.
                      <tr key={i}>
                        <td>{person.name}</td>
                        <td>{person.age}</td>
                        <td>{person.addr}</td>
                      </tr>
                    )
                  })

                }
              </tbody>
            </table>
          </td>

          {/* 두번째 버튼2 내용 */}
          <td>
          <button type='button' onClick={(e)=>{
            getStudentList();
          }}>버튼2</button>

          <table border={1}>
            <thead>
              <tr>
                <td>이름</td>
                <td>국어</td>
                <td>영어</td>
                <td>수학</td>
                <td>총점</td>
              </tr>
            </thead>
            <tbody>
              {/* 자바스크립트 문법을 적용시키려면 {}안에 넣는다. */}
              {
                studentList.length === 0
                ?
                <tr>
                    <td colSpan={5}>
                      버튼2를 클릭하면 데이터가 조회됩니다.
                    </td>
                  </tr>
                  :
                  studentList.map((student, i)=>{
                    console.log(student);
                    return(
                      //key라는 속성으로 반복되지 않는 내용을 넣어준다.
                      <tr key={i}>
                        <td>{student.name}</td>
                        <td>{student.korScore}</td>
                        <td>{student.engScore}</td>
                        <td>{student.mathScore}</td>
                        <td>{student.korScore + student.engScore + student.mathScore}</td>
                      </tr>
                    )
                  })

              }
            </tbody>
          </table>


          </td>
        </tr>
      </tbody>
    </table>
    </>
   
  )
}

export default Axios_5