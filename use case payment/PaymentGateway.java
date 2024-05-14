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
    // Suggestion: Consider adding more robust error handling and logging mechanisms
// within the PaymentGateway class to handle various payment processing scenarios
// and provide better feedback to the user or client code.



}
