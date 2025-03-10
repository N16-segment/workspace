import './App.css'
import './common.css'
import { Route, Routes } from 'react-router-dom'
import ItemInfo from './components/ItemInfo'
import ItemOrder from './components/ItemOrder'
import OrderList from './components/OrderList'
import ItemUpdate from './components/ItemUpdate'
import Header from './components/Header'

function App() {
  //falsy : false로 판단하는 내용
  //null, undefined, 0, '' -> falsy한 데이터들
  
  //truthy : falsy한 데이터 빼고 전부. 
  //''빈문자 제외 어떠한 문자도 참으로 판단해 버린다. 출력된다.
  //0이 아닌 모든 숫자는 true로 판단해서 아래 콘솔이 출력된다.
  //[], {} 모두 true로 판단
  const a = true;
  const b = false;
  console.log(a && b); 
  //출력은 false로 나온다. 둘다 만족해야 true가 출력
  const data1 = '';
  const data2 = 'python';
  console.log(data1 && data2); 
  //빈문자->falsy한 데이터이므로 뒤는 보지 않는다.
  console.log(data1 || data2); //python 
  //자바는 침과 거짓이 나온다면, 
  //자바스크립트는 참과 참에서도 마지막에 불러오는 데이터를 출력
 

  return (
    <>
      <div className='container'>
        <Header/>

        <Routes>
  
          {/* 상품정보 페이지*/}
          <Route path='' element={<ItemInfo/>}></Route>
  
          {/* 상품등록 페이지*/}
          <Route path='/reg-item' element={<ItemUpdate/>}></Route>
  
          {/* 주문하기 페이지*/}
          <Route path='/order' element={<ItemOrder/>}></Route>
  
          {/* 주문목록 페이지*/}
          <Route path='/order-list' element={<OrderList/>}></Route>
          
        </Routes>
      </div>
    </>
  )
}

export default App
