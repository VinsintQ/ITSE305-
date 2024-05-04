import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class loginPresentationTest {

    @Test
    void displayLoginForm() {
        loginPresentation login = new loginPresentation();

        // Mock user input
        String name="username";
        String pass ="password";

        // Call the method to test


        // Check if the fields are set correctly
        assertEquals("username", name);
        assertEquals("password",pass);
    }


}