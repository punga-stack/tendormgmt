<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Signup</title>
<link href="bootstrap.min.css" rel="stylesheet"/> 
<style>
.er{
color: red;

}
</style>
</head>
<body>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<h2 style="margin-top: 170px;"><center> SignUp </center></h2>
<body bgcolor="cyan">
        <f:form action="signupdata" method="post" modelAttribute="signData">
        <center>
        <div>
            <table style="margin-left:auto;margin-right:auto;">
                <center>
                    <tr><td><br></td></tr>
                <tr>
                <td class="al"><label>Name:</label></td>
                <td><f:input path="name" /> <f:errors path="name" class="er"/><br></td>
                </tr>
                <tr><td><br></td></tr>
                <tr>
                <td><label class="al">Job Role:</label></td>
                <td><f:input path="jobrole" /> <f:errors path="jobrole" class="er"/></td> 
                </tr>
                <tr><td><br></td></tr>
                <tr>
                <td class="al"><label>Gender:</label></td>
                <td><f:radiobutton path="gender" value="male"/>Male
                <f:radiobutton path="gender" value="female"/>Female
                <f:errors path="gender" class="er"/>
                </td>
                <tr><td><br></td></tr>
                <tr>
                <td><label class="al">Age:</label></td>
                <td><f:input path="age" /> <f:errors path="age" class="er"/></td> 
                </tr>
                <tr><td><br></td></tr>
                <tr>
                <td><label class="al">Email:</label></td>
                <td><f:input path="email" /> <f:errors path="email" class="er"/></td> 
                </tr>
                <tr><td><br></td></tr>
                <tr>
                <td><label class="al">Phone No:</label></td>
                <td><f:input path="phoneno" /> <f:errors path="phoneno" class="er"/></td> 
                </tr>
                <tr><td><br></td></tr>
                <tr>
                <td><label class="al">Username:</label></td>
                <td><f:input path="susername" /> <f:errors path="susername" class="er"/></td> 
                </tr>
                <tr><td><br></td></tr>
                <tr>
                <td><label class="al">Password:</label></td>
                <td><f:input type="password" path="pwd" /> <f:errors path="pwd" class="er"/></td> 
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
            width: 500px; height: 550px;
            background: rgba(255, 255, 255, 0.7) 

            }
        body
        {
        background-color:#C0C0C0;
        }
    </style>
</html>