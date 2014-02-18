<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Album</title>
</head>
<body>
<h1>Liste</h1>
<table>
<tr>
	
	<th>Album</th>
	
</tr>
<c:forEach var="album" items="${albums}">


<tr>
	<th><c:out value="${album.nom}"></c:out></th>
	
	
</tr>

<tr>
	<th><a href="<c:url value="chanson.do">
	<c:param name="codeAlbum" value="${album.codeAlbum}"/>
	</c:url>"><c:out value="${album.nom}"></c:out></a></th>
</tr>
</c:forEach>

</table>
</body>
</html>