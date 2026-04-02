<html>
<head>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/styles.css">
</head>
<body>

<div class="container">
    <h2>Update Order</h2>

    <form action="update" method="post">
        <input type="hidden" name="orderId" value="${order.orderId}">

        <input name="customerName" value="${order.customerName}">
        <input name="productName" value="${order.productName}">
        <input name="quantity" value="${order.quantity}">
        <input name="price" value="${order.price}">

        <button>Update</button>
    </form>
</div>

</body>
</html>