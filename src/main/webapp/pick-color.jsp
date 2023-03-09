<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Pick a Color</title>
</head>
<body>

<form method="POST" action="/pickcolor">
    <input name="color" type="text">
    <button type="submit">Submit</button>
</form>

</body>
</html>