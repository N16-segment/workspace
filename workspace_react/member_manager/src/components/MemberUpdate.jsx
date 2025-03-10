import axios, { AxiosError } from 'axios';
import React, { useEffect, useState } from 'react'
import { Route, useNavigate, useParams } from 'react-router-dom';
import MemberDetail from './MemberDetail';

const MemberUpdate = () => {
  const nav = useNavigate();
  // const params = useParams(); // {memId : 'java'}
  // console.log(params);
  // 실제로 수정해야되는 회원의 아이디
  const {memId} = useParams();

  //수정할 회원의 모든 정보를 저장할 state 변수 - 원래의 데이터
  //여기에서는 UseEffect에서 실행한 내용이 실행되면 재렌더링 되면서 초기값은 빈값이 아니라 setMemeberInfo의 최종값을 갖고 있지만 아래의 새로운 useState는 적용되지 않는 초기값을 갖고있다.

  //수정할 회원의 모든 정보를 저장할 state 변수 - 원래의 데이터
  //+ 수정한 내용을 저장할 변수 => 두가지의 기능을 동시에 만족하는
  const [memberInfo, setMemberInfo] = useState({});

  //input 태그의 값이 변경될 때마다 실행하는 함수
  const changeMemberInfo = (e) => 
    setMemberInfo({
      ...memberInfo,
      [e.target.name] : e.target.value});


  //마운트 시 spring에서 회원정보를 조회하여, 
  // 조회한 데이터를 memberInfo 변수에 저장
  useEffect(()=>{
    axios.get(`/api/members/${memId}`)
    .then((res)=>{
      // 조회한 정보
      // console.log(res.data);
      //조회한 정보를 setMemberInfo 에 저장해준다.
      setMemberInfo(res.data);
     
    })
    .catch((error)=>{console.log(error);})
  }, []);

  console.log(memberInfo);

  //update 기능 실행 함수
  //put은 post랑 동일하다
  const updateMember = ()=>{
    axios.put(`/api/members/${memberInfo.memId}`, memberInfo)
    .then((res)=>{
      alert('회원의 정보가 변경되었습니다.');
      nav(`/detail/${memberInfo.memId}`);
    })
    .catch((error)=>{console.log(error);})
  }

  return (
    <><div>회원 정보 수정</div>
    {/* 원래 있던 회원 정보는 나와야 하므로 {memberInfo.memId} */}
    {/* 밸류는 기존 데이터 */}
    <div>아이디 : {memberInfo.memId}</div>

    <div>이름 : <input type="text" name='memName'
    value={memberInfo.memName} onChange={(e)=>{changeMemberInfo(e)}}/></div>

    <div>비밀번호 : {memberInfo.memPw}</div>

    <div>연락처 : <input type="text" name='memTel'
    value={memberInfo.memTel} onChange={(e)=>{changeMemberInfo(e)}}/></div>

    <div>소개 : <input type="text" name='memIntro'
    value={memberInfo.memIntro} onChange={(e)=>{changeMemberInfo(e)}}/></div>

    <div>가입일 : {memberInfo.joinDate}</div>

<button type='button' onClick={(e)=>{
    updateMember();
}} >수정완료</button>

    
    </>

   
  )
}

export default MemberUpdate