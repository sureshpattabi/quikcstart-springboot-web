<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<link type="text/css" href="resources/css/bootstrap.min.css"
	rel="stylesheet" />
	
<script type="text/javascript" src="resources/js/helloeverything.js"></script>

<title>Hello Everything - Spring boot</title>
</head>
<body>
	<h2>Employee List</h2>
	<form:form method="post" action="addEmployee">

		<table class="table table-striped">
			<thead style="background-color: blue; color: white;">
				<tr>
					<th>Employee ID</th>
					<th>Name</th>
					<th>email</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${employeesForm}" var="employee"
					varStatus="status">

					<tr>
						<td>${employee.empNumber}</td>
						<td>${employee.name}</td>
						<td>${employee.email}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<!-- <div>
			<input type="text" value="name"> 
			<input type="text" value="email"> 
			<input type="submit" value="">
		</div> -->

	</form:form>
</body>
</html>