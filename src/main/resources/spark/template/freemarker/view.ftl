<#include "header.ftl">

            <div>
				<ul class="style3" id="id01">
					<li class="first"  style="float: left">
						<p class="date">ID: ${card.id}<br>${card.month}<b>${card.date}</b></p>
						<h3>${card.name}</h3>
						<p>${"Address: "+card.address}</p>
                        <p>${"Company: "+card.companyname}</p>
						<p>${"Email: "+card.email}</p>
						<p>${"Contact: "+card.contact}</p>
						<button type="button" class="btn btn-danger"><a Onclick="deletewarn()" href="/delete/${card.id}">DELETE</a></button>
						<button type="button" class="btn btn-success"><a Onclick="deletewarn()" href="/edit/${card.id}">EDIT</a></button>
						<button type="button" class="btn btn-info"><a Onclick="deletewarn()" href="/phonebook">BACK</a></button>                        
					</li>
				</ul>
			</div>
</body>