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
<div id="header" class="container" style="position: static">
	<div id="logo">
		<a href="/"><img src="images/aja_logo.png" height="80" width="150"alt="" class="image image-logo"/></a>
		<h1 class="logo-h1"><a href="/phonebook">CALLING CARD DIRECTORY</a></h1>
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
			<li><a href="/view" accesskey="2" title="">View Contacts</a></li>
			<li><a href="/add" accesskey="3" title="">Add Contacts</a></li>
			<li><a href="/about" accesskey="4" title="">About Us</a></li>
			<li><a href="/contact" accesskey="5" title="">Contact Us</a></li>
		</ul>
	</div>
</div>
<h2 class="center-up">Recently Added Contacts</h2>
<p class="center-up">Click the button to sort the list ascending (A to Z):</p>
<p class="center-up">Click again to sort the list descending (Z to A):</p>

<form method="post" action="/view" style="margin-right: 10px; text-align: center ">
	<input type="text" placeholder="Enter Card Name.." name="remove" id="search">
	<input type="submit" value="Delete Card!" id="submit">
</form>
<div id="footer-wrapper">
	<div id="footer" class="container">
		<div id="fbox1">
			<button onclick="sortListDir()">Sort</button>
			<div>
				<ul class="style3" id="id01">
          <#list cards[0..*6]?reverse as card>
					<li class="first"  style="float: left">
						<p class="date">ID: ${card.id}<br>${card.month}<b>${card.date}</b></p>
						<h3>${card.name}</h3>
						<p>${"Address: "+card.address}</p>
            <p>${"Company: "+card.companyname}</p>
						<p>${"Email: "+card.email}</p>
						<p>${"Contact: "+card.contact}</p>
						<button type="button" class="btn btn-danger">Delete</button>
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