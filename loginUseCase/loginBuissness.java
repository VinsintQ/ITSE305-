public class loginBuissness {
  public  boolean isAlphanumeric(String username) {
      // Regular expression to match alphanumeric characters
      String regex = "^[a-zA-Z0-9]*$";

      // Check if the username matches the regular expression
      return username.matches(regex);
  }
  public boolean isValidPassword(String password) {

      String regex = "^.{8,16}$";

      // Check if the password matches the regular expression
      return password.matches(regex);
  }
}