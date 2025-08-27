<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="AccountMain.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPDATE CUSTOMER PAGE</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"/>
<style>
	.form{
	   position:absolute;
	   top:80px;
	   left:35%;
	}
</style>
</head>
<body>

<div class="form" style="width:30%;margin:50px auto;">
<h2 class="text-primary">UPDATE ACCOUNT</h2>
<form action="AccountUpdateServ" method="post">

	 <input type="text" class="form-control" name="accno"  placeholder="ENTER THE ACCOUNT NUMBER"/>
			<input type="text" class="form-control" name="balance" placeholder="ENTER THE BALANCE"/>
	 		 <input type="submit" class="btn btn-primary" value="UPDATE"/>
	</form>
</div>
</body>