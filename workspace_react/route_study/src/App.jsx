
import { Link, Route, Routes, useNavigate } from 'react-router-dom'
import './App.css'
import Header from './components/Header'
import Login from './components/Login'
import BoardList from './components/BoardList'
import BoardDetail from './components/BoardDetail'

function App() {
  //useNavigate() hook은 페이지 이동 기능을 제공하는 함수를 리턴.
  const nav = useNavigate();
  //함수를 리턴시켜주는 것이므로 nav(); 소괄호를 넣어주어야 함 
  //nav()가 변수가 아니고 함수 호출식이므로 함수처럼 사용해야한다.
  // use 로 시작하는 hook 을 사용할 땐 무조건 자동완성하자!

  return (
    <>
    {/* 내용이 바뀌지 않는 부분은 라우츠 밖에서 작업한다. */}
    {/* 라우츠 밖에 있으므로 모든 라우트에서 공통적으로 보인게 된다. */}
   <Header />
   {/* 클릭했을때 페이지 이동하려면 링크를 쓰면 된다. */}
   {/* <Link to='/login'>로그인 페이지로 이동</Link>
   <Link to='/join'>회원가입 페이지로 이동</Link> */}
   {/* 링크는 라우터에 있는 페이지로 이동하기 위한 것이므로
        라우터가 미리 만들어져 있어야 한다. */}
    
    <Routes>
      {/* 게시글 목록 페이지 / path는 url을 의미한다. */}
      <Route path='' element={ <BoardList/>}/>

      {/* 게시글 상세 페이지 */}
      {/* detail/:num 에서 num은 변수처럼 쓰면된다. 이름은 마음대로 */}
      {/* 이 방식을 URL 파라미터 방식이라고 한다. */}
      <Route path='/detail/:num/:age' element={ <BoardDetail/>}/>

      {/* 게시글 등록 페이지 */}

      {/* 게시글 수정 페이지 */}

      {/* 로그인 페이지 */}
      <Route path='/login' element={ <Login/>}/>

      {/* 마이페이지 */}
      <Route path='/my-page' element={<div>마이페이지 입니다.</div>}/>
    </Routes>

    {/* 버튼 클릭 시 페이지 이동 */}
    {/* 버튼은 링크태그 쓰지 않고 onClick 사용 */}
    <button type='button' onClick={(e)=>{nav('/my-page');}}>
      마이페이지로 이동</button>





{/* 라우츠(복수형) 컴포넌트 안에 라우트 컴포넌트가 여러개 들어갈 수 있다 */}
  {/* <Routes>
    <Route path='' element={<div>안녕하세요</div>}/>
    <Route path='/login' element={<Login/>}/>
    <Route path='/join' element={<div>회원가입 페이지</div>}/>
    <Route path='*' element={<div>잘못된 페이지입니다.</div>}/>
  </Routes> */}


</>
  
  )
}

export default App
