<html>
<head>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/styles.css">
</head>
<body>

<div class="container">
    <h2>Add Order</h2>

    <form action="save" method="post">
        <input name="customerName" placeholder="Customer Name">
        <input name="productName" placeholder="Product Name">
        <input name="quantity" placeholder="Quantity">
        <input name="price" placeholder="Price">

        <button>Add Order</button>
    </form>
</div>

</body>
</html>