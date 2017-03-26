<#include "header.ftl">

	<link href='http://fonts.googleapis.com/css?family=Lato' rel='stylesheet' type='text/css'>
  <link rel="stylesheet" href="http://localhost:4567/edit.css">

<form id="contact-form" method="post" action="/edit">
  <p><label>ID</label> : ${card.getid()}
    <input type="hidden" name="id" value="${card.getid()}" required></p>
  <p><label>Name</label> :
    <input type="text" name="name" minlength="3" value="${card.getname()}" required></p>
  <p><label>Address </label> :
    <input type="text" name="address"  minlength="3" value="${card.getaddress()}" required></p> 
 <p><label>Company Name</label> :
    <input type="text" name="companyname"  minlength="3" value="${card.getcompanyname()}" required></p>
  <p><label >Contact</label> :
    <input type="text" name="contact" minlength="3" value="${card.getcontact()}" required></p>

  <p><label>E-mail address</label>  :
<input type="email" name="email" value="${card.getemail()}" required>
  </p>
  <p><button type="submit">
      <svg version="1.1" class="send-icn" xmlns="http://www.w3.org/2000/svg" xmlns:xlink="http://www.w3.org/1999/xlink" x="0px" y="0px" width="100px" height="36px" viewBox="0 0 100 36" enable-background="new 0 0 100 36" xml:space="preserve">
        <path d="M100,0L100,0 M23.8,7.1L100,0L40.9,36l-4.7-7.5L22,34.8l-4-11L0,30.5L16.4,8.7l5.4,15L23,7L23.8,7.1z M16.8,20.4l-1.5-4.3
	l-5.1,6.7L16.8,20.4z M34.4,25.4l-8.1-13.1L25,29.6L34.4,25.4z M35.2,13.2l8.1,13.1L70,9.9L35.2,13.2z" />
      </svg>
      <small>Save</small>
    </button>
</form>

<small class='website'>Form credits to <a href='http://www.erlen.co.uk/' target='_blank'>erlen.co.uk</a></small>
	<p>&copy; CALLING CARD. All rights reserved. | Photos from <a href="http://github.com/coe11-ustp-cea">Github.com</a> | Credits to:<a href="http://templated.co" rel="nofollow">TEMPLATED</a>.</p>

<#include "javascript.ftl">
</body>

</html>