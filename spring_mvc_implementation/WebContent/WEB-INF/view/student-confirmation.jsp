<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!--  to iterate "for each" over array -->

<!DOCTYPE html>

<html>

<head>

<title>Student Confirmation</title>

</head>

<body>

The student is confirmed: ${student.firstName} ${student.lastName}

<br><br>

Country: ${student.country}

<br><br>

Favorite Language: ${student.favoriteLanguage}

<br><br>

Operating Systems:
<ul> <!-- unordered list, bullet list -->

<c:forEach var="temp" items="${student.operatingSystems}">  <!-- iterate over array -->

<li>${temp} </li>  <!-- list -->

</c:forEach>
</ul>

</body>

</html>