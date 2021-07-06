<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
	<title>회원가입</title>
</head>
<body>
<h1>
  회원 가입 
</h1>
<hr>

<hr>
<form class="container" method="post" action="<%=request.getContextPath()%>/signup">
	<div class="form=group">
		<label for="usr">이름:</label>
  		<input type="text"  class="form=group"name="name">
	</div>
	
	<div class="form=group">	
	  	<label for="usr">아이디:</label>
 		<input type="text" class="form=group" name="id">	
	</div>
	
	<div class="form=group">	
	  	<label>이메일:</label>
 		<input type="email"  class="form=group" name="email">	
	</div>
	
	
	<div class="form=group">
	    <label>비밀번호:</label>
	  <input type="password" class="form-control" name="pw"><br>
	    <label>비밀번호 재확인:</label>
	  <input type="password" class="form-control" name="pw2">
	</div>
	
	<div class="form=group">
		<label>성별:
		<input type="radio" class="form-control" name="gender">
		남자</label>
	</div>
		
	<button class="btn btn-outline-success col-12">회원가입 </button>
</form>

</body>
</html>
