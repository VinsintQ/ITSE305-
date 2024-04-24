public class Data {
    // Class for Saving user data

    // this method to check if user email already used
    public boolean isEmailExists(String email) {
        // Simulating user existence check
        return email.equals("existingUser@example.com");

    }

    boolean success;

    // method to save user data to dataBase
    // In a real-world scenario, you would perform database operations here
    public void SaveData(String N, String E, String P, String PN) {
        String Name = N;
        String email = E;
        String password = P;
        String phoneNumber = PN;
        System.out.println("Saved Succssfully to DB");
        success = true;
    }

}
