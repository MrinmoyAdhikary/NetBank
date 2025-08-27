<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="CustomerMain.jsp"></jsp:include>
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
	   right:35%;
	}
</style>
</head>
<body>

<div class="form" style="width:30%;margin:50px auto;">
<h2 class="text-primary">UPDATE CUSTOMER</h2>
<form action="CustomerDelServ" method="post">

	 <input type="text" class="form-control" name="cid"  placeholder="ENTER THE CUSTOMER ID"/>
	 		 <input type="submit" class="btn btn-primary" value="DELETE"/>
	</form>
</div>
</body>