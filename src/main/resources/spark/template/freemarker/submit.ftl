<!DOCTYPE html>
<html>
<head>

<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900" rel="stylesheet" />
<link href="default.css" rel="stylesheet" type="text/css" media="all" />
<link href="fonts.css" rel="stylesheet" type="text/css" media="all" />
<title>${title}</title>

</head>
<body>
<div id="header" class="container">
	<div id="logo">
		<a href="/"><img src="images/aja_logo.png" height="80" width="150"alt="" class="image image-logo"/></a>
		<h1 class="logo-h1"><a href="/">CALLING CARD DIRECTORY</a></h1>
	</div>
	<div id="menu">
		<form action="http://www.google.com/" id="menu" style="margin-right: 10px;">
				<input type="text" placeholder="Search a Card.." name="search" id="search">
				<input type="submit" value="Go!" id="submit">
		</form>
		<ul>
			<br>
			<br>
			<br>
			<li><a href="#" accesskey="2" title="">Phonebook</a></li>
			<li><a href="/submit" accesskey="3" title="">Add Contacts</a></li>
			<li><a href="/about_us" accesskey="4" title="">About Us</a></li>
			<li><a href="#" accesskey="5" title="">Contact Us</a></li>
		</ul>
	</div>
</div>
<div class="center-up submit-header">
	<div>
		<form method="post" action="/submit">
			<label>Full Name</label>
			<br>
			
				<input type="text" placeholder="First Name" name="firstname"/>
				<input type="text" placeholder="Last Name" name="lastname"/>
				<input type="text" placeholder="Middle Name" name="middlename"/>
			<br>
				<label>Address</label>
				<br>
				<input type="text" placeholder="Street line" name="street"/>
				<input type="text" placeholder="City" name="city"/>
				<input type="text" placeholder="Province" name="province"/>
				<br>
				<label>Contact Number</label>
				<br>
				<input type="text" placeholder="Telephone" name="telephone"/>
				<input type="text" placeholder="Mobile" name="mobile"/>
				<br>
				<label>Email</label>
				<br>
				<input type="text" placeholder="Email add" name="email"/>
				<br>
				<input type="submit" value="submit" id="submit"/>
		</form>

	</div>
</div>
</body>
</html>