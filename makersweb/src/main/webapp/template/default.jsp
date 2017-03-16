<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="dec"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport" />
		<title><dec:title /></title>
		<meta name="description" content="MakersWeb Description"/>
		<meta name="robots" content="index, follow"/>
		<meta name="makersweb_version" content="<spring:message code="makersweb.api.version" />" />
		
		<!-- Bootstrap CSS -->
		<link rel="stylesheet" href="../_cdn/css/bootstrap.min.css" />
		<link rel="stylesheet" href="../_cdn/css/bootstrap-theme.min.css" />
		
		<!-- CSS Base Sistema -->
		<link rel="stylesheet" href="../_cdn/vendors/_css/makersweb.css" />
		<link rel="stylesheet" href="../_cdn/vendors/_css/application.css" />
		
		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
	</head>
	<body>
		<jsp:include page="header.jsp" />
		
		<div class="container">
			<dec:body />
		</div> <!-- /container -->
		
		<!-- Bootstrap core JavaScript -->
		<script src="../_cdn/js/jquery.js"></script>
		<script src="../_cdn/js/bootstrap.min.js"></script>
		<script src="../_cdn/vendors/js/makersweb-config.js"></script>
		<script src="../_cdn/vendors/js/controller/makersweb-controller.js"></script>
	</body>
</html>