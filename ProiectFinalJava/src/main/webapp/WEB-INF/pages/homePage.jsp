

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Home Page</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/stylesHome.css">
    </head>
    <body>
        <!-- Header Section -->
        <header>
            <div class="header-container">
                <h1 class="site-name">My Online Store</h1>

                <!-- Categories Dropdown -->
                <div class="dropdown">
                    <button class="dropbtn" id="categoriesButton">Categories</button>
                    <div class="dropdown-content" id="categoriesList">
                        <!-- Categories will be inserted here by JavaScript -->
                    </div>
                </div>

                <!-- Search Bar -->
                <div class="search-bar">
                    <input type="text" placeholder="Search for products..." id="searchInput">
                    <button id="searchButton">Search</button>
                </div>

                <div class="auth-buttons">
                    <a href="login" class="auth-button">Login</a>
                    <a href="registrationPage" class="auth-button">Register</a>
                    <a href="cart" class="auth-button cart-button">Cart (0)</a> <!-- Cart button -->
                </div>
            </div>
        </header>

        <!-- Main Content -->
        <main>
            <div class="product-list">
                <c:forEach items="${listProducts}" var="Product">

                    <!-- Product 1 -->

                    <div class="product-item" >
                        <div class="product-image">
                            <!-- Placeholder for product image -->
                            <img src="data:image/png;base64,${base64Image}" alt="Product 1">
                        </div>
                        <div class="product-info">
                            <h2 class="product-title">Product 1</h2>
                            <p class="product-description">This is a great product that you'll love.</p>
                            <span class="product-price">$19.99</span>
                            <button class="add-to-cart">Add to Cart</button>
                        </div>
                    </div>

                </c:forEach>
            </div>
        </main>

        <!-- Footer Section -->
        <footer>
            <p>&copy; 2025 My Online Store. All rights reserved.</p>
        </footer>

        <script src="home.js"></script>
    </body>
</html>
