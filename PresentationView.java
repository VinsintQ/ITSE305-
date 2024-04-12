
// PresentationView.java
import java.util.Scanner;

public class PresentationView {

    Scanner kb = new Scanner(System.in);
    String name;
    String email;
    String password;
    String phoneNumber;




    public void displayRegistrationForm() {//this method for display information to user and getting required inputs
        System.out.println("Enter name: ");
        name = kb.nextLine();
        while (name.isEmpty()){
            System.out.println("you must enter a name");
            name = kb.nextLine();
        }
        System.out.println("Enter email: ");
        email = kb.nextLine();
        while(email.isEmpty()){
            System.out.println("you must enter  email");
            email = kb.nextLine();


        }
        System.out.println("Enter password: ");
        password = kb.nextLine();
        while(password.isEmpty()){
            System.out.println("you must enter a password");
            password = kb.nextLine();


        }


        System.out.println("'optional'"+"Enter phone number: ");
        phoneNumber = kb.nextLine();





    }
    public static void main(String[] args) {
        PresentationView presentationView1 = new PresentationView();
        presentationView1.displayRegistrationForm();
        Business p1 = new Business();
        Data  D1 =new Data();

           //checking for email if already exist
        if(D1.isUserExists(presentationView1.email)){

            System.out.println("THis email already registered");
        }else{
            p1.registerUser(presentationView1.name, presentationView1.email, presentationView1.password, presentationView1.password);


            //if User registered successfully Show the Message
            if(p1.success){

                System.out.println("Registered successfully    "+presentationView1.name);


            }else{

                System.out.println("Some thing went wrong    ");
            }


        }







    }


}