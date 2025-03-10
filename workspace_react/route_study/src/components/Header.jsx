import React from 'react'
import './Header.css'
import { Link, useNavigate } from 'react-router-dom'

const Header = () => {
  const nav = useNavigate();

  return (
    <div className='header'>
      <div>
        {/* 게시판을 누르면 링크가 걸려있는 페이지로 이동한다. */}
        {/* to 에 적어주는 것이 바꾸고자 하는 url이다. */}
        {/* route의 주소를 직접 치든지, Link 로 url을 요청하든지,
        모든 요청은 url로 바꾸게 된다. */}
        {/* 링크는 라우터에 있는 페이지로 이동하기 위한 것이므로
        라우터가 미리 만들어져 있어야 한다. */}
        {/* 링크태그는 html에서 a태그와 같은 기능이다. */}
        <Link to=''>게시판</Link>
        </div>
      <div>
        {/* 페이지 이동하는 두가지 방법 Link 와 useNavigate */}
        <span>
        <Link to='/login'>LOGIN</Link>
          </span>
          {/* join 글자 클릭 시 로그인 페이지로 이동 */}
        <span onClick={(e)=>{nav('/login');}}>JOIN</span>
      </div>
    </div>
  )
}

export default Header