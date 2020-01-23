<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<title>Student Registration Form</title>
</head>

<body>
	<form:form action="processForm" modelAttribute="student">
		First Name:<form:input path="firstName"/><br><br>
		Last Name: <form:input path="lastName"/><br><br>
		
		<form:select path="country">
		<!-- <form:option value="BRA" label="Brazil"/>
			<form:option value="EGT" label="Egypt"/>
			<form:option value="SNG" label="Sengle"/>
			<form:option value="USA" label="Unites State"/>   -->
			
			<form:options items="${student.countryOptions }"/>
		</form:select>
		<br><br>
		Language:
			Java<form:radiobutton path="language" value="Java"/>
			C#<form:radiobutton path="language" value="C#"/>
			Python<form:radiobutton path="language" value="Python"/>
			C++<form:radiobutton path="language" value="C++"/>
			<br><br>
			Operating System:
			Linux<form:checkbox path="os" value="Linux"/>
			Mac OS<form:checkbox path="os" value="Mac OS"/>
			Windows<form:checkbox path="os" value="Windows"/>
			Solaris<form:checkbox path="os" value="Solaris"/>
			<br><br>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>