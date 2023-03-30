import React, { useState } from "react";
import Addbusiness from "./Addbusiness";

function Business() {
  const [datas, setDatas] = useState([
    {
      id: "",
      name: "",
      phone: "",
    }, // state값을 변경하면 component가 실행된다.
  ]);
  const addData = async function (e) {
    setDatas({
      [e.target.elements.id.name]: e.target.elements.id.value,
      [e.target.elements.name.name]: e.target.elements.name.value,
      [e.target.elements.phone.name]: e.target.elements.phone.value,
    });
    // console.log(`id: ${id}, name: ${name}, phone: ${phone}`); // 사용 X
    try {
      const response = await fetch(`/api/business/`, {
        method: "post",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify(datas),
      });

      if (!response.ok) {
        throw `${response.status} ${response.statusText}`;
      }

      const json = await response.json();
      if (json.result !== "success") {
        throw json.message;
      }
      // json.data
      // datas
      setDatas(json.data, ...datas); //전개연산자(...)
    } catch (err) {
      console.error(err);
    }
  };

  return (
    <div>
      <Addbusiness callbackAdd={addData} />
    </div>
  );
}

export default Business;
