public class Data {
    // Class for Saving user data

    // Method to check if email already exists in the database
    // This method simulates the existence check.
    public boolean checkIfEmailExists(String email) {
        // Simulating user existence check
        return email.equals("existingUser@example.com");
    }

    boolean success;

    // Method to save user data to the database
    // In a real-world scenario, you would perform database operations here
    public void saveData(String name, String email, String password, String phoneNumber) {
        System.out.println("Saved Successfully to DB");
        success = true;
    }

    // Renamed the method isEmailExiststo checkIfEmailExists forclarity andadherence
    // toJava naming conventions.
    // Added a comment to clarify that the checkIfEmailExists method simulates an
    // existence check.
    // Renamed the method SaveDatato saveData for clarity and adherence toJava
    // naming conventions.
    // Removed unnecessarylocal variable assignments since they were not used.

}
