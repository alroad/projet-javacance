<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Artiste</title>
</head>
<body>
	<h1>Liste des artistes</h1>
	<table>
		<tr>

			<th>Artiste</th>
			<th>Supprimer</th>

		</tr>
		<c:forEach var="artist" items="${artists}">
			<tr>
				<th><a href="<c:url value="album.do">
					<c:param name="codeArtiste" value="${artist.codeArtiste}"/>
					</c:url>">
					<c:out value="${artist.nom}"></c:out></a></th>

				<th><a href="<c:url value="deleteArtiste.do">
					<c:param name="codeArtiste" value="${artist.codeArtiste}"/>
					</c:url>">X</a></th>
			</tr>
		</c:forEach>


	</table>


<form:form modelAttribute="artiste" method="POST" action="registerArtiste.do">
	<label for="nom"><spring:message code="label.nom"/></label>
	<form:input path="nom" id="nom"/>
	<br>
	
	
	<button type="submit"><spring:message code="label.register"/></button>
	
</form:form>
</body>
</html>