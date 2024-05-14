// Data Layer
class PaymentGateway {
    /**
     * 
     * Charge the specified amount.*
     * 
     * @param amount Amount to be charged
     * @throws PaymentException if payment processing fails
     */
    public void charge(double amount) throws PaymentException {
        try {// Implement payment processing logic
            System.out.println("Charging $" + amount);// Simulate payment success
            System.out.println("Payment processed successfully.");
        } catch (Exception e) {// Log the exception for further investigation
            System.err.println("Error during payment processing: " + e.getMessage());
            throw new PaymentException("Payment processing failed.");
        }
    }
}

// Custom Exception for Payment
class PaymentException extends Exception {
    public PaymentException(String message) {
        super(message);
    }
}