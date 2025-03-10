import React, { useState } from "react";

const Test2 = () => {
  const [displayText, setDisplayText] = useState("ON");
  const [btnText, setBtnText] = useState("OFF");
  return (
    <>
      <d2>Test2</d2>
      <div className="text">{displayText}</div>
      <button
        type="button"
        onClick={() => {
          setDisplayText(displayText === "ON" ? "OFF" : "ON");
          setBtnText(btnText === "ON" ? "OFF" : "ON");
          // if(displayText === 'ON'){
          //   setThisplayText('OFF');
          // }
          // else{
          //   setThisplayText('ON');
          // }
        }}
      >
        {btnText}
      </button>
    </>
  );
};

export default Test2;
