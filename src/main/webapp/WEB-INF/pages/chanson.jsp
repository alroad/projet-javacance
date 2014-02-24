<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>


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
			<th>Supprimer</th>

		</tr>
		<c:forEach var="chanson" items="${chansons}">
			<tr>

				<th><c:out value="${chanson.titre}"></c:out></th>
				<th><a
					href="<c:url value="deleteChanson.do">
					<c:param name="id" value="${chanson.id}"/>
					</c:url>">X</a></th>
			</tr>
		</c:forEach>

	</table>
	
	<form:form modelAttribute="chanson" method="POST"
		action="registerChanson.do">
		<label for="titre"><spring:message code="label.titre" /></label>
		<form:input path="titre" id="titre" />
		<br>
		<label for="numeroChanson"><spring:message code="label.numeroChanson" /></label>
		<form:input path="numeroChanson" id="numeroChanson" />
		<br>
		<label for="duree"><spring:message code="label.duree" /></label>
		<form:input path="duree" id="duree" />
		<br>
		<input name="codeAlbum" type="hidden" value="<c:out value="${codeAlbum}"></c:out>"/>


		<button type="submit">
			<spring:message code="label.register" />
		</button>

	</form:form>
</body>
</html>