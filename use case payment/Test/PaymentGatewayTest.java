import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PaymentGatewayTest {

    @Test
    void charge_Successful() {
        // Test a successful charge
        double amount = 100.0;
        PaymentGateway paymentGateway = new PaymentGateway();

        // Ensure no exception is thrown
        assertDoesNotThrow(() -> paymentGateway.charge(amount));
    }

    @Test
    void charge_Exception() {
        // Test a charge that should throw PaymentException
        double amount = -10.0; // Negative amount which should throw exception
        PaymentGateway paymentGateway = new PaymentGateway();

        // Ensure PaymentException is thrown
        PaymentException exception = assertThrows(PaymentException.class, () ->
                paymentGateway.charge(amount));

        // Verify the error message
        assertEquals("Invalid amount: " + amount, exception.getMessage());
    }

    class PaymentGateway {
        /**
         * Charge the specified amount.
         *
         * @param amount Amount to be charged
         * @throws PaymentException If the amount is negative
         */
        public void charge(double amount) throws PaymentException {
            if (amount < 0) {
                throw new PaymentException("Invalid amount: " + amount);
            }
            // Implement payment processing logic
            System.out.println("Charging $" + amount);
            // Simulate payment success
            System.out.println("Payment processed successfully.");
        }
    }

}
