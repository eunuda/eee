<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<body>
<div class="container">
	<h1>회원 가입 폼 입니다.</h1>
	<form action="signup.jsp" method="get">
		<div class="mb-3">
			<label class="form-label" for=nick>닉네임</label>
			<input type="text" class="form-control" id="nick" placeholder="닉네임 입력..." name="nick">
		</div>
		
		<!-- radio는 fieldset, legend로 묶어준다. -->
		<fieldset>
			<legend class="legend-style">이메일 수신 여부</legend>
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio" id="emailYes" name="email" value="yes" checked>
				<label class="form-check-label" for="emailYes">네</label>
			</div>
			<div class="form-check form-check-inline">
				<input class="form-check-input" type="radio" id="emailNo" name="email" value="no">
				<label class="form-check-label" for="emailNo">아니요</label>
			</div>
		</fieldset>
		
		<div class="mb-3">
			<label class="form-label" for="concern">관심사</label>
			<select class="form-select" name="concern" id="concern">
				<option value="">선택</option>
				<option value="game">게임</option>
				<option value="movie">영화</option>
				<option value="etc">기타</option>
			</select>
		</div>
		
		<!-- checkbox는 fieldset, legend로 묶어준다. -->
		<fieldset>
			<legend class="legend-style">배우고 싶은 언어</legend>
			<div class="form-check">
				<label class="form-check-label" for="language1">자바</label>
				<input class="form-check-input" id="language1" type="checkbox" name="language" value="Java"/> 
			</div>
			<div class="form-check">
				<label class="form-check-label" for="language2">파이선</label>
				<input class="form-check-input" id="language2" type="checkbox" name="language" value="Python"/> 
			</div>
			<div class="form-check">
				<label class="form-check-label" for="language3">C++</label>
				<input class="form-check-input" id="language3" type="checkbox" name="language" value="C++"/> 
			</div>
		</fieldset>

		<div class="mb-3">
			<label class="form-label" for="comment">남기고 싶은 말</label>
			<textarea class="form-control" id="comment" name="comment"></textarea>
		</div>
		<button class="btn btn-success" type="submit">가입</button>
		<button class="btn btn-warning" type="reset">취소</button>
	</form>
</div>
</body>
</html>