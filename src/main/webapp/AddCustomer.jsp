<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="CustomerMain.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>CUSTOMER ADD PAGE</title>
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
<h2 class="text-primary">ADD CUSTOMER</h2>
<form action="CustomerAddServ" method="post">

	 <input type="text" class="form-control" name="cid"  placeholder="ENTER THE CUSTOMER ID"/>
		<input type="text" class="form-control" name="cname" placeholder="ENTER CUSTOMER NAME"/>
			<input type="text" class="form-control" name="cphno" placeholder="ENTER THE PHONE NUMBER"/>
			<input type="email" class="form-control" name="cemail" placeholder="ENTER THE EMAIL"/>
			<input type="text" class="form-control" name="cadhar" placeholder="ENTER THE ADHAR NUMBER"/>
			<input type="text" class="form-control" name="cpanno" placeholder="ENTER THE PAN NUMBER"/>
	 		 <input type="submit" class="btn btn-primary" value="SAVE"/>
	</form>
</div>
</body>
</html>