import java.util.Scanner;

// Presentation Layer
public class LibraryPaymentSystem {
    private PaymentService paymentService;

    public LibraryPaymentSystem() {
        this.paymentService = new PaymentService();
    }

    public void processPayment(double amount, String cardNumber, String expiryDate, String cvv) {
        try {
            paymentService.processPayment(amount, cardNumber, expiryDate, cvv);
            System.out.println("Payment successful. Thank you!");
        } catch (PaymentException e) {
            System.out.println("Payment failed: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        LibraryPaymentSystem libraryPaymentSystem = new LibraryPaymentSystem();

        // Fixed amount to 10 USD
        double amount = 10.0;

        // Get payment details from user
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter card number: ");
        String cardNumber = scanner.nextLine();

        System.out.print("Enter expiry date (MM/YY): ");
        String expiryDate = scanner.nextLine();

        System.out.print("Enter CVV: ");
        String cvv = scanner.nextLine();

        scanner.close();

        libraryPaymentSystem.processPayment(amount, cardNumber, expiryDate, cvv);

         //no suggestion for this code 
}
    }
}

