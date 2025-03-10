import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { useNavigate } from 'react-router-dom';

const MemberInsert = () => {
  //입력한 회원의 모든 정보를 저장할 State변수
  //아래 input 태그에서 입력한 모든 정보를 담을 state변수
  const [memberInsert, setMemberInsert] = useState({
    memId : "",
    memName : "",
    memPw : "",
    memTel : "",
    memIntro : "",
    pwConfirm : ""
  });
  const nav = useNavigate();
  //input 태그에 값 입력 시 실행할 함수
    const changrMemberInsert = (e)=>
    setMemberInsert({
      ...memberInsert,
    [e.target.name] : e.target.value});
  
    //가입 버튼 클릭 시 실행 함수
    //axios 실행전, 
    // 즉 자바로 가기전에 실제 작업 전 
    // 데이터가 적합한지 검사해야함-> 데이터 유효성 검사(validation 처리)

    const validateMemberInsert = () => {
      let isValid = true;
      if(memberInsert.memId === ''){
        alert('Id는 필수입력입니다.');
        isValid = false;
    }
    if(memberInsert.memName === ''){
        alert('이름은 필수입력입니다.');
        isValid = false;
    }
    if(memberInsert.memPw !== memberInsert.pwConfirm){
        alert('입력한 비밀번호를 확인하세요');
        isValid = false;
    }
      return isValid;
    }

    const insertMember = () =>{
      //데이터 유효성 검사(validation 처리)
      if(!validateMemberInsert()){
        return;
      }

      axios.post('/api/members', memberInsert)
    .then((res)=>{
      if(res.data !==1){
        alert('알 수 없는 이유로 오류가 발생했습니다.')
        return;
      }
      
        alert(`${memberInsert}님의 가입을 환영합니다.`)
        nav('/');
      
    })
    .catch((error)=>{
      console.log(error);
    });
  }
    
    console.log(memberInsert);

  return (
    <>
    <h3>회원 등록</h3>
    {/* input 태그 안에는 name 값과 value와 onChane 값은 반드시 넣어주어야 한다 */}
    {/* name 은 변수명과 같아야 한다.*/}
    {/* value={위에서 초기값을 ""-> 빈문자로 주면 빈값이 나온다} */}
    {/* onChane={()=>{}} 함수값은 이벤트 발생 시 마다 바뀐다 */}
    <div>아이디 : <input type="text" 
    value={memberInsert.memId} 
    name='memId'
    onChange={(e)=>{changrMemberInsert(e)}}/></div>

    <div>이름 : <input type="text" 
    value={memberInsert.memName} 
    name='memName'
    onChange={(e)=>{changrMemberInsert(e)}}/></div>

    <div>비밀번호 : <input type="password" 
    value={memberInsert.memPw}
    name='memPw' 
    onChange={(e)=>{changrMemberInsert(e)}} /></div>

    <div>비밀번호 확인 : <input type="password" 
    value={memberInsert.pwConfirm}
    name='pwConfirm' 
    onChange={(e)=>{changrMemberInsert(e)}} /></div>

    <div>연락처 : <input type="text"
    name='memTel' 
    value={memberInsert.memTel} onChange={(e)=>{changrMemberInsert(e)}}/></div>

    <div>소개 : <input type="text" 
    value={memberInsert.memIntro}
    name='memIntro' 
    onChange={(e)=>{changrMemberInsert(e)}}/></div>
    <br />
      

    <button type='button' onClick={(e)=>{
      insertMember();
      }}>회원가입</button>

    {/* <button type='button' onClick={(e)=>{nav('/')}}>목록으로 가기</button> */}
    
    </>
   
  )
}

export default MemberInsert