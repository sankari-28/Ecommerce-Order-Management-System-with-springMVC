<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/styles.css">
</head>
<body>

<h2>All Orders</h2>

<table>
<tr>
<th>ID</th><th>Name</th><th>Product</th><th>Qty</th><th>Price</th><th>Action</th>
</tr>

<c:forEach var="o" items="${orders}">
<tr>
<td>${o.orderId}</td>
<td>${o.customerName}</td>
<td>${o.productName}</td>
<td>${o.quantity}</td>
<td>${o.price}</td>
<td>
<a href="edit?id=${o.orderId}">Edit</a>
<a href="delete?id=${o.orderId}">Delete</a>
</td>
</tr>
</c:forEach>

</table>

</body>
</html>