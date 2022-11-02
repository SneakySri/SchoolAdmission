<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admission-Edit</title>
</head>
<body>
<div align="center">
<h2>AdmissionForm</h2>
<form:form method="post" action="save"  modelAttribute="stud">
       <form:label path="name">Full name:</form:label>
            <form:input path="name"/><br/>

<form:label path="age">Age:</form:label>
            <form:input path="age"/><br/>

<form:label path="gender">Gender:</form:label>
            <form:input path="gender"/><br/>
             
   <form:button>save</form:button>  
 <a href="/elite">Home</a>        
     
</form:form>
</div>

</body>
</html>