<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FPT Bidding System</title>
</head>
<body>
	<form action="pop_up" method="post">
	<h1>FPT Bidding System</h1>
		<span style="padding-left:30px"><input type="text" name="firstname" maxlength= 20 id="firName" >&nbsp;
			<input type="text" name="middlename" maxlength= 20 id="midName">&nbsp;
			<input type="text" name="lastname" maxlength= 20 id="lstName" > &nbsp; <br>
			<span style= "padding-left: 30px"><label for = "fName">First Name</label>&nbsp;&nbsp;
				<label for = "mName" style="padding-left:100px">Middle Name</label>&nbsp;&nbsp;
				<label for = "lName" style="padding-left:80px">Last Name</label> <br><br>
			</span>		
		</span>
		<span style= "padding-left:30px">
			<label for="eAd">Email Address:</label><br>
			<span style = "padding-left:30px"><input type="text" name="emailAd" maxlength=20 size= 50></span><br><br>
			<label for= "username2" style = "padding-left:30px">Username: </label><input type="text" name="username2" maxlength= 20 id= "uName2"><br><br>
  			<label for= "password2" style = "padding-left:30px">Password: </label><input type="password" name="password2" maxlength= 20 id="uPword2"><br><br>
			<label for ="verifyPassword" style = "padding-left:30px"> Verify Password:</label> <input type="password" name="vPassword" maxlength= 20><br><br>
		</span>

		<span style= "padding-left:150px"><input type="submit"></span>
		
	</form>

</body>
</html>