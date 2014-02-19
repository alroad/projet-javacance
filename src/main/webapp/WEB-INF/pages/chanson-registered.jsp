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
		<c:out value="${chanson.titre}" />
	</h1>
	<p>
		<spring:message code="label.hello" />:
		<c:out value="${chanson.titre}" />
		<br>
		<spring:message code="label.id" />:
		<c:out value="${chanson.id}" />
		<br>

	<p>

</body>
</html>