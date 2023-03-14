<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Ads.com</title>
</head>
<body>
<h1>Here are your ads: </h1>

    <c:forEach var="ads" items="${ads}">
        <div class="my-li">${ads}</div>
    </c:forEach>

</body>
</html>