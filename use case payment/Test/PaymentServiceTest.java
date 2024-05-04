import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PaymentServiceTest {
    private PaymentService paymentService;

    @BeforeEach
    void setUp() {
        paymentService = new PaymentService();
    }


    @Test
    void processPayment_InvalidCardNumber() {
        // Test an invalid card number
        double amount = 100.0;
        String cardNumber = "123456789012345"; // Invalid card number
        String expiryDate = "12/25";
        String cvv = "123";

        // Ensure PaymentException is thrown with the expected error message
        PaymentException exception = assertThrows(PaymentException.class, () ->
                paymentService.processPayment(amount, cardNumber, expiryDate, cvv));

        // Verify the error message
        assertEquals("Invalid card number", exception.getMessage());
    }

}