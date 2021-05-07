<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="root" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<style type="text/css">
/* The Modal (background) */
.modal {
	position: fixed; /* Stay in place */
	z-index: 1; /* Sit on top */
	left: 0;
	top: 0;
	width: 100%; /* Full width */
	height: 100%; /* Full height */
	overflow: auto; /* Enable scroll if needed */
	background-color: rgba(0, 0, 0, 0.4); /* Black w/ opacity */
}

/* Modal Content/Box */
.modal__content {
	position: relative;
	background-color: #fefefe;
	margin: 15% auto 15% auto;
	/* 5% from the top, 15% from the bottom and centered */
	padding: 24px 36px;
	border-radius: 1em;
	width: 40%; /* Could be more or less, depending on screen size */
}

.modal__content__title {
	text-align: center;
	font-weight: bold;
	font-size: 18px;
	margin-bottom: 18px;
}

/* 회원가입 모달 */
.modal.signup .modal__content {
	margin: 5% auto 15% auto;
	/* 5% from the top, 15% from the bottom and centered */
	min-width: 400px;
}

input.form__row {
	width: 93.5%;
}

.form__row {
	display: block;
	width: 100%;
	padding: 12px;
	margin: 12px 0;
	font-size: 14px;
	outline: none;
	border: 0.5px solid darkgray;
}

.signup-form__email {
	display: flex;
	align-items: center;
}

.form__row.email {
	width: 100%;
	display: inline;
}

.email-center {
	margin: 0 3px;
}

.signup-form__btn {
	width: 100%;
	height: 70px;
	font-size: 28px;
	background-color: blueviolet;
	color: white;
}
</style>
</head>
<body>
	<div class="modal signup">
		<div class="modal__content animate">
			<div class="modal__content__title">필수 정보를 입력해주세요.</div>
			<form class="signup-form" action="submit" method="post" enctype="multipart/form-data">
				<input type="hidden" name="act" value="join">
				<input class="form__row id" type="text" placeholder="집 이름" name="AptName" required/>
				<input class="form__row id" type="text" placeholder="법정동 코드" name="code" required/>
				<input class="form__row id" type="text" placeholder="가격" name="dealAmount" required/>
				<input class="form__row id" type="text" placeholder="준공 년도" name="buildYear" required/>
				<input class="form__row id" type="text" placeholder="면적(평)" name="area" required/>
				<input class="form__row id" type="text" placeholder="층수" name="floor" required/>
				<input class="form__row id" type="file" name="img"/>
				<button class="signup-form__btn" type="submit" onclick="javascript:join();">등록</button>
			</form>
		</div>
	</div>
	<script>
      function join() {
      	document.querySelector(".signup-form").action = "${root}/house/regist";
      	document.querySelector(".signup-form").submit(); 	
      }
    </script>
</body>
</html>