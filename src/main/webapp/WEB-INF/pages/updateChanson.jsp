<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title><spring:message code="label.titre"/></title>
</head>
<body>
<h1><spring:message code="update.chanson" /></h1>

<form:form modelAttribute="chanson" method="POST" action="updateChanson.do">
	<label for="titre"><spring:message code="label.titre" /></label>
		<form:input path="titre" id="titre" />
		<br>
		<label for="numeroChanson"><spring:message code="label.numeroChanson" /></label>
		<form:input path="numeroChanson" id="numeroChanson" />
		<br>
		<label for="duree"><spring:message code="label.duree" /></label>
		<form:input path="duree" id="duree" />
		<br>
		
	<input name="id" type="hidden" value="<c:out value="${id}"></c:out>"/>
	
	<button type="submit"><spring:message code="label.update"/></button>
	
</form:form>


</body>
</html>