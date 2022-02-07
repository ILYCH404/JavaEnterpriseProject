<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Meals</title>
</head>
<body>
<h3><a href="index.html">Home</a></h3>
<hr>
<h2>Meals</h2>
<hr>
<table cols="5" border="1" bordercolor="black" cellpadding="9">
    <thead>
    <tr>
        <th>Date</th>
        <th>Description</th>
        <th>Calories</th>
        <th></th>
        <th></th><%--style = "color: ${meals.exceed ? 'green' : 'red'}"--%>
    </tr>
    </thead>
    <tbody> <%--style = "color: red"--%>
    <c:forEach var="meals" items="${mealsWE}">
        <tr style = "color: ${meals.excess ? "green" : "red"}">
            <td>
                <fmt:parseDate value="${ meals.dateTime }" pattern="yyyy-MM-dd'T'HH:mm" var="parsedDateTime"
                               type="both"/>
                <fmt:formatDate pattern="dd.MM.yyyy HH:mm" value="${ parsedDateTime }"/>
            </td>
            <td>${meals.description}</td>
            <td>${meals.calories}</td>
            <td>Update</td>>
            <td>delete</td>
        </tr>
        <%--<td><c:out value="${meals.dateTime}" /></td>--%>
        <%--<li><c:out value="${meals.description}" /></li>--%>
    </c:forEach>
    </tbody>

</table>
</body>
</html>
