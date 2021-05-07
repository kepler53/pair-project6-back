<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style type="text/css">
.house {
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
}

.dong {
	margin-top: 30px;
}

.container {
	display: flex;
	justify-content: center;
	align-items: center;
	margin-top: 30px;
	padding-left: 0;
	flex-wrap: wrap;
	min-width: 1000px;
	max-width: 1000px;
	width: 1000px;
	align-items: center;
	margin-top: 30px;
	padding-left: 0;
	flex-wrap: wrap;
	padding-left: 0
}

.item {
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
	width: 200px;
	height: 200px;
	border: 1px solid darkgrey;
	margin: 10px;
	-webkit-box-shadow: 0px 2px 10px -1px rgba(0, 0, 0, 0.68);
	box-shadow: 0px 2px 10px -1px rgba(0, 0, 0, 0.68);
	cursor: pointer;
}

.item:hover {
	transform: scale(1.1);
}

.house_img {
	width: 100%;
	height: 100%;
}

.close {
	font-size: 24px;
}
</style>
<c:if test="${empty houseList}">
	<span class="msg">there is no item</span>
</c:if>
<c:if test="${not empty houseList}">
	<ul class="container">
		<c:forEach items="${houseList}" var="b">
			<li class="item">
				<div>${b.dong}</div>
				<div>
					<strong>${b.aptName}</strong>
				</div>
				<div>${b.dealAmount},000원</div>
				<div>${b.buildYear}년준공</div>
			</li>
		</c:forEach>
	</ul>
</c:if>
<!-- Modal sign in -->
<div class="modal hide">
	<div class="modal__content animate">
		<span onclick="document.querySelector('.modal').classList.toggle('hide')"
			class="fas fa-times close">ⓧ</span> 
			<img class="house_img" alt="house" src="">
	</div>
</div>
<script type="text/javascript">
	const container = document.querySelector('.container');
	const modal = document.querySelector('.modal');
	container.addEventListener('click', function(e) {
		let target = e.target;
		if (target.nodeName == "DIV"
				|| target.nodeName == "STRONG") {
			target = target.parentNode;
		}
		const img = document.querySelector(".house_img");
		img
				.setAttribute(
						'src',
						'https://lh3.googleusercontent.com/proxy/SsGR7SK-idSWj8khiWxdctdoZWQZa6JnTArl14tP3iBl4PeloKiXDQ0W3ZTLraWmGkyS0IduKg6pRrP-HQACV1J8fU6w9TorHmW97ddbeBKLGQ')
		modal.classList.toggle('hide');
	})
</script>
