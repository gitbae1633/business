import React from "react";

function Addbusiness({ callbackAdd }) {
  return (
    <div>
      <h1>등록하세요!</h1>
      <form
        onSubmit={(e) => {
          e.preventDefault();
          callbackAdd(e);
          //   console.log(e.target.elements.id.value);
          //   console.log(e.target.elements.name.value);
          //   console.log(e.target.elements.phone.value);
        }}
      >
        <label htmlFor="id">id</label>
        <input type="text" id="id" name="id" />
        <label htmlFor="name">name</label>
        <input type="text" id="name" name="name" />
        <label htmlFor="phone">phone</label>
        <input type="text" id="phone" name="phone" />
        <input type="submit" value="등록" />
      </form>
    </div>
  );
}

export default Addbusiness;
