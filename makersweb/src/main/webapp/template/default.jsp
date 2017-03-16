<!DOCTYPE html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="dec"%>
<html lang="pt-br">
	<head>
		<meta charset="UTF-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
    	<meta name="viewport" content="width=device-width, initial-scale=1" />
		<title><dec:title /></title>
		
		<!-- Bootstrap CSS -->
		<link rel="stylesheet" href="../_cdn/css/bootstrap.min.css" />
		<link rel="stylesheet" href="../_cdn/css/font-awesome.min.css" />
		
		<!-- CSS Base Sistema -->
		<link rel="stylesheet" href="../_cdn/vendors/css/makersweb.css" />
		<link rel="stylesheet" href="../_cdn/vendors/css/application.css" />
		
		<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
		<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
		<!--[if lt IE 9]>
		  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
		  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
		<![endif]-->
	</head>
	<body>
	
		<div class="aw-layout-loading  js-loading-overlay">
			<div class="aw-layout-loading__container">
				<span class="aw-balls-spinner">Carregando...</span>
			</div>
		</div>
	
		<div class="aw-layout-page">
		
			<jsp:include page="header.jsp" />
			
			<jsp:include page="menu.jsp" />
			
			<section class="aw-layout-content  js-content">
				<dec:body />
			</section>
			
			<jsp:include page="footer.jsp" />
		
		</div><!-- /aw-layout-page -->
		
		<!-- Bootstrap Scripts -->
		<script src="../_cdn/js/jquery.js"></script>
		<script src="../_cdn/js/bootstrap.min.js"></script>
		<script src="../_cdn/vendors/js/makersweb.js"></script>
	</body>
</html>