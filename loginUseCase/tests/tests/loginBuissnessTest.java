import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class loginBuissnessTest {

    @Test
    void isAlphanumeric() {
String user="user123";
         {
            loginBuissness loginBuissness = new loginBuissness();

            // Test for alphanumeric username
            assertTrue(loginBuissness.isAlphanumeric("user123"));

            // Test for non-alphanumeric username
            assertFalse(loginBuissness.isAlphanumeric("user@123"));
        }
    }

    @Test
    void isValidPassword() {
        {
            loginBuissness loginBuissness = new loginBuissness();

            // Test for valid password length
            assertTrue(loginBuissness.isValidPassword("password123"));

            // Test for password shorter than 8 characters
            assertFalse(loginBuissness.isValidPassword("pass"));

            // Test for password longer than 16 characters
            assertFalse(loginBuissness.isValidPassword("verylongpasswordwithmorethan16characters"));
        }
    }
}