<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Multiplication Table</title>
	</head>
	<body>	
		<form method="GET">
			Startzahl:<input type="number" name="baseNumber" required/><br>
			Endzahl:<input type="number" name="endNumber" required/><br>
			<input type="submit" value="Build multiplication table"/><br>
 		</form>
 		<jsp:include page="/TableGen"/>
	</body>
</html>
