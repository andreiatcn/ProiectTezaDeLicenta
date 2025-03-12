<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Page</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/stylesAdmin.css">
</head>
<body>
    <!-- Navbar (same as the home page) -->
    <header>
        <div class="header-container">
            <div class="site-name">Online Shop</div>
            <div class="search-bar">
                <input type="text" placeholder="Search products or users...">
                <button>Search</button>
            </div>
            <div class="auth-buttons">
                <button class="account-button">Account</button>
            </div>
        </div>
    </header>

    <!-- Dropdown and New Buttons -->
    <div class="admin-buttons">
        <button class="order-sell">Order Sell</button>
        <button class="order-buy">Order Buy</button>
        <button class="products">Products</button>
    </div>

    <!-- User List Section -->
    <main>
        <h1>Manage Users</h1>
        <div class="user-list-container">
            <!-- Example of User Containers -->
            <div class="user-container">
                <h3>Ryan Khan</h3>
                <p>Username: RyanKhan</p>
                <p>Email: ryan@example.com</p>
                <p>Phone: +23409050253056</p>
                <p>State: Active</p>
                <button class="edit-user">Edit</button>
            </div>
            <div class="user-container">
                <h3>John Doe</h3>
                <p>Username: JohnDoe</p>
                <p>Email: john@example.com</p>
                <p>Phone: +23409050253057</p>
                <p>State: Inactive</p>
                <button class="edit-user">Edit</button>
            </div>
            <!-- More user containers can be added here dynamically -->
        </div>
    </main>

    <!-- Footer (same as the home page) -->
    <footer>
        <p>© 2025 Online Shop. All rights reserved.</p>
    </footer>
</body>
</html>
