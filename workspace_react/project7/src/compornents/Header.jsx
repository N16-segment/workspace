import React from "react";
//매개변수에서 함수로 받아온다는 느낌
// const Header = (props) => {
  //객체를 가져온다.
  // console.log(props);
  //객체에 있는 내용을 키를 사용해서 불러온다.
  // console.log(props.name);
  // console.log(props.age);

const Header = ({name, age, major}) => {
  //객체를 가져온다.
  console.log(name);
  //객체에 있는 내용을 키를 사용해서 불러온다.
  console.log(age);
  console.log(major);

  return (
    <>
      <div>Header</div>
    </>
  );
};

export default Header;
