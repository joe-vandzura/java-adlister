<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (username != null && username.equalsIgnoreCase("admin") && password != null && password.equalsIgnoreCase("password")) {
        response.sendRedirect("/profile.jsp");
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>JSP Exercise</title>
</head>

<body>

<h1>Hello</h1>

<form method="POST" action="login.jsp">
    <label for="username-input">Username</label>
    <input id="username-input" name="username" placeholder="Enter your username">
    <br>
    <br>
    <label for="password-input">Password</label>
    <input id="password-input" name="password">
    <button type="submit">Submit</button>
</form>


</body>


</html>

