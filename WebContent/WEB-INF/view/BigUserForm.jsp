<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<form:errors path="bigUser.*" />

	<form action="submitAdmissionBigUserForm" method="post">

		<p>
			Name : <input type="text" name="bigUserName" />
		</p>
		<p>
			Hobby : <input type="text" name="bigUserHobby" />
		</p>
		<p>
			Mobile 132456 <input type="text" name="bigUserMobile" />
		</p>
		<p>
			DoB 2010****10****10 <input type="text" name="bigUserDoB" />
		</p>
		<p>

			Skills set : <select name="bigUserSkills" multiple>
				<option value="Java Core">Java Core</option>
				<option value="Spring Core">Spring Core</option>
				<option value="Spring MVC">Spring MVC</option>
			</select>
		</p>
		<table>
			<tr>
				<td>Student's Address :</td>
			</tr>
			<tr>
				<td>country: <input type="text" name="bigUseraddress.country" /></td>
				<td>city: <input type="text" name="bigUseraddress.city" /></td>
				<td>street: <input type="text" name="bigUseraddress.street" /></td>
				<td>pincode:<input type="text" name="bigUseraddress.pincode" /></td>
			</tr>

		</table>

		<input type="submit" value="Submit this form" />
	</form>

</body>
</html>

