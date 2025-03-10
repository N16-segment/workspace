import "./Test3.css";
import React, { useState } from "react";

const Test3 = () => {
  //보이는 상태
  const[isShow, setIsShow] = useState(true);
  const[btnText, setBtnText] = useState('광고닫기');

  return (
    <>
      <div>Test3</div>
      <button type="button" onClick={()=>{
        setIsShow(!isShow);//최초에는 true가 들어가 있다. -> 버튼시작 전
        //버튼 누르면 변수값이 바뀐다. !isShow -> false 
        //state 변경함수가 실행되면 변수가 선언된 컴포넌트가 리렌더링 되며 
        //변수의 값은 초기화 되지 않고, 마지막 데이터를 저장하고 있다.
        setBtnText(btnText === '광고닫기' ? '광고보기' : '광고닫기');
      }}>{btnText}</button>

        {/* 자바스크립트를 사용하기 위해서 {} -> 중괄호를 쓴다. */}
        
      {//삼항연산자 -> 트루니? 그럼 보여줘, 아님 블랭크, isShow = true ? 줄임 
        isShow ?  <div className="ad">오늘 구매하시면 30% SALE!!</div> : '' //또는 null을 넣는 것이 좋다. -> 일정한 값을 줘야하므로!
      }
     

    </>
  );
};

export default Test3;
