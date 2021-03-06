<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>${title}</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900" rel="stylesheet" />
<link href="default.css" rel="stylesheet" type="text/css" media="all" />
<link href="fonts.css" rel="stylesheet" type="text/css" media="all" />


<!--[if IE 6]><link href="default_ie6.css" rel="stylesheet" type="text/css" /><![endif]-->

</head>
<body>
<div id="header" class="container">
	<div id="logo">
		<a href="/"><img src="images/aja_logo.png" height="80" width="150"alt="" class="image image-logo"/></a>
		<h1 class="logo-h1"><a href="/phonebook">CALLING CARD DIRECTORY</a></h1>
	</div>
	<div id="menu">
		<form method="post" action="/search" id="menu" style="margin-right: 10px;">
				<input type="text" placeholder="Id, Name, Address, Company Name, Contact, E-mail.." name="search" id="search">
				<input type="submit" value="Search Now" id="submit">
		</form>
		<ul>
			<br>
			<br>
			<br>
			<li><a href="/view" accesskey="2" title="">View Contacts</a></li>
			<li><a href="/add" accesskey="3" title="">Add Contacts</a></li>
			<li><a href="/about" accesskey="4" title="">About Us</a></li>
			<li><a href="/contact" accesskey="5" title="">Contact Us</a></li>
			<br>
			<li><a href="${profile}" >${username}</a></li>
			<li><form onsubmit="return confirm('Do you want to Log-out/in?');" method="post" action="${action}">
  		<input type="hidden" name="logout" value="true">
			<button type="submit">${status}</button></form></li>
		</ul>
	</div>
</div>
<div id="banner-wrapper">
<h2  class="center-up color">SPEED DIAL</h2>
	<div id="banner" class="container">
		<div class="boxA">
			<h3>AMBRAY, WAVE CANTERY</h3>
			<p>Address: Carmen, Cagayan de Oro City, Mis-Or</p>
			<a href="#" class="button">CALL NOW</a>
		</div>
		<div class="boxB">
			<h3>ABELLA, ATHENA LOUISSE</h3>
			<p>Address: Gateway, Limketkai Drive CDO City, Mis-Or</p>
			<a href="#" class="button">CALL NOW</a>
		</div>
		<div class="boxC">
			<h3>CAGAS, ANGELA</h3>
			<p>Address: Deluxe, Cogon CDO City, Mis-Or</p>
			<a href="#" class="button">CALL NOW</a>
		</div>
	</div>
</div>
<h2 class="center-up color">RECENTLY CONTACT</h2> 
<div id="page-wrapper">
	<div id="page" class="container">
		<div class="pboxA">
			<h3>Jaypax</h3>
			<p><img src="images/pic05.jpg" width="120" height="120" alt="" class="image image-left"/>Object Oriented Programing Instructor.</p>
			<a href="#" class="button">Customise</a>
		</div>
		<div class="pboxB">
			<h3>Athenes</h3>
			<p><img src="images/pic06.jpg" width="120" height="120" alt="" class="image image-left" />AJA!! Member.</p><br>
			<a href="#" class="button">Customise</a>
		</div>
		<div class="pboxC">
			<h3>Wacanam</h3>
			<p><img src="images/pic07.jpg" width="120" height="120"" alt="" class="image image-left" />Calling Card repository author.</p><br>
			<a href="#" class="button">Customise</a>
		</div>
	</div>
</div>
<h2 class="center-up">Recently Added Contacts</h2>
<p class="center-up">Click the button to sort the list ascending (A to Z):</p>
<p class="center-up">Click again to sort the list descending (Z to A):</p>
<div id="footer-wrapper">
	<div id="footer" class="container">
		<div id="fbox1">
			<button class="btn btn-danger" onclick="sortListDir()">Sort</button>
			<div>
				<ul class="style3" id="id01">
					<#list cards[0..*3]?reverse as card>
					<div class="card">
					<li class="first" style="float: left">
					<div style="float: left">
						<p class="date">ID: ${card.id}<br>${card.month}<b>${card.date}</b></p>
						</div>
						<div style="float: left">
						<h3>${card.name}</h3>
						<p>${"Address: "+card.address}</p>
            <p>${"Company: "+card.companyname}</p>
						<p>${"Email: "+card.email}</p>
						<p>${"Contact: "+card.contact}</p>
						</div>
						<div style="clear: both">
						<button type="button" class="btn btn-danger"><a Onclick="deletewarn()" href="/delete/${card.id}">DELETE</a></button>
						<button type="button" class="btn btn-success"><a Onclick="deletewarn()" href="/edit/${card.id}">EDIT</a></button>
						<button type="button" class="btn btn-info"><a Onclick="deletewarn()" href="/view/${card.id}">VIEW</a></button>
					</div>
					</li>
					</div>
					  <#else>
              <h1> No Contact available!  click <a href="/add">here </a> to add contact.
					</#list>
				</ul>
			</div>
		</div>
	</div>
</div>
<div id="copyright">
	<ul class="contact">
		<li><a href="#" class="icon icon-twitter"><span>Twitter</span></a></li>
		<li><a href="#" class="icon icon-facebook"><span>Facebook</span></a></li>
		<li><a href="#" class="icon icon-dribbble"><span>Pinterest</span></a></li>
		<li><a href="#" class="icon icon-tumblr"><span>Google+</span></a></li>
		<li><a href="#" class="icon icon-rss"><span>Pinterest</span></a></li>
	</ul>
	
	<p>&copy; CALLING CARD. All rights reserved. | Photos from <a href="http://github.com/coe11-ustp-cea">Github.com</a> | Credits to:<a href="http://templated.co" rel="nofollow">TEMPLATED</a>.</p>


<#include "javascript.ftl">


</body>
</html>
