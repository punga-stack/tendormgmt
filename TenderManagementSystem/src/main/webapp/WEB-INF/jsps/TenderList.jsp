<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tender List</title>
</head>
<body bgcolor="#C0C0C0">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<table align="center">
		<tr>
			<th><h2>Tender Id</h2></th>
			<th><h2>Tender Name</h2></th>
			<th><h2>Tender Desc</h2></th>
			<th><h2>Contractor Id</h2></th>
			<th><h2>Contractor Name</h2></th>
			<th><h2>Base Price</h2></th>
			<th><h2>Deadline</h2></th>
		</tr>
		
		<c:forEach var="dt" items="${tenderData }">   
		
			<tr>
				<td><h2><c:out value="${dt.tenderId }" /></h2></td>
				<td><h2><c:out value="${dt.tenderName }" /></h2></td>
				<td><h2><c:out value="${dt.tenderDesc }" /></h2></td>
				<td><h2><c:out value="${dt.conId }" /></h2></td>
				<td><h2><c:out value="${dt.conName }" /></h2></td>
				<td><h2><c:out value="${dt.basePrice }" /></h2></td>
				<td><h2><c:out value="${dt.deadline }" /></h2></td>
			</tr>


		</c:forEach>
	</table>
		
</body>
<style>
    th,tr{
    	height:50px;
    	border:2px black solid;
    	
    }
   
    td{
    	min-width:145px;
    	border: 2px dashed black;
    }
 table{
    	text-align:center;
    	border-radius:10px;
		border:1px black solid;
		text-align:center;
		background-color:#C0C0C0 ;
		margin:20px;
		color:black;
		font-style:normal;
		font-size: 15.5px;
		padding:20px;
		cellpadding:10;
		cellspacing:10;
    }
    tr:hover{
    	background-color: #DEBEE1;
    	color:black;
    } 
    
    </style>
</html>