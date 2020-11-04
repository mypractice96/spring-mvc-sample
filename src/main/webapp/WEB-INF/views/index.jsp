
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
 
<style type="text/css">
body {
	background-color: blue;
	color:white;
}
td{
text-align: center;
}
</style>
 
<title>Spring MVC : Sample</title>

</head>
 
<body>

  
    <div>
     <h1>Welcome, This is a sample Java web application </h1>
    </div>
    <br>
    
    <div>
     <h2>This response is from the following server </h2>
    </div>
    
	<div align="center">
		<table width="100%" border=1>
		 <tr>
		   <th><h2>Host Name</h2> </th>
		   <th> <h2>Host Address</h2> </th>
		 </tr>
		 <tr>
		   <td><h2>${hostName}</h2> </td>
		   <td> <h2>${hostAddress}</h2> </td>
		 </tr>
		</table>
	</div>
	
	
</body>
 
</html>
