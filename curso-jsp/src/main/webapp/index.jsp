<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/css/bootstrap.min.css"
	rel="stylesheet">
<title>Curso-JSP</title>
<style type="text/css">
body {
	min-height: 100vh; /* Garante que o body ocupe toda a altura da tela */
	background-color: #f8f9fa; /* Cor de fundo suave */
}

.login-container {
	display: flex;
	justify-content: center; /* Centraliza horizontalmente */
	align-items: center; /* Centraliza verticalmente */
	min-height: 100vh; /* Ocupa toda a altura da tela */
}

.login-card {
	width: 100%;
	max-width: 500px; /* Largura máxima do card */
	border-radius: 10px; /* Bordas arredondadas */
	box-shadow: 0 0.5rem 1rem rgba(0, 0, 0, 0.15); /* Sombra suave */
}

.form-input-large {
	height: 50px; /* Altura aumentada */
	font-size: 1.1rem; /* Fonte maior */
	padding: 12px; /* Espaçamento interno */
}

.btn-large {
	height: 50px; /* Altura do botão */
	font-size: 1.2rem; /* Fonte do botão */
}
</style>
</head>
<body>
	<div class="login-container">
		<div class="login-card card">
			<div class="card-body p-4 ">
				<h1 class="text-center mb-4">Bem vindo ao curso de JSP</h1>

				<form class="row g-3 needs-validation" novalidate
					action="${pageContext.request.contextPath}/ServletLogin"
					method="post">
					<input type="hidden" name="url" value="${not empty param.url ? param.url : ''}">

					<div class="mb-3">
						<label class="form-label fs-5 ">Usuário</label> <input
							class="form-control form-input-large" name="login" type="text"
							placeholder="usuário" required>
						<div class="invalid-feedback">Obrigatório</div>
						<div class="valid-feedback">ok!</div>
					</div>

					<div class="mb-4">
						<label class="form-label fs-5">Senha</label> <input
							class="form-control form-input-large" name="senha"
							type="password" placeholder="senha" required>
						<div class="invalid-feedback">Obrigatório</div>
						<div class="valid-feedback">ok!</div>
					</div>

					<div class="d-grid">
						<input class="btn btn-primary btn-lg btn-large" type="submit"
							value="Entrar">
					</div>
				</form>

				 
				<div class="mt-3 text-center">
					<h5 class="text-danger">${msg}</h5>
				</div>
			</div>
		</div>
	</div>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.7/dist/js/bootstrap.bundle.min.js"></script>
	<script type="text/javascript">
//Example starter JavaScript for disabling form submissions if there are invalid fields
(() => {
  'use strict'

  // Fetch all the forms we want to apply custom Bootstrap validation styles to
  const forms = document.querySelectorAll('.needs-validation')

  // Loop over them and prevent submission
  Array.from(forms).forEach(form => {
    form.addEventListener('submit', event => {
      if (!form.checkValidity()) {
        event.preventDefault()
        event.stopPropagation()
      }

      form.classList.add('was-validated')
    }, false)
  })
})()
</script>
</body>
</html>