
import './App.css'
import Controller from './compornents/Controller'
import Counter from './compornents/Counter'
import Header from './compornents/Header'
import Lotto from './compornents/Lotto'

function App() {
  //구조분해할당(배열, 객체)
  //배열을 분해해서 안의 데이터를 하나씩 넣어준다.
  // const arr = [1,2,3];
  //배열은 자체적으로 순서가 있으므로 키값을 아무거나 사용해도 된다. a,b,c 로 넣고 변수 생성
  // const [a,b,c] = arr;
  // console.log(a);

  // const person = {
  //   name :'kim',
  //   age : 20,
  //   addr : '울산'
  // };
  // const {name, age} = person;
  // function ppp({name, age}){
  //   console.log(name);
  //   console.log(age);
  // }
//객체에 있는 내용을 구조분해할때 순서가 없으므로 객체명을 그대로 키값으로 써야한다. 그 값을 그대로 넣고 변수 생성
//순서는 상관이 없다. 매개변수로 객체가 넘어온다
  // const{name, age, addr} = person;
  // const{name, addr} = person;
  // const{name, addr, age} = person;
//함수안에서 객체가 넘어오니까 객체으름.키값
  // function aaa(p){
    // console.log(p.name);
  // }

  
    // let major = '회계';
  

  return (
    <>
    {/* 키 = name, 밸류 = react
    원하는 데이터는 밸류로 나타내고 그걸 불러오는게 키 */}
      {/* <Header name={'react'} age={20} major={'major'}/> */}
      {/* 태그안에 있는 aaa도 중괄호 안에 넣을 수 있다. 자바 스크립트에서 html을 사용할때 변수는 {}안에 넣는다. */}
      {/* <div className='aaa'>react</div> */}
      {/* <Counter/> */}
      <Lotto/>
    </>
  )
}

export default App
