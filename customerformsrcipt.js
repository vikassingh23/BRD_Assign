$("#customercode").change(function(){
	//alert($("#customername").val());
	var customername=$.trim($("#customercode").val());
	 
	if(!(customername.match(/^[a-z0-9]/))){	
		$("#customercode").focus();
		alert("Please use char and number value");
		$(this).val("");
		
	}
});

$("#customername").change(function(){
	//alert($("#customername").val());
	var customername=$.trim($("#customername").val());
	 
	if(!(customername.match(/^[a-zA-Z]+$/))){		
		$("#customername").focus();
		alert("Please use char value");
		$(this).val("");
	}
});

$("#customerpincode").change(function(){
	//alert($("#customerpincode").val());
	var customerpincode=$.trim($("#customerpincode").val());
	 
	if(!(customerpincode.match(/^[0-9]{6}+$/))){
		$("#customerpincode").focus();
		alert("Please use number value");
		$(this).val("");
	}
});

$("#email").change(function(){
	//alert($("#email").val());
	var email=$.trim($("#email").val());
	 
	if(!(email.match(/^[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,4}$+$/)){
	$("#email").focus();
		alert("Please use char value");
		$(this).val("");
	}
});

$("#customernumber").change(function(){
	//alert($("#customernumber").val());
	var customernumber=$.trim($("#customernumber").val());
	 
	if(!(customernumber.match(/^[0-9]{10}+$/))){
		$("#customernumber").focus();
		alert("Please use char value");
		$(this).val("");
	}
});

$("#primarycontactPerson").change(function(){
	//alert($("#primarycontactPerson").val());
	var primarycontactPerson=$.trim($("#primarycontactPerson").val());
	 
	if(!(primarycontactPerson.match(/^[a-zA-Z]+$/))){
		$("#primarycontactPerson").focus();
		alert("Please use char value");
		$(this).val("");
	}
});



$("#save").click(function(){
	//alert($("#username").val());
	var customercode=$.trim($("#customercode").val());	 
	var customername=$.trim($("#customername").val());
	var customeradd1=$.trim($("#customeradd1").val());
	var customeradd2=$.trim($("#customeradd2").val());
	var customerpincode=$.trim($("#customerpincode").val());
	var customernumber=$.trim($("#customernumber").val());
	var primarycontactPerson=$.trim($("#primarycontactPerson").val());
	var email=$.trim($("#email").val());
	
	if(customercode !="" && customername!="" && customeradd1!="" && customeradd2!="" && customerpincode!="" && customernumber!="" && primarycontactPerson!="" && email!="" ){
		$("#form").submit();
	}else{
		alert("Please fill all the values");
	}
});