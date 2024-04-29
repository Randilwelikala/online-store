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
        <script>
            function validationForm(){
                var fullName = document.getElementById("fullName").value.trim();
                var email = document.getElementById("email").value.trim();
                var password = document.getElementById("password").value.trim();
                var username = document.getElementById("username").value.trim();
                var dob = document.getElementById("dob").value.trim();
                var address = document.getElementById("address").value.trim();
                var phone = document.getElementById("phone").value.trim();
                var termsChecked = document.getElementById("terms").checked;
                var adminRequest = document.getElementById("adminRequest").checked;
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
        <body>
    <h2>Admin Signup</h2>
    <form action="AdminSignupServlet" method="post" onsubmit="return validateForm()">
        <label for="fullName">Full Name:</label>
        <input type="text" id="fullName" name="fullName" required><br>

        <label for="email">Email Address:</label>
        <input type="email" id="email" name="email" required><br>

        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required><br>

        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required><br>

        <label for="dob">Date of Birth:</label>
        <input type="date" id="dob" name="dob" required><br>

        <label for="address">Shipping Address:</label>
        <textarea id="address" name="address" rows="4" cols="50" required></textarea><br>

        <label for="phone">Phone Number:</label>
        <input type="tel" id="phone" name="phone" pattern="[0-9]{10}"><br>

        <input type="checkbox" id="terms" name="terms" required>
        <label for="terms">I agree to the Terms of Service and Privacy Policy</label><br>
        
        <button type="submit">Signup</button>
    </form>

    </body>
</html>