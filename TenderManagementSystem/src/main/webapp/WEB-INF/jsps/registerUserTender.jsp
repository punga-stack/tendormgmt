<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="bootstrap.min.css" rel="stylesheet" />
<style type="text/css">
.er {
	color: red;
}
</style>
</head>
<body>
	<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
	<h2 align="center">Register Tender Screen</h2>

	<f:form action="registerTenderData" method="post"
		modelAttribute="tenderUserData">
		<center>
			<div>
				<table style="margin-left: auto; margin-right: auto;">
					<center>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td class="al"><label>Tender Id :</label></td>
							<td><f:input path="tenderId" readonly="true" /></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><label class="al">Tender Name:</label></td>
							<td><f:input path="tenderName" readonly="true" /></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td class="al"><label>Contractor Id :</label></td>
							<td><f:input path="conId" readonly="true" /></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><label class="al">Contractor UserName:</label></td>
							<td><f:input path="conName" readonly="true" /></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><label class="al">Your UserId:</label></td>
							<td><f:input path="userId" readonly="true" /></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><label class="al">Your UserName:</label></td>
							<td><f:input path="userName" readonly="true" /></td>
						</tr>
						<tr>
							<td><br></td>
						</tr>
						<tr>
							<td><label class="al">BidPrice:</label></td>
							<td><f:input path="bidPrice" type="number" min="${bidPrice }"/>
								</td>
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
	height: 450px;
	background: rgba(255, 255, 255, 0.7)
}

body {
	background-color: #C0C0C0;
}
</style>
</html>