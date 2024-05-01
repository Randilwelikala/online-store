<%-- 
    Document   : adminProduct
    Created on : May 1, 2024, 8:33:48 PM
    Author     : dilshara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Add Product</title>
</head>
<body>
    <h1>Add Product</h1>
    <form action="AdminPanelServlet" method="post">
        <!-- Add input fields for product details -->
        <input type="hidden" name="action" value="addProduct">
        <input type="submit" value="Add Product">
    </form>
</body>
</html>
