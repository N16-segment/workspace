
import { Route, Routes } from 'react-router-dom'
import './App.css'
import BoardList from './component/BoardList'
import BoardDetail from './component/BoardDetail'
import BoardInsert from './component/BoardInsert'
import BoardUpdate from './component/BoardUpdate'
import InputTest from './component/InputTest'
import QueryString from './component/QueryString'
import UseEffectTest from './component/UseEffectTest'

function App() {

  return (
    <div className='container'>
  <h1>게시판 프로젝트</h1>
  {/* <InputTest /> */}
  {/* <InputTest copy/> */}
  {/* <UseEffectTest/> */}

     <Routes>

      {/* 자유 게시판 */}
      <Route path='' element={<BoardList/>}></Route>

      {/* 게시판 글작성 페이지 */}
      <Route path='/insert' element={<BoardInsert/>}></Route>
        
      {/* 게시판 상세 정보 페이지 */}
      <Route path='/detail/:boardNum' element={<BoardDetail/>}></Route>

      {/* 게시판 수정 페이지 */}
      <Route path='/update/:boardNum' element={<BoardUpdate/>}></Route>

      {/* 쿼리 스트링 연습 페이지 */}
      <Route path='/test' element={<QueryString/>}></Route>
      {/* 쿼리 스트링 라우트에서는 딱히 적을 것이 없다. */}

     </Routes>

     

    </div>
  )
}

export default App
