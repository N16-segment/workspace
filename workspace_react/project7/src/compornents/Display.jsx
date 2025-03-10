import React, { useState } from "react";

const Display = (props) => {
  
  return (
    <>
      <div>Display</div>
      <p>현재 카운트 : </p>
      <h2>{props.cnt}</h2>
    </>
  );
};

export default Display;
