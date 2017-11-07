<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Prducts</title>
</head>
<body>
<center>
    <h1>Products</h1>
    <h2>
        <a href="addProduct.jsp">Add New Product</a>
    </h2>
</center>
<div align="center">
    <table border="1" cellpadding="5">
        <caption><h2>List of Products</h2></caption>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Price</th>
            <th>Manufacturer</th>
            <th>Action</th>
        </tr>
        <c:forEach var="products" items="${product}">
            <tr>
                <td><c:out value="${products.id}" /></td>
                <td><c:out value="${products.name}" /></td>
                <td><c:out value="${products.price}" /></td>
                <td><c:out value="${products.manufacturer}" /></td>
                <td>
                    <a href="/edit?id=<c:out value='${products.id}' />">Edit</a>
                    &nbsp;&nbsp;&nbsp;&nbsp;
                    <a href="/delete?id=<c:out value='${products.id}' />">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>