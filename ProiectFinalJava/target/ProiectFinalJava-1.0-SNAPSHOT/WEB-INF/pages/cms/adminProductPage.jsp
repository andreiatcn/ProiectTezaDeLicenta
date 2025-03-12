<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Products</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/stylesAdminProduct.css">
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
        <button class="users">Users</button>
    </div>

    <!-- Products List Section -->
    <main>
        <h1>Manage Products</h1>
        <button class="add-product">Add a New Product</button>
        <div class="product-list-container">
            <!-- Example of Product Containers -->
            <div class="product-container">
                <h3>Product 1</h3>
                <p><strong>Name:</strong> Product 1</p>
                <p><strong>Description:</strong> A sample product</p>
                <p><strong>Price:</strong> $100</p>
                <p><strong>Type:</strong> Electronics</p>
                <p><strong>Quantity:</strong> 50</p>
                <p><strong>Weight:</strong> 1.5 kg</p>
                <p><strong>Date of Production:</strong> 2023-01-01</p>
                <button class="edit-product">Edit</button>
            </div>
            <div class="product-container">
                <h3>Product 2</h3>
                <p><strong>Name:</strong> Product 2</p>
                <p><strong>Description:</strong> Another sample product</p>
                <p><strong>Price:</strong> $150</p>
                <p><strong>Type:</strong> Clothing</p>
                <p><strong>Quantity:</strong> 100</p>
                <p><strong>Weight:</strong> 0.8 kg</p>
                <p><strong>Date of Production:</strong> 2023-03-15</p>
                <button class="edit-product">Edit</button>
            </div>
            <!-- More product containers can be added here dynamically -->
        </div>
    </main>

    <!-- Footer (same as the home page) -->
    <footer>
        <p>© 2025 Online Shop. All rights reserved.</p>
    </footer>
</body>
</html>
