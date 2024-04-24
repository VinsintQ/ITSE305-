// Data Layer
class PaymentGateway {
    /**
     * Charge the specified amount.
     *
     * @param amount Amount to be charged
     */
    public void charge(double amount) {
        // Implement payment processing logic
        System.out.println("Charging $" + amount);
        // Simulate payment success
        System.out.println("Payment processed successfully.");
    }
}

// Custom Exception for Payment
class PaymentException extends Exception {
    public PaymentException(String message) {
        super(message);
    }
}
