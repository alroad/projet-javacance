<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Titre</title>
</head>
<body>
	<h1>
		Hello
		<c:out value="${album.nom}" />
	</h1>
	<p>
		<spring:message code="label.hello" />:
		<c:out value="${album.nom}" />
		<br>
		<spring:message code="label.codeAlbum" />:
		<c:out value="${album.codeAlbum}" />
		<br>

	<p>

</body>
</html>