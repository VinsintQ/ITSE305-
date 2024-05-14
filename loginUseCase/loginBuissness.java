public class loginBuissness {
  public  boolean isAlphanumeric(String username) {
    // Suggestion: Compile the regular expression as a Pattern object for better performance.
      // Regular expression to match alphanumeric characters
      String regex = "^[a-zA-Z0-9]*$";

      // Check if the username matches the regular expression
      return username.matches(regex);
  }
  public boolean isValidPassword(String password) {
     // Suggestion: Compile the regular expression as a Pattern object for better performance.
      String regex = "^.{8,16}$";

      // Check if the password matches the regular expression
      return password.matches(regex);
  }
}
