// Business Layer
public class PaymentService {

    private PaymentGateway paymentGateway;

    public PaymentService() {
        this.paymentGateway = new PaymentGateway();
    }

    /**
     * Process payment using the provided card details.
     *
     * @param amount     Amount to be charged
     * @param cardNumber Card number
     * @param expiryDate Expiry date of the card (MM/YY)
     * @param cvv        Card Verification Value
     * @throws PaymentException If payment fails
     */
    public void processPayment(double amount, String cardNumber, String expiryDate, String cvv)
            throws PaymentException {
        if (!isValidCardNumber(cardNumber)) {
            throw new PaymentException("Invalid card number");
        }

        if (!isValidExpiryDate(expiryDate)) {
            throw new PaymentException("Invalid expiry date");
        }

        if (!isValidCVV(cvv)) {
            throw new PaymentException("Invalid CVV");
        }

        paymentGateway.charge(amount);
    }

    private boolean isValidCardNumber(String cardNumber) {
        // Implement card number validation logic
        return cardNumber.matches("^\\d{16}$");
    }

    // Improved expiry date validation by checking if it's a valid date
    private boolean isValidExpiryDate(String expiryDate) {
        String[] parts = expiryDate.split("/");
        if (parts.length != 2) {
            return false;
        }
        int month = Integer.parseInt(parts[0]);
        int year = Integer.parseInt(parts[1]);
        if (month < 1 || month > 12) {
            return false;
        }
        int currentYear = java.time.Year.now().getValue() % 100; // Get last two digits of current year
        return year >= currentYear && year <= currentYear + 20; // Expiry year should be current year or within next 20
                                                                // years
    }

    private boolean isValidCVV(String cvv) {
        // Implement CVV validation logic
        return cvv.matches("^\\d{3}$");
    }
}
