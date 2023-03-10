import React from 'react'

import './Header.css';

export default function Header() {

  const logoutsession = (e) => {
    e.preventDefault()
    sessionStorage.clear();
    window.location.replace("/");
  }

  return (
  <>
    <div id="headdiv">
        <button type='button' class='btn btn-danger' onClick={logoutsession} style={{float:'right', marginRight:'10px', marginTop:'12px'}}>LOGOUT</button>
        <h1>GIFT STORE</h1>
    </div>
    <div id="navdiv">
        <nav>
            <a class="navAncher" href="/">HOME</a>
            <a class="navAncher" href="about.html">ABOUT</a>
            <a class="navAncher" href="categories.html">CATEGORIES</a>
            <a class="navAncher" href="allgifts">ALL GIFTS</a>
            <a class="navAncher" href="/Registration">REGISTER</a>
            <a class="navAncher" href="/Login">LOGIN</a>
            <a class="navAncher" href="contact.html">CONTACT</a>
            <a class="navAncher" href="cart">CART</a>
            <a class="navAncher" href="/Admin">ADMIN</a>
    </nav>
    </div>
    </>
  )
}
