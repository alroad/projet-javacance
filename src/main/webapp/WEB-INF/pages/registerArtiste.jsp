<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enregistre un artiste</title>
</head>
<body>
<form:form modelAttribute="artiste" method="POST" action="registerArtiste.do">
	<label for="nom"><spring:message code="label.nom"/></label>
	<form:input path="nom" id="nom"/>
	<br>
	
	
	<button type="submit"><spring:message code="label.registerArtiste"/></button>
	
</form:form>


</body>
</html>