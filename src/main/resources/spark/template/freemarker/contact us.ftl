<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css">    
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<link href="http://fonts.googleapis.com/css?family=Source+Sans+Pro:200,300,400,600,700,900" rel="stylesheet" />
	<link href="contact us.css" rel="stylesheet" type="text/css" media="all" />
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
			<li><a href="/view" accesskey="2" title="">View Contacts</a></li>
			<li><a href="/add" accesskey="3" title="">Add Contacts</a></li>
			<li><a href="/about" accesskey="4" title="">About Us</a></li>
			<li><a href="/contact" accesskey="5" title="">Contact Us</a></li>
		</ul>
	</div>
</div>
  
<div class="container">
  <div class="row header">
    <h1>CONTACT US &nbsp;</h1>
    <h3>Fill out the form below to learn more!</h3>
  </div>
  <div class="row body">
    <form method="post" action="/contact">
      <ul>
        
        <li>
          <p class="left">
            <label for="first_name">First Name</label>
            <input type="text" name="first_name" placeholder="Enter first name" />
          </p>
          <p class="pull-right">
            <label for="last_name">Last Name</label>
            <input type="text" name="last_name" placeholder="Enter last name" />      
          </p>
        </li>
        
        <li>
          <p>
            <label for="email">email <span class="req">*</span></label>
            <input type="email" name="email" placeholder="name123@gmail.com" />
          </p>
        </li>        
        <li><div class="divider"></div></li>
        <li>
          <label for="comments">Comments</label>
          <textarea cols="46" rows="3" name="comments"></textarea>
        </li>
        
        <li>
          <input class="btn btn-submit" type="submit" value="Submit" />
          <small>or press <strong>enter</strong></small>
        </li>
        
      </ul>
    </form>  
  </div>
</div>
  
  
</body>
</html>
