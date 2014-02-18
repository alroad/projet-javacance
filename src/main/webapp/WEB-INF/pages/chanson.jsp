<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Chansons</title>
</head>
<body>
<h1>Liste</h1>
<table>
<tr>
	
	<th>Chanson</th>
	
</tr>
<c:forEach var="chanson" items="${chansons}">
<tr>
	<th><c:out value="${chanson.titre}"></c:out></th>
</tr>
</c:forEach>

</table>
</body>
</html>