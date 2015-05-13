<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FPT Bidding System</title>
</head>
<body>
        <div align="center">
            <h1>FPT Bidding Item List</h1>
            <table border="1">
                <th>No</th>
                <th>Item Name</th>
                <th>Item Current Price</th>
                <th>Action</th>
                 
                <c:forEach var="bid" items="${listContact}" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td></td>
                    <td></td>
                    <td>
                        <a href="/bidding?id=${contact.id}">Bid Now!</a>
                    </td>
                             
                </tr>
                </c:forEach>             
            </table>
        </div>
    </body>
</html>