<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- The above line references JSTL tag library that will will give forEach tag for
 looping over collection -->
 
<!DOCTYPE html>
<html>
<head>
<title>Student Confirmation</title></head>

<body>
The Student is Confirmd :${student.firstName} ${student.lastName} 
<br><br>
Country: ${student.country }
<br><br>
Language: ${student.language }
<br><br>
Operating Systems:
	<ul>
		<c:forEach var="temp" items="${student.os }">
		
			<li>${temp}</li>
		
		</c:forEach>
	</ul>
</body>
</html>