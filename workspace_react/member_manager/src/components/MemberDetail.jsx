import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate, useParams } from 'react-router-dom';

const MemberDetail = () => {
  //상세정보를 저장할 State변수()안에는 최종타입을 초기값으로 넣어준다.
  //모를 경우 포스트맨에서 불러온 정보를 확인하고 [], {} 에 맞춰서 넣어주면 된다.
  const [memberInfo, setMemberInfo] = useState({});
  //url에서 데이터를 가져가는 걸 url parameter 라고 한다.
  //Url Parameter 데이터 받기. 객체타입
  // const params = useParams();
  // console.log(params.memId);
  //위의 방법대신 아래처럼 구조분해할당으로 바로 쓸 수 있도록 한다.
    const {memId} = useParams();
    const nav = useNavigate();
  
  //상세정보 가져오기
  useEffect(()=>{
    axios.get(`/api/members/${memId}`)
    .then((res)=>{
      console.log(res.data);
      setMemberInfo(res.data);
    })
    .catch((error)=>{console.log(error)});
  }, []);

  //회원 삭제 함수
  //alert는 확인만 나오고, confirm은 확인과 취소가 같이 나온다.
  const deleteMember = () => {
    //confirm : 확인 -> true
    //confirm : 취소 -> false
    // const result = confirm('정말 삭제할까요?');
    //취소 누르면 하지마세요~
      if(!confirm('정말 삭제할까요?')){
        return;
    }
    // alert(result);
    axios.delete(`/api/members/${memId}`)
    .then((res)=>{
      alert('회원이 삭제 되었습니다.')
      nav('/');
    })
    .catch((error)=>{console.log(error);})
  }
    return (
    <>
    <div>회원 상세 정보 페이지</div>
    <div>아이디 : {memberInfo.memId}</div>
    <div>이름 : {memberInfo.memName}</div>
    <div>비밀번호 : {memberInfo.memPw}</div>
    <div>연락처 : {memberInfo.memTel}</div>
    <div>소개 : {memberInfo.memIntro}</div>
    <div>가입일 : {memberInfo.joinDate}</div>

{/* nav를 쓸때는 '/'를 넣어줘야 한다. */}
{/* 그러면 App에 있는 route에 있는 path=''로 이동한다. */}
    <button type='button' onClick={(e)=>{nav('/')}}>목록으로 가기</button>

    <button type='button' onClick={(e)=>{
      deleteMember();
    }}>회원 삭제</button>
{/* 여기서 보내는 {memberInfo.memId}가 밸류값이 된다. */}
  <button type='button' onClick={(e)=>{nav(`/update/${memberInfo.memId}`)}}>회원수정</button>

    </>
   
  )
}

export default MemberDetail