public class loginData {
  // this method will check if a user exist or not
  public boolean thisUserExist(String username){
      //this simulated the existent users in database
      return username.equals("ali");


  }

  public boolean accountAndPassConfirm(String username, String password){
      //this simulates how the confirmation will be used , but in our case its not conected to a data base
      if (username.equals("ali") && password.equals("mm282002")) {
          return true;
      }
      else{
          return false;
      }
  }

}
