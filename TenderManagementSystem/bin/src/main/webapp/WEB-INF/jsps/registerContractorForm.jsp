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
	<h2 align="center">Contractor Registration Screen</h2>

	<f:form action="insertContractor" method="post"
		modelAttribute="conData">
		<center>
			<div>
				<table style="margin-left: auto; margin-right: auto;">
					<center>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td class="al"><label>Id :</label></td>
							<td><f:input path="conId" /> <f:errors path="conId"
									class="er" /></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><label class="al">Name:</label></td>
							<td><f:input path="conName" /> <f:errors path="conName"
									class="er" /></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><label class="al">Company Name:</label></td>
							<td><f:input path="companyName" /> <f:errors
									path="companyName" class="er" /></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><label class="al">Address:</label></td>
							<td><f:input path="address" /> <f:errors path="address"
									class="er" /></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><label class="al">Phone No:</label></td>
							<td><f:input path="conPhoneno" /> <f:errors
									path="conPhoneno" class="er" /></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><label class="al">Email:</label></td>
							<td><f:input path="conEmail" /> <f:errors path="conEmail"
									class="er" /></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><label class="al">Username:</label></td>
							<td><f:input path="conUsername" /> <f:errors
									path="conUsername" class="er" /></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><label class="al">Password:</label></td>
							<td><f:input type="password" path="conPassword" /> <f:errors
									path="conPassword" class="er" /></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
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