<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3><u>Enter the Customer details</u></h3>
<form id="form" action="CreateServlet" method="post">

<label for="userid">Customer Code</label>
<input type="text" name="customer_code" id="customer_code">
</br></br>

<label for="username">Customer Name</label>
<input type="text" name="customer_name" id="customer_name"></br></br>

<label for="add1">Address 1</label>
<textarea class="form-control" rows="3" id="customer_add1" name="customer_add1"></textarea></br></br>

<label for="add1">Address 2</label>
<textarea rows="3" id="customer_add2" name="customer_add2"></textarea></br></br>

<label for="pincode">PIN Code</label>
<input type="text" name="pincode" id="pincode"></br></br>

<label for="email">Email Id</label>
<input type="email" name="email" id="email"></br></br>

<label for="contact">Contact No: </label>
<input type="text" name="customer_contactno" class="form-control" id="customer_contactno"></br></br>


<label for="Primary Contact Person">Primary Contact Person: </label>
<input type="text" name="primary_contact" class="form-control" id="primary_contact"></br></br>

<label for="AI flag">Active/Inactive Flag</label>
<select name="aiflag">
    <option value="Active">Active</option>
    <option value="Inactive">Inactive</option>
</select>
<br>
<input type="button" id ="save" value="submit"> 
</form>
 <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="addcustscript.js"></script>
</body>
</html>