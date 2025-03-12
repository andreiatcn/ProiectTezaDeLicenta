// Cart item count
let cartItems = 0;

// Add to cart functionality
document.querySelectorAll('.add-to-cart').forEach(button => {
    button.addEventListener('click', function() {
        cartItems++;
        updateCartButton();
        console.log('Product added to cart');
    });
});

// Update cart button with the current item count
function updateCartButton() {
    const cartButton = document.querySelector('.cart-button');
    cartButton.textContent = `Cart (${cartItems})`;
}

// Handle search bar interaction (simple console log for now)
document.getElementById('searchButton').addEventListener('click', function() {
    const query = document.getElementById('searchInput').value;
    console.log('Searching for:', query);
});

// Dynamically populate categories
document.addEventListener("DOMContentLoaded", function() {
    const categoriesList = document.getElementById("categoriesList");

    // Replace this with a dynamic API call if needed
    const categories = ["Phones", "Washing Machines", "Laptops", "Headphones", "Cameras"];

    categories.forEach(category => {
        const categoryItem = document.createElement("a");
        categoryItem.href = "#"; // Link to a specific category page
        categoryItem.textContent = category;
        categoriesList.appendChild(categoryItem);
    });
});
