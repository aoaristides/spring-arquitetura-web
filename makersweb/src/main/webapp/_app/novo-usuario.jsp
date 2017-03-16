<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<title><spring:message code="makersweb.name" /> Novo Usuário</title>
<div class="aw-layout-simple-page__container">
	<form>
		<div class="aw-simple-panel">
			<img alt="[<spring:message code="makersweb.name" />]" src="../_cdn/vendors/images/logo-gray.png"/>
			
			<div class="aw-simple-panel__message">
				Informe o seu e-mail abaixo para receber as instruções de como criar uma nova senha.
			</div>
			
			<div class="aw-simple-panel__box">
				<div class="form-group  has-feedback">
					<input type="text" class="form-control  input-lg" placeholder="Seu e-mail">
					<span class="glyphicon  glyphicon-envelope  form-control-feedback" aria-hidden="true"></span>
				</div>
				
				<div class="form-group">
				<button type="submit" class="btn  btn-primary  btn-lg  aw-btn-full-width">Criar nova senha</button>
				</div>
			</div>
			
			<div class="aw-simple-panel__footer">Voltar para <a href="login.html">Login</a></div>
		</div>
	</form>
</div>