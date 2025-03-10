
import { Route, Routes } from 'react-router-dom'
import './App.css'
import MemberList from './components/MemberList'
import MemberDetail from './components/MemberDetail'
import MemberInsert from './components/MemberInsert'
import MemberUpdate from './components/MemberUpdate'

function App() {

  return (
    <>
      <div>
        <h1>회원관리 프로그램</h1>
        </div>

        <Routes>
          {/* 회원 목록 페이지 */}
          {/* '' : localhost:5173 -> restful한  표현*/ }
          {/* '/' : localhost:5173/ */}
          {/* / 가 있든 없든 둘다 동작한다 */}
          <Route path='' element={<MemberList/>}></Route>

          {/* 회원 상세 정보 페이지 */}
          {/* REST에 맞출 필요가 없다. REST는 데이터를 가져온다고 보면 여기서는 간단하게 화면만 이동하는 것이므로 */}
          {/* MemberDetail 컴포넌트에 (path=) url을 가져간다. */}
          <Route path='/detail/:memId' element={<MemberDetail/>}></Route>

          {/* 회원 정보 등록 페이지 */}
          <Route path='/insert' element={<MemberInsert/>}></Route>

          {/* 회원 정보 수정 페이지 */}
          <Route path='/update/:memId' element={<MemberUpdate/>}></Route>
          
        </Routes>
    </>
  )
}

export default App
