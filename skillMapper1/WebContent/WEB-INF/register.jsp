<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<form action="RegisterController" method="post">  
	<p>Register</p>
	Name:<input type="text" name="name"><br> 
	EmpID: <input type="text" name="empid"><br>	 
	Password:<input type="password" name="password"><br> 
	City: <input type="text" name="city"><br> 
	<!-- Role: <input type="text" name="role"><br> -->
	<select name="role" style="width:155px">  
	<option value="employee">employee</option>  
	<option value="employer">employer</option>  
	<option value="HR">HR</option>    
	</select>  <br>
	<input type="submit" value="Register">  
	</form>

</body>
</html>