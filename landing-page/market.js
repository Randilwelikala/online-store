document.addEventListener('DOMContentLoaded', function() {
    const addToCartButtons = document.querySelectorAll('.add-to-cart-btn');
    addToCartButtons.forEach(button => {
        button.addEventListener('click', addToCart);
    });

    function addToCart(event) {
        const productId = event.target.getAttribute('data-id');
        // Implement your logic to add the product to the cart
        console.log('Product added to cart with ID:', productId);
        // Redirect to another page (replace 'checkout.html' with the actual page you want to navigate to)
        window.location.href = 'checkout.html';
    }
});
