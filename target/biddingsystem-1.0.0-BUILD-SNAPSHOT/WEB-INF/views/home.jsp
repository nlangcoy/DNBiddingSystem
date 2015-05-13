<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>FPT Bidding System</title>
</head>
<body>
		<c:url value="/showMessage.html" var="messageUrl" />
		<h1>FPT Bidding System</h1>
		<label for= "username1">Username: </label><input type="text" name="username" maxlength= 20 id="uName" ><br><br>
  		<label for= "password1">Password: </label><input type="password" name="password" maxlength= 20 id="pWord" ><br><br>
		
		<span style="padding-left:70px">
			<a href="sign_up"> Sign Up </a>
		</span>
	
		<span style="padding-left:30px">
			<button id= "btnReg" type="button" onclick="Link()">Log In</button>
		</span>
	
		<script>
			function Link(){
				var myusername= document.getElementById('uName').value;
				var mypassword= document.getElementById('pWord').value;
				if(!myusername.match(/\S/)){
					if(!mypassword.match(/\S/)){
						alert('Required to input username and password!');
					}
				}
				else{
					window.location.href="profile"
				}
				
			}
		</script>
	</body>

</html>
