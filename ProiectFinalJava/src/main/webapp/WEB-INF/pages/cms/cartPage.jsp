<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Shopping Cart</title>
        <link rel="stylesheet" href="${pageContext.request.contextPath}/css/stylesCart.css">
        <script src="cart.js" defer></script>
    </head>
    <body>
        <!-- Header Section -->
        <header>
            <div class="header-container">
                <h1 class="site-name">My Online Store</h1>

                <!-- Categories Dropdown (Updated) -->
                <div class="dropdown">
                    <button class="dropbtn">Categories</button>
                    <div class="dropdown-content">
                        <a href="#">Phones</a>
                        <a href="#">Washing Machines</a>
                        <a href="#">Laptops</a>
                    </div>
                </div>

                <!-- Search Bar (Updated) -->
                <div class="search-bar">
                    <input type="text" placeholder="Search for products..." id="searchInput">
                    <button id="searchButton">Search</button>
                </div>

                <!-- Account Icon (Updated) -->
                <div class="account-icon">
                    <a href="account.jsp">
                        <button class="auth-button">Account</button>
                    </a>
                </div>
            </div>
        </header>

        <!-- Main Content -->
        <main>
            <h2 class="cart-title">Shopping Cart</h2>
            <div class="product-list">
                <!-- Product 1 (Updated) -->
                <div class="product-item">
                    <div class="product-image">
                        <img src="product1.jpg" alt="Product 1">
                    </div>
                    <div class="product-info">
                        <h2 class="product-title">Product 1</h2>
                        <p class="product-description">This is a great product that you'll love.</p>
                        <span class="product-price">$19.99</span>
                        <button class="remove-item">Remove</button>
                    </div>
                </div>

                <!-- Product 2 (Updated) -->
                <div class="product-item">
                    <div class="product-image">
                        <img src="product2.jpg" alt="Product 2">
                    </div>
                    <div class="product-info">
                        <h2 class="product-title">Product 2</h2>
                        <p class="product-description">An amazing product that makes your life easier.</p>
                        <span class="product-price">$39.99</span>
                        <button class="remove-item">Remove</button>
                    </div>
                </div>
            </div>

            <!-- Total Price and Buy Button (Updated) -->
            <div class="cart-summary">
                <p>Total: <span id="total-price">$59.98</span></p>
                <button id="buyButton" class="auth-button">Buy</button>
            </div>
        </main>

        <!-- Footer Section -->
        <footer>
            <p>&copy; 2025 My Online Store. All rights reserved.</p>
        </footer>
    </body>
</html>
