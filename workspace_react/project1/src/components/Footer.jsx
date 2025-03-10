function Footer (){
  return (
    <>
    <div>footer</div>
    <button type='button' onClick={()=>{
      console.log('버튼 클릭!');
    }}>버튼1</button>

    <button type='button' onMouseEnter={()=>{
      console.log('5');
    }}>버튼2</button>

    <input type="test" onChange={()=>{
      alert('111');
    }}></input>
    </>
  )
}

export default Footer