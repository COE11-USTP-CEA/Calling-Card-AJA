<#include "header.ftl">

<h2 class="center-up">Recently Added Contacts</h2>
<p class="center-up">Click the button to sort the list ascending (A to Z):</p>
<p class="center-up">Click again to sort the list descending (Z to A):</p>
<div><p style="color: red; text-align: center">${message}</p></div> 

<form method="post" action="/view" style="margin-right: 10px; text-align: center ">
	<input type="text" placeholder="Enter Card ID.." name="remove" id="search">
	<input type="submit" value="Delete Card!" id="submit">
  
</form>
<div id="footer-wrapper">
	<div id="footer" class="container">
		<div id="fbox1">
			<button class="btn btn-danger" onclick="sortListDir()">Sort</button>
			<div>
				<ul class="style3" id="id01">
          <#list cards?reverse as card>
          <div class="card">
              <li class="first"  style="float: left">
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