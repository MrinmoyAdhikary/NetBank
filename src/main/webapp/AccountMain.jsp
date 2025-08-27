<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:include page="AccountNav.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel='stylesheet' href='https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css'>
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" >
<link href="https://fonts.googleapis.com/css2?family=Caveat:wght@400..700&family=Open+Sans:ital,wght@0,300..800;1,300..800&family=Playwrite+GB+S:ital,wght@0,100..400;1,100..400&family=Tinos:ital,wght@0,400;0,700;1,400;1,700&display=swap" rel="stylesheet">
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0&icon_names=favorite" /> 
<link rel="stylesheet" href="AccountMain.css">

</head>
<body>

<div class="main">
  <h3>Make Banking Easy <br>With MY BANK<span class="material-symbols-outlined">
favorite
</span></h3>
</div>
<% if(request.getAttribute("msg") != null) { %>
   <div class="alert alert-info"><%= request.getAttribute("msg") %></div>
<% } %>

</body>
</html>