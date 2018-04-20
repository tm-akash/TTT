<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="findEmp" method="post">
	<input type="text" name="fname">
	<input type="submit">
	</form>
	
	<table border="1" cellpadding="5">
			<caption>
				<h2>List of users</h2>
			</caption>
			<tr>
				<th>ID</th>
				<th>Title</th>
				<th>Author</th>
				<th>Price</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="user" items="${empList}">
				<tr>
					<td><c:out value="${employee.name}" /></td>
					<td><c:out value="${employee.eid}" /></td>
					<td><c:out value="${employee.role}" /></td>
					<td><c:out value="${user.teachnoofhours}" /></td>
					<td><c:out value="${user.role}" /></td>
				</tr>
			</c:forEach>
		</table>

</body>
</html>