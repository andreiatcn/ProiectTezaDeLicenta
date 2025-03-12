document.getElementById('loginForm').addEventListener('submit', function(event) {
    event.preventDefault();

    // Getting the username and password values
    var username = document.getElementById('username').value;
    var password = document.getElementById('password').value;
    
    // Simple client-side validation
    if (username === "" || password === "") {
        showErrorMessage("Both fields are required.");
    } else {
        // Clear any previous error message
        clearErrorMessage();

        // You can add additional client-side logic here (e.g., AJAX, etc.)
        alert("Login submitted!");
        
        // Example: If you'd want to submit the form using JavaScript (e.g., AJAX)
        // this.submit(); // Uncomment to allow the form submission after validation
    }
});

function showErrorMessage(message) {
    document.getElementById('errorMessage').innerText = message;
}

function clearErrorMessage() {
    document.getElementById('errorMessage').innerText = "";
}



