<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

</head>
<body>

<script type="text/javascript">
	function submit(){
		alert(1);	
		var getCustCode = document.getElementById("customer_code").value;
		document.getElementById("hd1").value = getCustCode;
		alert(2);
		document.getElementById("form1").submit();
	}
	
</script>

<form action="DeleteCustomer" method="post">
	Enter Customer code: <input type="text" name="customer_code" id="customer_code"/><br/>
	<input type="submit" value="Submit"/>
</form>

<input type="button" value="Try It" onclick="submit()"/>

<form action="DeleteCustomer" id="form1"  method="post">
	<input type="hidden" id="hd1" name="hd1" value="">	
</form>

</body>
</html>