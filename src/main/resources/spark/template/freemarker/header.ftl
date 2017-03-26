<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>${title}</title>
<meta name="keywords" content="" />
<meta name="description" content="" />
<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900" rel="stylesheet" />
<link href="http://localhost:4567/default.css" rel="stylesheet" type="text/css" media="all" />
<link href="http://localhost:4567/fonts.css" rel="stylesheet" type="text/css" media="all" />

<!--[if IE 6]><link href="default_ie6.css" rel="stylesheet" type="text/css" /><![endif]-->

</head>
<body>
<div id="header" class="container" style="position: static">
	<div id="logo">
		<a href="/"><img src="http://localhost:4567/images/aja_logo.png" height="80" width="150"alt="" class="image image-logo"/></a>
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
		</ul>
	</div>
</div>