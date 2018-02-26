<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>
		<u>Enter the Customer details</u>
	</h3>
	<%-- <form action="UpdateServlet" method="doupdate"> --%>
	
		<c:forEach items="${users}" var="user">
			<label for="userid">Customer Code</label>
			<input type="text" name="customer_code" readonly id="customer_code"
				value="<c:out value="${user.customer_code}" />">
			</br>
			</br>

			<label for="username">Customer Name</label>
			<input type="text" name="customer_name" id="customer_name"
				value="<c:out value="${user.customer_name}" />">
			</br>
			</br>

			<label for="add1">Address 1</label>
			<textarea class="form-control" rows="3" id="customer_add1"
				name="customer_add1"><c:out
					value="${user.customer_add1}" /></textarea>
			</br>
			</br>

			<label for="add1">Address 2</label>
			<textarea rows="3" id="customer_add2" name="customer_add2"><c:out
					value="${user.customer_add2}" /></textarea>
			</br>
			</br>

			<label for="pincode">PIN Code</label>
			<input type="text" name="pincode" id="pincode"
				value="<c:out value="${user.pincode}" />">
			</br>
			</br>

			<label for="email">Email Id</label>
			<input type="text" name="email" id="email"
				value="<c:out value="${user.email}" />">
			</br>
			</br>

			<label for="contact">Contact No: </label>
			<input type="text" name="customer_contactno" id="customer_contactno" class="form-control"
				id="customer_contactno"
				value="<c:out value="${user.customer_contactno}" />">
			</br>
			</br>


			<label for="Primary Contact Person">Primary Contact Person: </label>
			<input type="text" name="primary_contact" id="primary_contact" class="form-control"
				id="primary_contact"
				value="<c:out value="${user.primary_contact}" />">
			</br>
			</br>

			<label for="AI flag">Active/Inactive Flag</label>
			<select name="aiflag" id="aiflag">
				<option value="A">Active</option>
				<option value="I">Inactive</option>
			</select>
			<br>
			
			<label>CHK BOX</label>
			<input type="checkbox" value="C" name="chk" id="chk">
			
			<button type="submit">Submit</button>
			<input class="btn btn-success col-md-offset-5" type="button"
				id="invokejq" value="testjq" onclick="myFunction">
			<input class="btn btn-success col-md-offset-5" type="button"
				id="invokejq" value="OnLoad" onclick="myFunction">
			<input class="btn btn-success col-md-offset-5" type="button"
				id="invokejq" value="OnSubmit" onclick="myFunctionCompare">
			<!--   <button type="reset">Reset</button> -->
			<button onclick="myFunction()">Try it</button>
			<button onclick="myFunctionCompare()">After Try</button>
			

		</c:forEach>
	
	<input type="button" value="onload" onclick="myFunction">
	<form action="LogoutServlet">
		<input type="submit" value="Logout" />
	</form>
	<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
	<script type="text/javascript">
	alert("function invoked");
	
	var arrOnLoad = [];
	var onSubmit = [];
	var inputData = ["customer_code","customer_name","customer_add1","customer_add2","pincode","email","customer_contactno","primary_contact","aiflag","chk"];

	function myFunction() {
		alert("function invoked");
		  for(var i=0; i<inputData.length; i++){
		    arrOnLoad.push(document.getElementById(inputData[i]).value);
		  }
		  console.log(arrOnLoad);
		}	

	function myFunctionCompare(){
		alert("function invoked");
		for(var j=0; j<inputData.length; j++){
	    	onSubmit.push(document.getElementById(inputData[j]).value);
	    }
	    console.log(onSubmit);
	    
	    for(var k=0; k<inputData.length; k++){
	    	if(arrOnLoad[k] != onSubmit[k]){
	        	alert(" the values are not same ");
	        }
	    }
	}	
	</script>
</body>
</html>