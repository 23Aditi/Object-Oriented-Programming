public class TestStrategyPattern {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        
        // Choosing Credit Card Payment
        cart.setPaymentStrategy(new CreditCardPayment("John Doe", "1234567890123456", "123"));
        cart.checkout(100.00);

        // Choosing PayPal Payment
        cart.setPaymentStrategy(new PayPalPayment("john@example.com", "password"));
        cart.checkout(200.00);

        // Choosing Bitcoin Payment
        cart.setPaymentStrategy(new BitcoinPayment("1A1zP1eP5QGefi2DMPTfTL5SLmv7DivfNa"));
        cart.checkout(50.00);
    }
}
