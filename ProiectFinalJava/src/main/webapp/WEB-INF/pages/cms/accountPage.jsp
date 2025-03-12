<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Account Settings</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/stylesAccount.css">
</head>
<body>

    <!-- Navbar (Menu Bar) -->
    <header>
        <div class="header-container">
            <div class="site-name">My Online Store</div>
            <nav>
                <ul>
                    <li><a href="#">Shop</a></li>
                    <li><a href="#">Categories</a></li>
                    <li><a href="#">Account</a></li>
                    <li><a href="#">Cart</a></li>
                </ul>
            </nav>
        </div>
    </header>

    <!-- Account Settings Content -->
    <div class="container">
        <aside class="sidebar">
            <div class="profile-section">
                <!-- User Image (You will add it) -->
                <h2>Ryan Khan</h2>
            </div>
            <nav>
                <ul class="sidebar-menu">
                    <li><a href="#" class="active">Account Settings</a></li>
                    <li><a href="#">Personal Information</a></li>
                    <li><a href="#">Sign out</a></li>
                </ul>
            </nav>
        </aside>
        
        <main class="settings">
            <h1>Account Settings</h1>
            <form action="updateAccount.jsp" method="post">
                <div class="form-group">
                    <label for="firstName">First name</label>
                    <input type="text" id="firstName" name="firstName" value="Ryan" required>
                </div>
                
                <div class="form-group">
                    <label for="lastName">Last name</label>
                    <input type="text" id="lastName" name="lastName" value="Khan" required>
                </div>
                
                <div class="form-group">
                    <label for="username">Username</label>
                    <input type="text" id="username" name="username" value="Oscar" required>
                </div>
                
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" value="" placeholder="******" required>
                </div>
                
                <div class="form-group">
                    <label for="email">E-mail</label>
                    <input type="email" id="email" name="email" value="khan234@gmail.com" required>
                </div>
                
                <div class="form-group">
                    <label for="phone">Phone number</label>
                    <input type="tel" id="phone" name="phone" value="+23409050253056" required>
                </div>
                
                <div class="buttons">
                    <button type="submit" class="save">Save</button>
                    <button type="reset" class="cancel">Cancel</button>
                </div>
            </form>
        </main>
    </div>

    <!-- Footer -->
    <footer>
        <p>&copy; 2025 My Online Store. All Rights Reserved.</p>
    </footer>

</body>
</html>
