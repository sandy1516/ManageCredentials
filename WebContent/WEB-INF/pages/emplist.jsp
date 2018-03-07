<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
    <h1>TEST PAGE</h1>
        <div>
        <table>
        <c:forEach var="employee" items="${listEmployee}">
				<tr>
					<td>${employee.username}</td>
					<td>${employee.password}</td>
					<td>${employee.email}</td>
					<td><a href="editEmployee?id=${employee.id}">Edit</a>
						     <a
						href="deleteEmployee?id=${employee.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
    	</div>
    </body>
</html>