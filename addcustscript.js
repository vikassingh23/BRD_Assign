$("#customer_code").change(function(){
	//alert($("#customername").val());
	var customername=$.trim($("#customer_code").val());
	 
	if(!(customername.match(/^[a-z0-9]/))){	
		$("#customer_code").focus();
		alert("Please use char and number value");
		$(this).val("");
		
	}
});

$("#customer_name").change(function(){
	//alert($("#customername").val());
	var customername=$.trim($("#customer_name").val());
	 
	if(!(customername.match(/^[a-zA-Z\s]+$/))){		
		$("#customer_name").focus();
		alert("Please use char value");
		$(this).val("");
	}
});


$("#pincode").change(function(){
	var pincode=$.trim($("#pincode").val());
	if($.isNumeric(pincode)){
		if(pincode.length != 6){
			$("#pincode").focus();
			alert("enter correct pincode");
			$(this).val("");
		}
	}else{
		$("#pincode").focus();
		alert("only numeric char allowed");
		$(this).val("");
	}
})


$("#email").change(function(){
	//alert($("#email").val());
	var email=$.trim($("#email").val());
	 
	if(!(email.match(/^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$/))){
	$("#email").focus();
		alert("Please use char value");
		$(this).val("");
	}
});


$("#customer_contactno").change(function(){
	//alert($("#customernumber").val());
	var customernumber=$.trim($("#customer_contactno").val());
	
	if(!(customernumber.match(/^[789]\d{9}$/))){
		if(customernumber.length != 10){
			$("#customer_contactno").focus();
			alert("enter correct mobile number");
			$(this).val("");
		}
		$("#customer_contactno").focus();
		alert("Please use numbers only");
		$(this).val("");
	}
});

$("#primary_contact").change(function(){
	//alert($("#primarycontactPerson").val());
	var primarycontactPerson=$.trim($("#primary_contact").val());
	 
	if(!(primarycontactPerson.match(/^[a-zA-Z\s]+$/))){
		$("#primary_contact").focus();
		alert("Please use char value");
		$(this).val("");
	}
});

$("#save").click(function(){
	//alert($("#username").val());
	var customercode=$.trim($("#customer_code").val());	 
	var customername=$.trim($("#customer_name").val());
	var customeradd1=$.trim($("#customer_add1").val());
	var customeradd2=$.trim($("#customer_add2").val());
	var customerpincode=$.trim($("#pincode").val());
	var customernumber=$.trim($("#customer_contactno").val());
	var primarycontactPerson=$.trim($("#primary_contact").val());
	var email=$.trim($("#email").val());
	
	if(customercode !="" && customername!="" && customeradd1!="" && customeradd2!="" && customerpincode!="" && customernumber!="" && primarycontactPerson!="" && email!="" ){
		$("#form").submit();
	}else{
		alert("Please fill all the values");
	}
});
