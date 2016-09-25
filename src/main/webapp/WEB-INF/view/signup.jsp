<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>
      
<html>
<head>
<c:import url="/head-meta"/>
</head>
<body>
<center>
	<h3>Register your Account</h3>
</center>

<div class="form">
<script type="text/css">
					</script>
					
					<div class="container">
					<div class="row">
					    <div class="col-lg-12 col-centered">
					    	<div class="table-responsive">
					    	
					    	<c:if test="${success != null}">
			                <div class="alert alert-success">
			                	<p>${success}</p>
			                </div>
			                </c:if>
			                
			                <c:if test="${error != null}">
			                <div class="alert alert-danger">
			                	<p>${error}</p>
			                </div>
			                </c:if>
	<form:form method="post" action="AddUser" modelAttribute="User">
	
		<!--  -->
		<table style="width: 80%;" class="table center">
			<tr>
				<td><form:label path="username" for="username">User Name:</form:label></td>
				<td><form:input path="username" type="text"  class="form-control" id="username"/></td> 
			</tr>
			
			<tr>
				<td><form:label path="email" for="email">Email address:</form:label></td>
				<td><form:input path="email" type="email" placeholder="example@domain.com" class="form-control" id="email" autofocus="true"/></td>
			</tr>
			
			<tr>
				<td><form:label path="password" for="password">Password:</form:label></td>
				<td><form:input path="password" type="password" class="form-control" id="password"/></td>
			</tr>
							  	
			<tr>
				<td><form:label path="cPassword" for="cPassword">Confirm Password:</form:label></td>
				<td><form:input path="cPassword" type="password" class="form-control" id="cPassword"/></td>

			</tr>
							  	
			<tr>
				<td><form:label path="phone" for="phone">Phone:</form:label></td>
				<td><form:input path="phone" type="phone" class="form-control" id="phone"/></td>
			</tr>
				
			<tr>
				<td><form:label path="location" for="location">Address:</form:label></td>
				<td><form:textarea path="location" class="form-control" id="location"></form:textarea></td>
			</tr>
							  	
			<tr>
				<td colspan="2" >
					<div class="row">
					    <div class="col-md-2 col-md-offset-5"> <button type="submit" class="btn btn-default">Submit</button> 
					    </div>
					</div>
		  		</td>
		  	</tr>
							  	
		  </table>
		<!--  -->
	
	</form:form>	
</div>	
</div>
</div>
</div>	
</div>

</body>

		

</html>