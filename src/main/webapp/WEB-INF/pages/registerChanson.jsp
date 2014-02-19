<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib  prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enregistre une chanson</title>
</head>
<body>


<form:form modelAttribute="chanson" method="POST" action="registerChanson.do">
	<label for="titre"><spring:message code="label.titre"/></label>
	<form:input path="titre" id="titre"/>
	<br>
	
	<label for="id"><spring:message code="label.id"/></label>
	<form:input path="id" id="id"/>
	<br>
	
	
	<button type="submit"><spring:message code="label.registerArtiste"/></button>
	
</form:form>
</body>
</html>