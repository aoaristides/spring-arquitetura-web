<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<c:url value="/j_spring_security_check" var="loginUrl" />

<title><spring:message code="makersweb.name" /> Login</title>
<div id="form-container">
    <div class="panel" id="form-box">
        <form action="${loginUrl}" method="post">
            <h1 class="text-center"><spring:message code="makersweb.name" /></h1>

			<c:if test="${param.error ==  'invalid_user'}">
				<div class="alert alert-warning fade in m-b-15">
					<strong>Erro!</strong> E-mail e senha não conferem! 
					<span class="close" data-dismiss="alert">×</span>
				</div>
			</c:if>

			<div class="form-group">
                <label class="sr-only" for="login">Usuário</label>
                <div class="input-group">
                    <div class="input-group-addon">
                        <span class="glyphicon glyphicon-user"></span>
                    </div>
                    <input type="text" name="j_username" class="form-control" placeholder="Seu login de usuário" required/>
                </div>
            </div>

            <div class="form-group">
                <label class="sr-only" for="senha">Senha</label>
                <div class="input-group">
                    <div class="input-group-addon">
                        <span class="glyphicon glyphicon-lock"></span>
                    </div>
                    <input type="password" name="j_password" class="form-control" placeholder="Digite sua senha" required/>
                </div>
            </div>

            <div class="form-group">
                <input type="submit" value="Entrar" class="btn btn-success form-control">
            </div>

            <div class="form-group">
                Não é registrado? <a href="cadastro.html">Crie uma conta</a>.
            </div>
        </form>
    </div>
</div>