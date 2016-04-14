<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Chapter-7 Spring MVC</title>
</head>
<body>

	<h1 style="color: green; text-align: center;">${name}</h1>

	<h2 style="color: orange; text-align: center;">${greetings}</h2>

	<table align="center" border="1" cellspacing="0" cellpadding="10">
		<tr>
			<td rowspan="2" style="color: red; text-align: center;">
				Exception Handling</td>
				<td><a href="employee/testIOException">Click here to test IO
					Exception</a></td>
		</tr>
		<tr>			
			<td><a href="employee/testGenericException">Click here to
					test Generic Exception</a></td>
		</tr>
	</table>

</body>
</html>