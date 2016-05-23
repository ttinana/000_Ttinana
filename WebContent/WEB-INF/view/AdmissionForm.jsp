<html>
<body>
	<h1>${headerText}</h1>

	<!-- <form action="submitAdmissionForm" method="post"> -->
	<form action="/000_Ttinana/submitAdmissionForm" method="post">
	
		<p>
			Name : <input type="text" name="formName" />
		</p>
		<p>
			Hobby : <input type="text" name="formHobby" />
		</p>
		<input type="submit" value="Submit this form" />
	</form>
	
	<h1>FormWithCollections</h1>
	<form action="submitAdmissionFormCollection" method="post">
	
		<p>
			Name : <input type="text" name="formName" />
		</p>
		<p>
			Hobby : <input type="text" name="formHobby" />
		</p>
		<input type="submit" value="Submit this form with collections" />
		
	</form>
 
</body>
</html>

