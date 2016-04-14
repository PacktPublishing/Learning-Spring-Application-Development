<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
<title>Chapter-7 Spring MVC</title>
</head>
<body>

	<h1 style="color: green; text-align: center;">Chapter 7: Spring
		MVC - internationalization</h1>

	<table align="center" border="1">
		<tr>
			<td><b style="color: brown">Language</b></td>
			<td><a href="?lang=en">English</a>|</td>
			<td><a href="?lang=fr">French</a></td>
		</tr>
	</table>
	<h2 style="color: orange; text-align: center;">
		<spring:message code="employee.first.name" text="default text" />
		: ${firstName}
	</h2>

	<h2 style="color: orange; text-align: center;">
		<spring:message code="employee.last.name" text="default text" />
		: ${lastName}
	</h2>
</body>
</html>