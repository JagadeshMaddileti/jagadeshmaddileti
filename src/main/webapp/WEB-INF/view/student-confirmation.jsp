<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
<h3>Student is confirmed : ${student.firstName} ${student.lastName}</h4>
<h3>Age: ${student.age}</h3>
<h3>Email: ${student.email}</h3>
<h3>Course code: ${student.courseCode}</h3>
<h3>Country: ${student.country}</h3>
<h3>Gender: ${student.gender}</h3>
<h3>Languages known:</h3>
<ul>
<c:forEach var="temp" items="${student.language}">
<li><h3>${temp}</h3></li>
</c:forEach>
</ul>
</body>
</html>