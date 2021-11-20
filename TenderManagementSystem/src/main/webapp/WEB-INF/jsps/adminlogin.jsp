<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
<link href="bootstrap.min.css" rel="stylesheet"/> 
<style>
.er{
color: red;

}
</style>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<h2 style="margin-top: 170px;"><center> Login </center></h2>
<body bgcolor="cyan">
        <f:form action="home" method="post" modelAttribute="logData">
        <center>
        <div>
            <table style="margin-left:auto;margin-right:auto;">
                <center>
                    <tr><td><br></td></tr>
                <tr>
                <td class="al"><label>Username:</label></td>
                <td><f:input path="username" /> <f:errors path="username" class="er"/><br></td>
                </tr>
                <tr><td><br></td></tr>
                <tr>
                <td><label class="al">Password:</label></td>
                <td><f:input type="password" path="password" /> <f:errors path="password" class="er"/></td> 
                </tr>
                <tr><td><br></td></tr>
                <tr>
                <td><label class="al">LoginAs:</label></td>
                <td>
                               <f:select type="text" path="loginAs" id="pay">
                                <f:option value=" "> </f:option>
                                <f:option value="Admin">Admin</f:option>
                                <f:option value="Contractor">Contractor</f:option>
                                <f:option value="User">User</f:option>
                                </f:select>
                </td>
                <td><a href="signup">New User? SignUp</a></td>
                </tr>
                <tr><td><br></td></tr>
                <tr>
                <td><button type="submit" class="btn btn-primary">Login</button></td>
                <td><button type="reset" class="btn btn-primary">Reset</button></td>
                </tr>
                </center>
            </table>
        </div>
        </center>
        </f:form>
        
    </body>
    <style>
        .al
        {
            font-size: 18px;
            font-family:Georgia, 'Times New Roman', Times, serif;
        }
        div {
            text-align: center;
            margin: 30px;
            width: 500px; height: 330px;
            background: rgba(255, 255, 255, 0.7) 

            }
        body
        {
        background-color:#C0C0C0;
        }
    </style>
</body>
</html>