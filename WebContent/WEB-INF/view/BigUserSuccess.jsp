<html>
<head>
<!-- <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-2"> -->
<title>NeverEverland</title>
</head>

<body>
<h2>${headerText}</h2>
	
	<h1>Congratulations: Big House of NeverEverland processed your data
		successfully</h1>

	<h2>${msg}</h2>

	<h3>${bigUser.getBigUserName()}</h3>
	<h3>${bigUser.getBigUserHobby()}</h3>
	<h3>${bigUser.getBigUserMobile()}</h3>
	<h3>${bigUser.getBigUserDoB()}</h3>
	<h3>${bigUser.getBigUserSkills()}</h3>
	<table>
		<tr>
			<td>Student Address :</td>
			<td>country: ${bigUser.bigUseraddress.country}
			       city: ${bigUser.bigUseraddress.city}
			     street: ${bigUser.bigUseraddress.street}
			    pincode: ${bigUser.bigUseraddress.pincode}</td>
		</tr>
		
		

	</table>

</body> 

</html>