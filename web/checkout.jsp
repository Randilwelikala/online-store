<%@ page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Checkout</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body>
    <header>
        <nav class="navbar navbar-dark bg-dark">
            <a class="navbar-brand" href="#">Electronic Shop</a>
        </nav>
    </header>
    <div class="container mt-5">
        <div class="row">
            <div class="col-md-8">
                <div class="card">
                    <div class="card-body">
                        <h2 class="card-title">Order Summary</h2>
                        <div class="row">
                            <div class="col-md-4">
                                <img src="phone1.jpg" class="img-fluid" alt="Smartphone Model 1">
                            </div>
                            <div class="col-md-8">
                                <h3>Smartphone Model 1</h3>
                                <p>Price: $499</p>
                                <div class="form-group">
                                    <label for="color">Color:</label>
                                    <select class="form-control" id="color">
                                        <option value="black">Black</option>
                                        <option value="white">White</option>
                                        <option value="silver">Silver</option>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <label for="quantity">Quantity:</label>
                                    <select class="form-control" id="quantity">
                                        <option value="1">1</option>
                                        <option value="2">2</option>
                                        <option value="3">3</option>
                                        <option value="4">4</option>
                                        <option value="5">5</option>
                                    </select>
                                </div>
                                <p>Warranty: 1 year</p>
                                <p>Description: Lorem ipsum dolor sit amet, consectetur adipiscing elit.</p>
                            </div>
                        </div>
                        <!-- Add more product details here if needed -->
                        <div class="total">
                            <h3>Total: $499</h3>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-4">
                <div class="card">
                    <div class="card-body">
                        <h2 class="card-title">Payment Methods</h2>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="paymentMethod" id="creditCard" value="creditCard">
                            <label class="form-check-label" for="creditCard">
                                Credit Card
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="paymentMethod" id="paypal" value="paypal">
                            <label class="form-check-label" for="paypal">
                                PayPal
                            </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" name="paymentMethod" id="bankpayment" value="bankpayment">
                            <label class="form-check-label" for="bankpayment">
                                Bank Payment
                            </label>
                        </div>
                        <!-- Add more payment options here -->
                    </div>
                </div>
            </div>
        </div>
        <div class="row mt-3">
            <div class="col-md-8">
                <form action="OrderServlet" method="post">
                    <input type="hidden" name="productName" value="Smartphone Model 1">
                    <input type="hidden" name="price" value="499">
                    <input type="hidden" name="color" value="">
                    <input type="hidden" name="quantity" value="">
                    <input type="hidden" name="paymentMethod" value="">
                    <button type="submit" class="btn btn-primary">Proceed to Payment</button>
                </form>
            </div>
        </div>
    </div>
</body>
</html>
