<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Product Search</title>
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

                <div class="auth-buttons">
                    <a href="login" class="auth-button">Login</a>
                    <a href="registrationPage" class="auth-button">Register</a>
                    <a href="cart" class="auth-button cart-button">Cart (0)</a> <!-- Cart button -->
                    <a href="home" class="auth-button">Home</a>
                </div>
            </div>
        </header>

        <!-- Main Content -->
        <main>
            <div class="search-container">
                <h2>Product Search</h2>
                <p class="search-description">Search for products using Elasticsearch</p>
                <form action="productSearch" method="post">
                    <div class="form-group">
                        <label for="productName">Product Name:</label>
                        <input type="text" id="productName" name="productName" placeholder="Enter product name..." value="${searchQuery}" required>
                    </div>
                    <button type="submit" class="search-button">Search</button>
                </form>
            </div>

            <!-- Display search results if any -->
            <div class="product-list">
                <c:if test="${not empty searchResults}">
                    <h3>Search Results</h3>
                    <c:forEach items="${searchResults}" var="product">
                        <div class="product-item">
                            <div class="product-info">
                                <h2 class="product-title">${product.name}</h2>
                                <p class="product-description">${product.des}</p>
                                <span class="product-price">$${product.price}</span>
                                <button class="add-to-cart">Add to Cart</button>
                            </div>
                        </div>
                    </c:forEach>
                </c:if>
                
                <c:if test="${empty searchResults && searchPerformed}">
                    <p class="no-results">No products found matching your search criteria.</p>
                </c:if>
            </div>
        </main>

        <!-- Footer Section -->
        <footer>
            <p>&copy; 2025 My Online Store. All rights reserved.</p>
        </footer>
    </body>
</html>
