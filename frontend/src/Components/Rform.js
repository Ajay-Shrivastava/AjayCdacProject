import React, { useState } from 'react'

export default function Rform() {

  const [fname, setfname] = useState("");
  const [lname, setlname] = useState("");
  const [email, setemail] = useState("");
  const [password, setpassword] = useState("");
  const [role, setrole] = useState("");

  const userRegister=(e)=>{
    e.preventDefault()
try{
    const user={fname,lname,email,password,role}
    console.log(user)
    fetch("http://localhost:8080/user/register",{
      method:"POST",
      headers:{"Content-Type":"application/json"},
      body:JSON.stringify(user)
  }).then((result)=>{
    result.json().then((res)=>{
        if(res.email === email){
            sessionStorage.setItem("email" , email );
        }
        if(res.password === password){
            sessionStorage.setItem("password" , password );
        }
    })
  })
  alert("user registration Successfull");
      setfname("");
      setlname("");
      setemail("");
      setpassword("");
      setrole("");
}
catch{
alert("Registration Failed")
}
}

  return (
    <div style={{width:'500px', height:'800px', margin:'auto', display:'table'}}>
    <form class="row g-3">
  <div class="col-md-6">
    <label for="fname" class="form-label">FIRST NAME</label>
    <input type="text" class="form-control" id="fname" name='fname' value={fname} onChange={(event) => {
            setfname(event.target.value);
          }} />
  </div>
  <div class="col-md-6">
    <label for="lname" class="form-label">LAST NAME</label>
    <input type="text" class="form-control" id="lname" name='lname' value={lname} onChange={(event) => {
            setlname(event.target.value);
          }} />
  </div>
  <div class="col-12">
    <label for="email" class="form-label">EMAIL</label>
    <input type="email" class="form-control" id="email" name='email' value={email} onChange={(event) => {
            setemail(event.target.value);
          }} />
  </div>
  <div class="col-12">
    <label for="password" class="form-label">PASSWORD</label>
    <input type="password" class="form-control" id="password" name='password' value={password} onChange={(event) => {
            setpassword(event.target.value);
          }} />
  </div>
  <div class="col-md-4">
    <label for="role" class="form-label">ROLE</label>
    <select id="role" class="form-select" name='role' value={role} onChange={(event) => {
            setrole(event.target.value);
          }} >
      <option selected>Choose...</option>
      <option>CUSTOMER</option>
      <option>SHOPKEEPER</option>
    </select>
  </div>
  <div class="col-12">
    <button type='button' onClick={userRegister} class="btn btn-primary">Sign in</button>
  </div>
</form>
    </div>
    // <div id="shopkeeper">
    //   <form>
    //     <input
    //       type="text"
    //       name="firstName"
    //       id="firstName"
    //       placeholder='Enter First Name'
    //       value={firstName}
    //       onChange={(event) => {
    //         setfname(event.target.value);
    //       }}
    //     />
    //     <br /> <br />
    //     <input
    //       type="text"
    //       name="lastName"
    //       id="lastName"
    //       placeholder='Enter Last Name'
    //       value={lastName}
    //       onChange={(event) => {
    //         setlname(event.target.value);
    //       }}
    //     /> <br /> <br />
    //     <input
    //       type="email"
    //       name="email"
    //       id="email"
    //       placeholder='Enter Email'
    //       value={email}
    //       onChange={(event) => {
    //         setemail(event.target.value);
    //       }}
    //     /> <br /> <br />
    //     <input
    //       type="text"
    //       name="mobile"
    //       id="mobile"
    //       placeholder='Enter Mobile Number'
    //       value={mobile}
    //       onChange={(event) => {
    //         setmobile(event.target.value);
    //       }}
    //     /> <br /> <br />
    //     <input
    //       type="password"
    //       name="password"
    //       id="password"
    //       placeholder='Enter Your Password'
    //       value={password}
    //       onChange={(event) => {
    //         setpass(event.target.value);
    //       }}
    //     /> <br /> <br />
    //     <label htmlFor="">Select Your Role</label>
    //     <select name="role" id="role"
    //       value={role}
    //       onChange={(event) => {
    //         setrole(event.target.value);
    //       }}
    //     >
    //       <option value=""></option>
    //       <option value="CUSTOMER">Customer</option>
    //       <option value="SHOPKEEPER">Shopkeeper</option>
    //     </select> <br /> <br />
    //     <button onClick={handleClick}>SUBMIT</button>
    //   </form>
    // </div>
  )
}
