<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Order Buy</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/stylesAdminOrderBuy.css">
</head>
<body>
    <!-- Navbar (same as the home page) -->
    <header>
        <div class="header-container">
            <div class="site-name">Online Shop</div>
            <div class="search-bar">
                <input type="text" placeholder="Search orders or products...">
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

    <!-- Order Buy List Section -->
    <main>
        <h1>Manage Order Buy</h1>
        <div class="order-list-container">
            <!-- Example of Order Buy Containers -->
            <div class="order-container">
                <h3>Order ID: 1001</h3>
                <p><strong>ID User:</strong> 101</p>
                <p><strong>ID Product:</strong> 301</p>
                <p><strong>Sum:</strong> $200</p>
                <p><strong>Quantity:</strong> 2</p>
                <p><strong>State:</strong> Completed</p>
                <p><strong>Date of Purchase:</strong> 2025-02-01</p>
                <button class="edit-order">Edit</button>
            </div>
            <div class="order-container">
                <h3>Order ID: 1002</h3>
                <p><strong>ID User:</strong> 102</p>
                <p><strong>ID Product:</strong> 302</p>
                <p><strong>Sum:</strong> $350</p>
                <p><strong>Quantity:</strong> 5</p>
                <p><strong>State:</strong> Pending</p>
                <p><strong>Date of Purchase:</strong> 2025-02-02</p>
                <button class="edit-order">Edit</button>
            </div>
            <!-- More order containers can be added here dynamically -->
        </div>
    </main>

    <!-- Footer (same as the home page) -->
    <footer>
        <p>© 2025 Online Shop. All rights reserved.</p>
    </footer>
</body>
</html>
