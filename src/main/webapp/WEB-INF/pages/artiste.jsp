<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello</title>
</head>
<body>
	<h1>Liste</h1>
	<table>
		<tr>

			<th>Artiste</th>

		</tr>
		<c:forEach var="artist" items="${artists}">
			<tr>
				<th><a
					href="<c:url value="album.do">
	<c:param name="codeArtiste" value="${artist.codeArtiste}"/>
	</c:url>"><c:out
							value="${artist.nom}"></c:out></a></th>
			</tr>
		</c:forEach>


	</table>

</body>
</html>