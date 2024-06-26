
// PresentationView.java
import java.util.Scanner;
// no suggestion for this piece of code , it does all what its supposed to do in the right way

public class PresentationView {

    Scanner kb = new Scanner(System.in);
    String name;
    String email;
    String password;
    String phoneNumber;

    public void displayRegistrationForm() {// this method for display information to user and getting required inputs
        Business p1 = new Business();

        System.out.println("Enter name: ");
        name = kb.nextLine();

        while (p1.isEmpty(name)) {
            System.out.println("you must enter a name");
            name = kb.nextLine();
        }
        System.out.println("Enter email: ");
        email = kb.nextLine();
        while (p1.isEmpty(email)) {
            System.out.println("you must enter  email");
            email = kb.nextLine();

        }
        System.out.println("Enter password: ");
        password = kb.nextLine();
        while (p1.isEmpty(password)) {
            System.out.println("you must enter a password");
            password = kb.nextLine();

        }

        System.out.println("'optional'" + "Enter phone number: ");
        phoneNumber = kb.nextLine();
        // if phone number not empty it must be just numbers no chars
        if (p1.isEmpty(phoneNumber) == false) {
            while (p1.isNotNumeric(phoneNumber)) {
                System.out.println("must only use numbers here");
                phoneNumber = kb.nextLine();
            }
        }

    }

    public static void main(String[] args) {
        PresentationView presentationView1 = new PresentationView();
        presentationView1.displayRegistrationForm();
        Business p1 = new Business();
        Data D1 = new Data();

        // checking for email if already exist
        if (D1.checkIfEmailExists(presentationView1.email)) {

            System.out.println("THis email already registered");
        } else {
            D1.saveData(presentationView1.name, presentationView1.email, presentationView1.password,
                    presentationView1.password);

            // if User registered successfully Show the Message
            if (D1.success) {

                System.out.println("Registered successfully    " + presentationView1.name);

            } else {

                System.out.println("Some thing went wrong    ");
            }

        }

    }

}
