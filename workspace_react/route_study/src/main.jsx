import { createRoot } from 'react-dom/client'
import './index.css'
import App from './App.jsx'
import { BrowserRouter } from 'react-router-dom'

//<BrowserRouter>태그 안에 작성된 컴포넌트에는 
//route를 사용할 수 있다.
//route : react 페이지 이동과 같은 효과를 주는 기능
//App컴포넌트안에서 route를 사용하겠다는 말 - 페이지 이동을 하겠다는 뜻
createRoot(document.getElementById('root')).render(
    <BrowserRouter>
    <App />
    </BrowserRouter>
)
