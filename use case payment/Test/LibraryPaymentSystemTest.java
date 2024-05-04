import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LibraryPaymentSystemTest {
    private LibraryPaymentSystem libraryPaymentSystem;

    @BeforeEach
    void setUp() {
        libraryPaymentSystem = new LibraryPaymentSystem();
    }

    @Test
    void processPayment_Successful() {
        // Test a successful payment
        String cardNumber = "1234567890123456";
        String expiryDate = "12/25";
        String cvv = "123";
        double amount = 10.0;

        // Ensure no exception is thrown
        assertDoesNotThrow(() -> libraryPaymentSystem.processPayment(amount, cardNumber, expiryDate, cvv));
    }


    public void processPayment(double amount, String cardNumber, String expiryDate, String cvv) throws PaymentException {
        if (!isValidCardNumber(cardNumber)) {
            throw new PaymentException("Invalid card number");
        }

        // Validate other card details and process payment
        // Remaining implementation...
    }

    private boolean isValidCardNumber(String cardNumber) {
        // Implement card number validation logic
        return cardNumber.matches("^\\d{16}$"); // Assuming valid card number has 16 digits
    }

}
