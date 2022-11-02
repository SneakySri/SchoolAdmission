<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <table style="border: solid 1px red">
  <thead style="border: solid 1px red">
   <tr style="border: solid 1px red">
    <th>Id</th>
    <th>Name</th>
    <th>Age</th>
    <th>Gender</th>
    <th>Action</th>
   </tr>
  </thead>
     <tbody>
			<c:forEach items="${list}" var="a">
				<tr style="border: solid 1px red">
					<td>${a.id}</td>
					<td>${a.name}</td>
					<td>${a.age}</td>
					<td>${a.gender}</td>
					<td> <a href="update/{${employee.id})">edit</a>
					<td> <a href="delete/{${employee.id}}">delete</a>
				</tr>
			</c:forEach>
		</tbody>
 <a href="elite">Home</a>
 </table>
</body>
</html>