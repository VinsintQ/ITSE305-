
public class Business {
    // validate inputs

    // mathod validate variables is not empty
    public boolean Empty(String V) {
        if (V.isEmpty()) {

            return true;
        } else {
            return false;
        }

    }

    public boolean NotNum(String Num) {

        if (Num.matches("[0-9]+")) {
            return false;
        } else {
            return true;
        }

    }

    /*
     * public boolean registerUser(String name, String email, String password,
     * String phoneNumber) {
     * 
     * // Create a new user object
     * User newUser = new User(name, email, password, phoneNumber);
     * 
     * success = true;
     * return success;
     * }
     * 
     * public class User {
     * private String name;
     * private String email;
     * private String password;
     * private String phoneNumber;
     * 
     * public User(String name, String email, String password, String phoneNumber) {
     * this.name = name;
     * this.email = email;
     * this.password = password;
     * this.phoneNumber = phoneNumber;
     * }
     * 
     * }
     */
}
