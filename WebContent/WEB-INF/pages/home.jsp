<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <div>
        <form action="saveUser" method="POST">
        	User Name: <input type="text" name="username"> <br />
        	Password: <input type="text" name="password" /> <br />
        	Email Id: <input type="text" name="email" />
        	<input type="submit" value="Submit" />
    </form>
    </div>
    </body>
</html>