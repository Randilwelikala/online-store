<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>View Products</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        /* Custom styles for product cards */
        .card {
            margin-bottom: 20px;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2 class="mt-5">Products</h2>
        <div class="row mt-3">
            <%-- Iterate over products and generate cards dynamically --%>
            <% for (Product product : productList) { %>
                <div class="col-md-4">
                    <div class="card">
                        <div class="card-body">
                            <h5 class="card-title"><%= product.getName() %></h5>
                            <p class="card-text"><%= product.getDescription() %></p>
                            <p class="card-text">Price: <%= product.getPrice() %></p>
                            <p class="card-text">Category: <%= product.getCategory() %></p>
                            <p class="card-text">Stock Quantity: <%= product.getStockQuantity() %></p>
                            <p class="card-text">Warranty Period: <%= product.getWarrantyPeriod() %></p>
                        </div>
                    </div>
                </div>
            <% } %>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.5.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
