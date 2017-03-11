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
			<li><a href="/phonebook" accesskey="2" title="">Phonebook</a></li>
			<li><a href="/add" accesskey="3" title="">Add Contacts</a></li>
			<li><a href="/about" accesskey="4" title="">About Us</a></li>
			<li><a href="#" accesskey="5" title="">Contact Us</a></li>
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
			<button onclick="sortListDir()">Sort</button>
			<div>
				<ul class="style3" id="id01">
					<#list fullname[0..*3] as names>
					<li class="first"  style="float: left">
						<p class="date">${month}<b>${date}</b></p>
						<h3>${names}</h3>
						<p>${"Address: "+street+" "+city+", "+province+"."}</p>
						<p>${"Email: "+email}</p>
						<p>${"Tel: "+tel}</p>
						<p>${"Mobile: "+mobile}</p>
					</li>
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

<script>
function sortListDir() {
  var list, i, switching, b, shouldSwitch, dir, switchcount = 0;
  list = document.getElementById("id01");
  switching = true;
  //Set the sorting direction to ascending:
  dir = "asc"; 
  //Make a loop that will continue until no switching has been done:
  while (switching) {
    //start by saying: no switching is done:
    switching = false;
    b = list.getElementsByTagName("LI");
    //Loop through all list-items:
    for (i = 0; i < (b.length - 1); i++) {
      //start by saying there should be no switching:
      shouldSwitch = false;
      /*check if the next item should switch place with the current item,
      based on the sorting direction (asc or desc):*/
      if (dir == "asc") {
        if (b[i].innerHTML.toLowerCase() > b[i + 1].innerHTML.toLowerCase()) {
          /*if next item is alphabetically lower than current item,
          mark as a switch and break the loop:*/
          shouldSwitch= true;
          break;
        }
      } else if (dir == "desc") {
        if (b[i].innerHTML.toLowerCase() < b[i + 1].innerHTML.toLowerCase()) {
          /*if next item is alphabetically higher than current item,
          mark as a switch and break the loop:*/
          shouldSwitch= true;
          break;
        }
      }
    }
    if (shouldSwitch) {
      /*If a switch has been marked, make the switch
      and mark that a switch has been done:*/
      b[i].parentNode.insertBefore(b[i + 1], b[i]);
      switching = true;
      //Each time a switch is done, increase switchcount by 1:
      switchcount ++;
    } else {
      /*If no switching has been done AND the direction is "asc",
      set the direction to "desc" and run the while loop again.*/
      if (switchcount == 0 && dir == "asc") {
        dir = "desc";
        switching = true;
      }
    }
  }
}
</script>


</body>
</html>
