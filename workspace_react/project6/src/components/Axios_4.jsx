import axios from 'axios'
import React, { useEffect, useState } from 'react'

const Axios_4 = () => {
  //서버에서 넘어오는 데이터를 저장하기 위한 state 변수 생성
  //배열이 넘어오니까 빈배열로 초기값 저장해준다.
  //초기값을 최종적으로 받아오는 자료형에 맞게 넣어줘야 실행된다.
  const [personList, setPersonList] = useState([]);

  useEffect(()=>{
    axios.get('/api/t5')
    .then((res)=>{
      console.log('통신성공');
      console.log(res.data);
      setPersonList(res.data);
    })
    .catch((error)=>{
      console.log('통신실패');
    });
  }, [])  

  return (
    <>
    <div>Axios_4</div>
    <table border={1}>
      <thead>
        <tr>
          <td>이름</td>
          <td>나이</td>
          <td>주소</td>
        </tr>
      </thead>

      <tbody>
        {/* html 태그 기능은 {}안에 넣고 작성 */}
        {
          personList.map((person, i)=>{
            console.log(person);
            return(
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
    </>
   
  )
}

export default Axios_4