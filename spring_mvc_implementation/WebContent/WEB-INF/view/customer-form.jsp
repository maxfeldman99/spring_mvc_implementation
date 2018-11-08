<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>

<title>Customer Registration Form</title>

<!-- css style -->

<style>

.error{color:red}  

</style>

</head>


<body>

<i>Fill out the form , (*) - means required.</i>

 <br><br>

 <form:form action="processForm" modelAttribute="customer">
 
 First name: <form:input path="firstName" />
 
 <br><br>
 
 Last name (*): <form:input path="lastName" />
 <form:errors path= "lastName" cssClass="error" /> <!-- show error msg if we have one.css style -->
 
  <br><br>
  
  <input type="submit" value="Submit" /> <!-- submit button -->
 
 </form:form>

</body>






</html>