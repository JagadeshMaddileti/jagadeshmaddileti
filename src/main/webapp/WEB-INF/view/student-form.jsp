<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student form</title>
    <style>
    .error{color:red}
    </style>
</head>
<body>
<h2>Student registration form</h2>
<i>Fill the necessary fields</i>
<br><br>
<form:form action="processForm" modelAttribute="student">
First name(*):<form:input path="firstName"/>
<form:errors path="firstName" cssClass="error"/>
<br><br>
Last name:<form:input  path="lastName"/>
<br><br>
Age:<form:input path="age" value="${student.age == 0 ? '' : student.age}"/>
<form:errors path="age" cssClass="error"/>
<br><br>
Email:<form:input path="email"/>
<form:errors path="email" cssClass="error"/>
<br><br>
Course code:<form:input path="courseCode"/>
<form:errors path="courseCode" cssClass="error"/>
<br><br>
Country:<form:select path="country">
        <form:options items="${student.countryOptions}"/>
        </form:select>
<br><br>
Gender:
Male<form:radiobutton path="gender" value="Male"/>
Female<form:radiobutton path="gender" value="Female"/>
Others<form:radiobutton path="gender" value="Others"/>
<br><br>
Languages Known:
Telugu<form:checkbox path="language" value="Telugu"/>
Hindi<form:checkbox path="language" value="Hindi"/>
English<form:checkbox path="language" value="English"/>
Kannada<form:checkbox path="language" value="Kannada"/>
<br><br>
<i>Note:Asterisk (*) refers to required</i>
<input type="submit" value="Submit"/>
</form:form>
</body>
</html>