import java.util.Scanner;

public class loginPresentation {

    Scanner kb = new Scanner(System.in);
    String UserName;
    
    String password;
    String confirmPassword;

    public void displayLoginForm() {// this method is for displaying the login form
       

        System.out.println("Enter user name: ");
        UserName = kb.nextLine();
 // Suggestion: Consider using trim() to remove leading and trailing spaces from input
        while (UserName.isEmpty()) {
            System.out.println("you must enter a UserName");
            UserName = kb.nextLine();
        }
        
        System.out.println("Enter password: ");
        password = kb.nextLine();
        while (password.isEmpty()) {
            System.out.println("you must enter a password");
            password = kb.nextLine();

        }
        System.out.println("Enter password confirmation: ");
        // Suggestion: There is a bug here, you are assigning password input again instead of confirmPassword.
        password = kb.nextLine();
        while (confirmPassword.isEmpty()) {
            System.out.println("you must enter a password confirmation");
            confirmPassword = kb.nextLine();

        }
  // Suggestion: Add a check to ensure password and confirmPassword match
    }
    

    public static void main(String[] args) {

      loginPresentation login1= new loginPresentation();
 // Suggestion: Call the displayLoginForm() method to display the login form      

    }

}
