<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<form action="dangNhap1" method="post">
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Tên đăng
				nhập</label> <input type="text" class="form-control" name="tenDangNhap"
				id="exampleInputEmail1" aria-describedby="emailHelp">

		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Password</label>
			<input type="password" class="form-control" name="password"
				id="exampleInputPassword1">
		</div>

		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</body>
</html>