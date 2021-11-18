<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="bootstrap.min.css" rel="stylesheet"/> 
<style type="text/css">
.er {
	color: red;
}
</style>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
	<h2 align="center">Tender Registration Screen</h2>

	<f:form action="registerTender" method="post"
		modelAttribute="tenData">
		<center>
			<div>
				<table style="margin-left: auto; margin-right: auto;">
					<center>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td class="al"><label>Tender Id :</label></td>
							<td><f:input path="tenderId" /> <f:errors path="tenderId"
									class="er" /></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><label class="al">Tender Name:</label></td>
							<td><f:input path="tenderName" /> <f:errors path="tenderName"
									class="er" /></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><label class="al">Tender Desc:</label></td>
							<td><f:input path="tenderDesc" /> <f:errors
									path="tenderDesc" class="er" /></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td class="al"><label>Contractor Id :</label></td>
							<td><f:input path="conId" /> <f:errors path="conId"
									class="er" /></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><label class="al">Contractor Name:</label></td>
							<td><f:input path="conName" /> <f:errors path="conName"
									class="er" /></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><label class="al">BasePrice:</label></td>
							<td><f:input path="basePrice" /> <f:errors path="basePrice"
									class="er" /></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><label class="al">Deadline:</label></td>
							<td><f:input type="date" path="deadline" /> <f:errors
									path="deadline" class="er" /></td>
						</tr>
						<td><br></td>
						<tr>
							<td><button type="submit" class="btn btn-primary">Register</button></td>
							<td><button type="reset" class="btn btn-primary">Reset</button></td>
						</tr>
					</center>
				</table>
			</div>
		</center>

	</f:form>
</body>
<style>
.al {
	font-size: 18px;
	font-family: Georgia, 'Times New Roman', Times, serif;
}

div {
	text-align: center;
	margin: 30px;
	width: 500px;
	height: 550px;
	background: rgba(255, 255, 255, 0.7)
}

body {
	background-color: #C0C0C0;
}
</style>
</html>