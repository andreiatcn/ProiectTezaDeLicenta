<%-- 
    Document   : registrationPage
    Created on : Feb 5, 2025, 4:44:21 PM
    Author     : tacua
--%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register Page</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/stylesRegistration.css">
</head>
<body>
    <div class="register-container">
        <h2>Register</h2>
        <form id="registerForm" action="registerServlet" method="POST">
            <div class="input-group">
                <label for="firstName">First Name</label>
                <input type="text" id="firstName" name="firstName" required>
            </div>
            <div class="input-group">
                <label for="lastName">Last Name</label>
                <input type="text" id="lastName" name="lastName" required>
            </div>
            <div class="input-group">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" required>
            </div>
            <div class="input-group">
                <label for="email">Email</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="input-group">
                <label for="phoneNumber">Phone Number</label>
                <input type="tel" id="phoneNumber" name="phoneNumber" required>
            </div>
            <div class="input-group">
                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>
            </div>
            <div class="input-group">
                <label for="confirmPassword">Confirm Password</label>
                <input type="password" id="confirmPassword" name="confirmPassword" required>
            </div>
            <button type="submit" id="registerBtn">Register</button>
        </form>
        
        <div class="login-link">
            <p>Already have an account? <a href="loginPage.html" id="loginBtn">Login</a></p>
        </div>
        
        <p class="error-message" id="errorMessage"></p>
    </div>

    <script src="register.js"></script>
</body>
</html>
