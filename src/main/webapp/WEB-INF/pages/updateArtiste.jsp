<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Modifier un artiste</title>
</head>
<body>

<form:form modelAttribute="artiste" method="POST" action="updateArtiste.do">
	<label for="nom"><spring:message code="label.nom"/></label>
	<form:input path="nom" id="nom"/>
	<br>
	<input name="codeArtiste" type="hidden" value="<c:out value="${codeArtiste}"></c:out>"/>
	
	<button type="submit"><spring:message code="label.update"/></button>
	
</form:form>


</body>
</html>