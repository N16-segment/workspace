import React, { useState } from 'react'

const InputTest = () => {
  {/* 배열은 데이터를 순번으로 저장하지만, 객체는 name 같은 키로 저장하므로  */}
  {/* 많은 데이터를 (수정하고) 저장하기에는 배열보다는 객체의 형태가 좋다. */}
  const [data, setData] = useState({
    id : '',
    age : '',
    name : ''
  });

  const changeData = (e) =>{
    setData({
      ...data,
      [e.target.name] : e.target.value
    })
  }

//키는 변수를 사용할 수 없다.
// const person = {
//   kor : 90,
//   math : 100
// }
// const a = 'kor';
//키가 대괄호 안에 들어가면 변수로 사용이 가능하므로  
//키값에 따라서 변하는 이벤트 변수를 [e.target.name] 문법으로 []안에 넣어준다.
//   person.kor; 90
//   person['kor'] 90
//   person[a] kor 

  return (
    <>
    <div>InputTest</div>
   
    <div>
      id : <input type="text" name='id' onChange={(e)=>{
        //input 태그에 입력한 값을 data 변수에 저장
        setData({//객체의 내용을 나타내기 위해 {} 안에 넣어준다. ...data가 모든 객체의 내용
          ...data,
          id : e.target.value 
        });
      }} />
    </div>

    <div>
      age : <input type="text" name='age' onChange={(e)=>{
        //모든 데이타 중에서 나이만 키보드로 변경한 값으로 저장하겠다.
        setData({
          ...data,
          age : e.target.value
        });
      }}/>
    </div>


    <div>
      name : <input type="text" name='name' onChange={(e)=>{changeData(e)}}/>
    </div>
   
    </>
  //const a = [1,2,3];
  //...a; = 1, 2, 3
  //a; = [1, 2, 3]
  //const b = [5, 6, a];
  //b; // [5, 6, [1, 2, 3]]
  //const b = [5, 6, ...a];
  //b; // [5, 6, 1, 2, 3]

  //const c = {
  //name ; 'kim',
  //age : 20
  //}

  )
}

export default InputTest