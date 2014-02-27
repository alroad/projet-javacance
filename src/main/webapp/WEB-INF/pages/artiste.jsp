<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="label.titre"/></title>
</head>
<body>
	<h1><spring:message code="liste.artiste" /></h1>
	<table>
		<tr>

			<th><spring:message code="colonne.artiste" /></th>
			<th><spring:message code="colonne.suppr" /></th>
			<th><spring:message code="colonne.editer" /></th>

		</tr>
		<c:forEach var="artist" items="${artists}">
			<tr>
				<th><a
					href="<c:url value="album.do">
					<c:param name="codeArtiste" value="${artist.codeArtiste}"/>
					</c:url>">
						<c:out value="${artist.nom}"></c:out>
				</a></th>

				<th><a
					href="<c:url value="deleteArtiste.do">
					<c:param name="codeArtiste" value="${artist.codeArtiste}"/>
					</c:url>">X</a>
				</th>

				<th><a
					href="<c:url value="updateArtiste.do">
					<c:param name="codeArtiste" value="${artist.codeArtiste}"/> 
					</c:url>"><spring:message code="edit" /></a>
				</th>
			</tr>
		</c:forEach>


	</table>

<br/>
	<form:form modelAttribute="artiste" method="POST"
		action="registerArtiste.do">
		<label for="nom"><spring:message code="label.nom" /></label>
		<form:input path="nom" id="nom" />
		<br>


		<button type="submit">
			<spring:message code="label.register" />
		</button>

	</form:form>
</body>
</html>