<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Portal</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body bgcolor="#C0C0C0">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">User Portal</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="viewUserTenderList/${userData.sid }/${userData.susername }">Register Tender</a></li>
      <li><a href="myBiddings/${userData.sid }">My Biddings</a></li>
      <li><a href="myconfirmBiddings">Confirm Biddings</a></li>
      <li><a href="logout">Logout</a></li>
    </ul>
  </div>
</nav>
<h2><center>Welcome ${userData.susername }!!!</center></h2>
</body>
</html>