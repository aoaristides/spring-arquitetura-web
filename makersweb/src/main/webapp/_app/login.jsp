<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:url value="/j_spring_security_check" var="loginUrl" />

<title><spring:message code="makersweb.name" /> Login</title>
<div class="aw-layout-simple-page__container">
	<form action="${loginUrl}" method="post">
		<div class="aw-simple-panel">
			<img alt="[<spring:message code="makersweb.name" />]" src="../_cdn/vendors/images/logo-gray.png"/>
			
			<div class="aw-simple-panel__message">
				Por favor, faça o login.
			</div>
			
			<div class="aw-simple-panel__box">
				<c:if test="${param.error ==  'invalid_user'}">
					<div class="alert alert-warning fade in m-b-15">
						<strong>Erro!</strong> E-mail e senha não conferem! 
						<span class="close" data-dismiss="alert">×</span>
					</div>
				</c:if>
			
				<div class="form-group  has-feedback">
					<input type="email" name="j_username" class="form-control  input-lg" placeholder="Seu e-mail"/>
					<span class="glyphicon  glyphicon-envelope  form-control-feedback" aria-hidden="true"></span>
				</div>
				
				<div class="form-group  has-feedback">
					<input type="password" name="j_password" class="form-control  input-lg" placeholder="Sua senha"/>
					<span class="glyphicon  glyphicon-lock  form-control-feedback" aria-hidden="true"></span>
				</div>
				<div class="form-group">
					<button type="submit" class="btn  btn-primary  btn-lg  aw-btn-full-width">Entrar</button>
				</div>
				
				<div class="form-group clearfix">
					<div class="checkbox pull-left aw-checkbox-no-margin">
					    <label for="lembrar">
					      <input type="checkbox" id="lembrar" />Lembre de mim
					    </label>
					</div>
					
					<div class="pull-right">
						<a href="esqueceu-a-senha.html">Esqueceu a senha?</a>
					</div>
				</div>
			</div>
			
			<div class="aw-simple-panel__footer">Novo por aqui? <a href="novo-usuario.html">Cadastre-se</a>.</div>
		</div>
	</form>
</div>