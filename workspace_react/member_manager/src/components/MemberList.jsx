import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { Link, useNavigate, useParams } from 'react-router-dom';

const MemberList = () => {
  //조회한 회원 목록을 저장할 state 변수
  const[memberList, setMemberList] = useState([]);
  const nav =useNavigate();
  

  useEffect(()=>{
    //실제로 마운트 될때만 실행된다. 
    //리렌더링 될때 재실행하지 않기위해 빈배열을 두번째에 넣어준다.
    //api -> localhost:8080
    //자바주소로 간다.
    axios.get('/api/members')
    //순서를 살펴보면 get로 데이터 보내주고 spring에서 처리하고 그다음 리턴값을 받아오고 then으로 이동한다. 
    .then((res)=>{
      console.log(res.data);
      setMemberList(res.data);
    })
    .catch((error)=>{
      console.log(error);
    });

  }, []);

  return (
    //REACT_MEMBER 테이블에 저장된 모든 회원 정보를 조회하여 
    //MemberList 컴포넌트에 table 형식으로 표현하세요.
    //테이블의 컬럼 : No(행번호), 회원 아이디, 회원명, 회원연락처, 가입일
    <>
    
      <div>회원 가입 목록</div>
      <table border={1}>
        <thead>
          <tr>
            <td>No</td>
            <td>회원 ID</td>
            <td>회원이름</td>
            <td>회원 연락처</td>
            <td>가입일</td>
          </tr>
        </thead>
        
        <tbody>
          {
            //모든 반복문 중에서 map 반복문만 return을 쓸 수 있기 때문에 for문이 아니라 map을 사용한다.
            //반드시 리턴이 되어야 화면에 나타난다.
            memberList.map((member, i) => {
              return(
              <tr key={i}>
                <td>{memberList.length-i}</td>
                {/* <td>{memberList[i].memId}</td> */}
                <td>
                  {/* Link는 a태그랑 디자인이 똑같음 */}
                  {/* 빽틱`${}`을 사용하면 여러가지 문자를 한번에 적용가능 */}
                  <Link to={`/detail/${member.memId}`}>
                  <span>{member.memId}</span></Link>
                  </td>
                {/* <td>
                  <span onClick={(e)=>{
                    nav('/detail');
                  }}>{member.memName}</span>
                  </td> */}
                <td>{member.memName}</td>
                <td>{member.memTel}</td>
                <td>{member.joinDate}</td>
              </tr>
              )
            })
          }
        </tbody>

      </table>
      <button type='button' onClick={(e)=>{nav('/insert')}}>회원등록</button>

    


    </>

    
    
  )
}

export default MemberList