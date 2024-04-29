<%-- 
    Document   : checkout
    Created on : Apr 28, 2024, 1:15:33 PM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Checkout</title>
</head>
<body>
    <h2>Checkout</h2>
    <!-- Display cart items and total price -->
    <ul>
        <li>Product 1 - Quantity: 2</li>
        <li>Product 2 - Quantity: 1</li>
        <!-- Add more cart items dynamically -->
    </ul>
    <p>Total Price: $100.00</p>
    <!-- Add checkout form and payment processing here -->
    <form action="CheckoutServlet" method="post">
        <input type="submit" value="Proceed to Checkout">
    </form>
</body>
</html>
