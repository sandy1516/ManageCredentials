<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <div>
	        <form:form action="saveUser" method="POST" commandName="user">
		        User Name: <form:input path="username" /> <br/>
	        	Password: <form:input path="password"/> <br/>
	        	Email Id: <form:input path="email"/> <br/>
	        	<input type="submit" value="Submit" />
			</form:form>
    	</div>
    </body>
</html>