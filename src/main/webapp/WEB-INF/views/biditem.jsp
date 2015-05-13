<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FPT Bidding System</title>

<style>
div {
    width: 320px;
    padding: 10px;
    border: 5px solid gray;
    margin: 0;
}
</style>
</head>
<body>
	<h1>FPT Bidding System</h1>
	<h2>Bidding Item:</h2>
	<div>
		<label for="lastbid_price"> Last Bid: </label>
		<br>
		<br>
		<label for ="last_bidder"> Last Bidder:</label>
	</div>
	<br><br><br>
	<h3>Bidding Form</h3>
	<div>
		<label for="lastbid_price"> Bid Amount: </label>
		<br>
		<form>
			<input type= "text" name="bid_amount"><br>
			<span style="padding-left:60px"><input type="submit" value="Bid"></span>
		</form>
	</div>
	
</body>
</html>