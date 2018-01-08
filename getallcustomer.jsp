<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="https://cdn.datatables.net/1.10.16/css/dataTables.jqueryui.min.css">
<script	src="https://code.jquery.com/jquery-1.12.4.js"></script>
<!-- <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
<script src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script	src="https://cdn.datatables.net/1.10.16/js/dataTables.jqueryui.min.js"></script>

<script type="text/javascript">
	$(document).ready(function() {
		$('#abc').DataTable({
		 "scrollY": 200,
	        "scrollX": true});
	});
</script>
</head>
<body>

<form id="form" action="ActiveRec" method="post">
<h2>Customer Table</h2>

<table id="abc" class="display" cellspacing="0" width="100%">
        <thead>
            <tr>
                <th>Select</th>
<!--                 <th>customer_code</th> -->
<c:forEach items="${head}" var="head">
                <th>${head}</th>
<!--                 <th>customer_add1</th> -->
<!--                 <th>customer_add2</th> -->
<!--                 <th>pincode</th> -->
<!--                 <th>email</th> -->
<!--                 <th>customer_contactno</th> -->
<!--                 <th>primary_contact</th> -->
<!--                 <th>record_status</th> -->
<!--                 <th>aiflag</th> -->
<!--                 <th>createdate</th> -->
<!--                 <th>createdby</th> -->
<!--                 <th>modifydate</th> -->
<!--                 <th>modifyby</th> -->
<!--                 <th>authdate</th> -->
<!--                 <th>authby</th> -->
              </c:forEach>   
                
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${users}" var="user">
                <tr>
                   <td><input type="checkbox" name="selectedItems" value="${user.customer_code}"></td>	                    
                    <td><c:out value="${user.customer_name}" /></td>
                    <td><c:out value="${user.customer_add1}" /></td>
                    <td><c:out value="${user.customer_add2}" /></td>
                    <td><c:out value="${user.pincode}" /></td>
                    <td><c:out value="${user.email}" /></td>
                    <td><c:out value="${user.customer_contactno}" /></td>
                    <td><c:out value="${user.primary_contact}" /></td>
                    <td><c:out value="${user.record_status}" /></td>
                    <td><c:out value="${user.aiflag}" /></td>
                    <td><c:out value="${user.createdate}" /></td>
                    <td><c:out value="${user.createdby}" /></td>
                    <td><c:out value="${user.modifydate}" /></td>
                    <td><c:out value="${user.modifyby}" /></td>
                    <td><c:out value="${user.authdate}" /></td>
                    <td><c:out value="${user.authby}" /></td>
                    
                </tr>
            </c:forEach>
        </tbody>
    </table>
    <input type="submit" value="Active"/>
    </form>
    
    <form action="login.jsp">
<input type="submit" value="Logout"/>
</form>
<form action="WelcomeServlet" method="post">
<input type="submit" value="Cancel"/>
</form>
</body>
</html>