import React, { useState } from "react";

const Input_5 = () => {
  const [member, setMember] = useState({
    name : '',
    email : '',
    password : '',
    major : '',
    gender : 'femail',
    intro : ''
  });

  const changeMemberInfo = (e) => {
    setMember({
      ...member,
      [e.target.name] : e.target.value
    });
  };

  return (
    <>
      <h3>다음과 같은 화면을 구성해보세요.</h3>
      이름 : <input type="text" name="name" value={member.name} onChange={(e)=>{
      changeMemberInfo(e);
    }}/> <br />

      이메일 : <input type="text" name="email" value={member.email} onChange={(e)=>{
      changeMemberInfo(e);
    }}/> <br />

      비밀번호 : <input type="password" name="password" value={member.password} onChange={(e)=>{
      changeMemberInfo(e);
    }}/> <br />

      학과 : <select type="text" name="major" value={member.major} onChange={(e)=>{
      changeMemberInfo(e);
    }}>
      <option value="">학과를 선택하세요</option>
      <option value="국어국문과">국어국문과</option>
      <option value="건축공학과">건축공학과</option>
      <option value="기계공학과">기계공학과</option>
      </select> <br />

      성별 : 
      <input type="radio" name="gender" value='mail'
      checked={member.gender === 'mail'} onChange={(e)=>{
      changeMemberInfo(e);
    }}/>남자
      <input type="radio" name="gender" value='femail' 
      checked={member.gender === 'femail'} 
      onChange={(e)=>{
      changeMemberInfo(e);
    }}/>여자<br />

      자기소개 : <textarea cols="50" rows="5" name="intro" value={member.intro} onChange={(e)=>{
      changeMemberInfo(e);
    }}/> <br />
    <hr />
    <h3>입력정보</h3>

<div>이름 : {member.name}</div>
<div>이메일 : {member.email}</div>
<div>비밀번호 : {member.password}</div>
<div>학과 : {member.major}</div>
<div>성별 : {member.gender}</div>
<div>자기소개 : {member.intro}</div>


    </>
  );
};

export default Input_5;
