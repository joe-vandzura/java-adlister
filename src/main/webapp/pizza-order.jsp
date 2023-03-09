<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Order Pizza</title>
</head>
<body>

<h1>Fill Out the Form For Your Pizza!</h1>

<form method="POST" action="${pageContext.request.contextPath}/pizza-order">

        <label>Crust
            <select name="crust">
                <option value="normal">Normal</option>
                <option value="thin">Thin</option>
            </select>
        </label>

    <br>

        <label>Sauce
            <select name="sauce">
                <option value="marinara">Marinara</option>
                <option value="pesto">Pesto</option>
            </select>
        </label>

    <br>

        <label>Size
            <select name="size">
                <option value="14" name="14">14 in</option>
                <option value="18" name="14">18 in</option>
            </select>
        </label>

    <br>

        <label>Toppings</label><br>

        <input type="checkbox" id="pepperoni" name="pepperoni" value="Pepperoni">
        <label for="pepperoni">Pepperoni</label><br>
        <input type="checkbox" id="cheese" name="cheese" value="Cheese">
        <label for="cheese">Cheese</label><br>

    <br>

        <label>Address:
            <input type="text" name="address">
        </label>

    <br>

    <button type="submit">Submit</button>

</form>


</body>
</html>