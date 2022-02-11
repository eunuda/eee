<!-- 주문조회 창 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginform.jsp</title>

</head>

<body class="text-center">
	<main class="form-signin">
		<div class="container">
 			<h3 class="h3 mb-3 fw-normal">로그인 폼2</h3>
			<form action="login.jsp" method="post">
				<div class="form-floating">
					<input class="form-control" type="text" name="id" id="id" placeholder="아이디" />
					<label class="form-label" for="id">아이디</label>
				</div>
				<div class="form-floating">
					<input class="form-control" type="password" name="pwd" id="pwd" placeholder="비번" />
					<label class="form-label" for="pwd">비밀번호</label>
				</div>
				
				<div class="checkbox mb-3">
					<label>
						<input type="checkbox" value="remember"> 아이디 기억하기
					</label>
				</div>
				
				<button class="w-100 btn btn-lg btn-primary" type="submit">로그인</button>
 			</form>
		</div>
	</main>
</body>
</html>