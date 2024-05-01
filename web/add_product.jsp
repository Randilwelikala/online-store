<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Product</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container">
        <h2 class="mt-5">Add Product</h2>
        <form action="AdminAddProductServlet" method="post" class="mt-3">
            <div class="form-group">
                <label for="name">Name:</label>
                <input type="text" class="form-control" id="name" name="name" required>
            </div>
            <div class="form-group">
                <label for="description">Description:</label>
                <textarea class="form-control" id="description" name="description" required></textarea>
            </div>
            <div class="form-group">
                <label for="price">Price:</label>
                <input type="text" class="form-control" id="price" name="price" required>
            </div>
            <div class="form-group">
                <label for="category">Category:</label>
                <input type="text" class="form-control" id="category" name="category">
            </div>
            <div class="form-group">
                <label for="stockQuantity">Stock Quantity:</label>
                <input type="text" class="form-control" id="stockQuantity" name="stockQuantity" required>
            </div>
            <div class="form-group">
                <label for="warrantyPeriod">Warranty Period:</label>
                <input type="text" class="form-control" id="warrantyPeriod" name="warrantyPeriod">
            </div>
            <button type="submit" class="btn btn-primary">Add Product</button>
        </form>
        <% if (request.getParameter("error") != null) { %>
            <p class="text-danger mt-3">Error: <%= request.getParameter("error") %></p>
        <% } %>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
