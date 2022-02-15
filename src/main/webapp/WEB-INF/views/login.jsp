<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng nhập</title>
</head>
<body>
	<div class="wrapper fadeInDown">

		<div id="formContent">
			<c:if test="${not empty message}">
				<div class="alert alert-${alert}" role="alert">${message}</div>
			</c:if>

			<div class="fadeIn first">
				<img src="http://danielzawadzki.com/codepen/01/icon.svg" id="icon"
					alt="User Icon" />
			</div>

			<!-- Login Form -->
			<!-- /j_spring_security_check trong file security.xml -->
			<form action="j_spring_security_check" id="formLogin" method="POST">
				<input type="text" id="login" class="fadeIn second" name="j_username"
					placeholder="Tài khoản"> <input type="text" id="password"
					class="fadeIn third" name="j_password" placeholder="Mật khẩu">
				<input
					type="submit" class="fadeIn fourth" value="Đăng nhập">
			</form>

			<!-- Remind Passowrd -->
			<div id="formFooter">
				<a class="underlineHover" href="#">Quên mật khẩu?</a>
			</div>

		</div>
	</div>
</body>
</html>