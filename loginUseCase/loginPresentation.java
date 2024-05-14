import java.util.Scanner;

public class loginPresentation {

    Scanner kb = new Scanner(System.in);
    String UserName;
    String password;
    String confirmPassword;

    public void displayLoginForm() { 

        System.out.println("Enter user name: ");
        UserName = kb.nextLine().trim();

        while (UserName.isEmpty()) {
            System.out.println("You must enter a UserName");
            UserName = kb.nextLine().trim(); 
        }

        System.out.println("Enter password: ");
        password = kb.nextLine().trim(); 
        while (password.isEmpty()) {
            System.out.println("You must enter a password");
            password = kb.nextLine().trim(); 
        }

        System.out.println("Enter password confirmation: ");
        confirmPassword = kb.nextLine().trim();
        while (confirmPassword.isEmpty()) {
            System.out.println("You must enter a password confirmation");
            confirmPassword = kb.nextLine().trim();
        }

        // Adding a check to ensure password and confirmPassword are the same
        while (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match. Please re-enter the password and confirmation.");
            System.out.println("Enter password: ");
            password = kb.nextLine().trim(); 
            System.out.println("Enter password confirmation: ");
            confirmPassword = kb.nextLine().trim(); 
        }
    }

    public static void main(String[] args) {
        loginPresentation login1 = new loginPresentation();
        login1.displayLoginForm(); // Calling the displayLoginForm method to display the login form
    }
}