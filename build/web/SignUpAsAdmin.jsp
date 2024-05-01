<%-- 
    Document   : SignUpAsAdmin
    Created on : Apr 30, 2024, 1:12:36 AM
    Author     : Acer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Admin Signup Page</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <script>
        function validateForm() {
            var fullName = document.getElementById("fullName").value.trim();
            var email = document.getElementById("email").value.trim();
            var password = document.getElementById("password").value.trim();
            var username = document.getElementById("username").value.trim();
            var dob = document.getElementById("dob").value.trim();
            var address = document.getElementById("address").value.trim();
            var phone = document.getElementById("phone").value.trim();
            var termsChecked = document.getElementById("terms").checked;

            // Validate full name
            if (fullName === "") {
                alert("Please enter your full name.");
                return false;
            }

            // Validate email format
            var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
            if (!emailPattern.test(email)) {
                alert("Please enter a valid email address.");
                return false;
            }

            // Validate password length
            if (password.length < 8) {
                alert("Password must be at least 8 characters long.");
                return false;
            }

            // Validate username
            if (username === "") {
                alert("Please enter a username.");
                return false;
            }

            // Validate date of birth
            if (dob === "") {
                alert("Please enter your date of birth.");
                return false;
            }

            // Validate shipping address
            if (address === "") {
                alert("Please enter your shipping address.");
                return false;
            }

            // Validate phone number (optional)
            if (phone !== "" && !/^\d{10}$/.test(phone)) {
                alert("Please enter a valid 10-digit phone number.");
                return false;
            }

            // Check if terms checkbox is checked
            if (!termsChecked) {
                alert("Please agree to the Terms of Service and Privacy Policy.");
                return false;
            }

            return true; // Form is valid
        }
    </script>
</head>
<body>
<div class="container">
    <h2 class="mt-5">Admin Signup</h2>
    <form class="mt-3" action="AdminSignupServlet" method="post" onsubmit="return validateForm()">
        <div class="form-group">
            <label for="fullName">Full Name:</label>
            <input type="text" class="form-control" id="fullName" name="fullName" required>
        </div>
        <div class="form-group">
            <label for="email">Email Address:</label>
            <input type="email" class="form-control" id="email" name="email" required>
        </div>
        <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" class="form-control" id="password" name="password" required>
        </div>
        <div class="form-group">
            <label for="username">Username:</label>
            <input type="text" class="form-control" id="username" name="username" required>
        </div>
        <div class="form-group">
            <label for="dob">Date of Birth:</label>
            <input type="date" class="form-control" id="dob" name="dob" required>
        </div>
        <div class="form-group">
            <label for="address">Shipping Address:</label>
            <textarea class="form-control" id="address" name="address" rows="4" required></textarea>
        </div>
        <div class="form-group">
            <label for="phone">Phone Number:</label>
            <input type="tel" class="form-control" id="phone" name="phone" pattern="[0-9]{10}">
        </div>
        <div class="form-check">
            <input type="checkbox" class="form-check-input" id="terms" name="terms" required>
            <label class="form-check-label" for="terms">I agree to the Terms of Service and Privacy Policy</label>
        </div>
        <button type="submit" class="btn btn-primary mt-3">Signup</button>
    </form>
</div>
</body>
</html>
 