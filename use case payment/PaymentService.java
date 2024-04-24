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

    private boolean isValidExpiryDate(String expiryDate) {
        // Implement expiry date validation logic
        return expiryDate.matches("^([0-9]{2}/(0[1-9]|1[0-2]))$");
    }

    private boolean isValidCVV(String cvv) {
        // Implement CVV validation logic
        return cvv.matches("^\\d{3}$");
    }
}
