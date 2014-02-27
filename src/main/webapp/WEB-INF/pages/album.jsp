<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Album</title>
</head>
<body>
	<h1>Liste des albums</h1>
	<table>
		<tr>

			<th>Album</th>
			<th>Supprimer</th>
			<th>Edition</th>

		</tr>
		<c:forEach var="album" items="${albums}">


			<tr>
				<th><a
					href="<c:url value="chanson.do">
					<c:param name="codeAlbum" value="${album.codeAlbum}"/>
					</c:url>">
						<c:out value="${album.nom}"></c:out>
				</a></th>


				<th><a
					href="<c:url value="deleteAlbum.do">
					<c:param name="codeAlbum" value="${album.codeAlbum}"/>
					</c:url>">X</a></th>

				<th><a
					href="<c:url value="updateAlbum.do">
					<c:param name="codeAlbum" value="${album.codeAlbum}"/> 
					</c:url>">Editer</a>
				</th>
			</tr>
		</c:forEach>


	</table>


	<form:form modelAttribute="album" method="POST"
		action="registerAlbum.do">
		<label for="nom"><spring:message code="label.nom" /></label>
		<form:input path="nom" id="nom" />
		<br>
		<input name="codeArtiste" type="hidden"
			value="<c:out value="${codeArtiste}"></c:out>" />


		<button type="submit">
			<spring:message code="label.register" />
		</button>

	</form:form>
</body>
</html>