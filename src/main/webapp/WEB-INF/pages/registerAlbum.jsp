<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enregistre un album</title>
</head>
<body>


<form:form modelAttribute="album" method="POST" action="registerAlbum.do">
	<label for="nom"><spring:message code="label.nom"/></label>
	<form:input path="nom" id="nom"/>
	<br>
	
	<label for="codeAlbum"><spring:message code="label.codeAlbum"/></label>
	<form:input path="codeAlbum" id="codeAlbum"/>
	<br>
	
	
	<button type="submit"><spring:message code="label.registerAlbum"/></button>
	
</form:form>
</body>
</html>