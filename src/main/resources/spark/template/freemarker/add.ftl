<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900" rel="stylesheet" />
	<link href="default.css" rel="stylesheet" type="text/css" media="all" />
	<link href="fonts.css" rel="stylesheet" type="text/css" media="all" />
	<title>${title}</title>
</head>
<body>
<div id="header" class="container" style="position: static">
	<div id="logo">
		<a href="/"><img src="images/aja_logo.png" height="80" width="150"alt="" class="image image-logo"/></a>
		<h1 class="logo-h1"><a href="/">CALLING CARD DIRECTORY</a></h1>
	</div>
	<div id="menu">
		<ul>
			<br>
			<br>
			<br>
			<li><a href="/phonebook" accesskey="2" title="">Phonebook</a></li>
			<li><a href="/add" accesskey="3" title="">Add Contacts</a></li>
			<li><a href="/about" accesskey="4" title="">About Us</a></li>
			<li><a href="#" accesskey="5" title="">Contact Us</a></li>
		</ul>
	</div>
</div>
<div class="container">
  <h2>Add Contact Form</h2>
  <form method="post" action="/add">
    <div class="form-group">
      <label for="text">Fullname:</label>
      <input type="text" class="form-control" id="text" required="required" placeholder="First name, Middle name, Last name" name="fullname">
    </div>
      <div class="form-group">
      <label for="text">Company name:</label>
      <input type="text" class="form-control" id="text" required="required" placeholder="eg. mycompanyname" name="company">
    </div>
    <div class="form-group">
      <label for="text">Complete Address:</label>
      <input type="text" class="form-control" id="text" required="required" placeholder="Address line, City, Province" name="fulladdress">
    </div>
    <div class="form-group">
      <label for="text">Contact:</label>
      <input type="text" class="form-control" id="text" required="required" placeholder="Landline/Mobile" name="contact">
    </div>
    <div class="form-group">
      <label for="email">Email:</label>
      <input type="email" class="form-control" id="email" required="required" placeholder="eg. myemail@example.com" name="email">
    </div>
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>

</body>
</html>

