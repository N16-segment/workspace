import React, { useState } from "react";

const PersonTest1 = () => {
  const [person, setPerson] = useState({
    name  : '김자바',
    age : 20,
    adress : '울산시'
  });

  return (
    <>
      <div>PersonTest1</div>
      <h3>이름 : {person.name}</h3> <br />
      <h3>나이 : {person.age}</h3> <br />
      <h3>주소 : {person.adress}</h3> <br />

      <button id="aaa" className="bbb" type="button" onClick={(e) => {
        //이벤트 발생 시 실행코드로 작성하는 함수의 매개변수로는
        //이벤트 객체를 전달받을 수 있다.
        //이벤트 객체는 이벤트와 관련된 모든 정보를 
        //객체(여러개)형태로 갖고 있다. 
        //객체접근->key 이름
        console.log(e);
        //e.target-> 이벤트가 발생한 태그 : 많이 사용함
        console.log(e.target);
        //이벤트가 발생한 태그의 type 속성값
        console.log(e.target.type);//button 출력됨
        console.log(e.target.id);//aaa 출력됨
        console.log(e.target.className);//bbb 출력됨
        // setPerson({
        //   ...person,
        //   name : '홍길동',
        // });
      }}>이름을 홍길동으로 변경</button>
      <button type="button" onClick={(e) => {
        setPerson({
          ...person,
          age : 30,
        });

      }}>나이를 30으로 변경</button>
      <button type="button" onClick={(e) => {
        setPerson({
          ...person,
          adress : '서울시'
        });

      }}>주소를 서울시로 변경</button>

    </>
  );
};

export default PersonTest1;
