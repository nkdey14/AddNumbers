<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Numbers</title>
</head>
<body>
<div align="center">
<h2>Numbers are:</h2>
	First Number: ${add.num1}<br>
	Second Number: ${add.num2}<br>
	
	<br>
	<a href="sum?fnum=${add.num1}&snum=${add.num2}"><input type="button" value="Add"></a>
</div>
</body>
</html>