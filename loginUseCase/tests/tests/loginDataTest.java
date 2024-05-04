import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class loginDataTest {

    @Test
    void thisUserExist() {
        loginData loginData = new loginData();

        // Test for an existing user
        assertTrue(loginData.thisUserExist("ali"));

        // Test for a non-existing user
        assertFalse(loginData.thisUserExist("john"));
    }

    @Test
    void accountAndPassConfirm() {
        loginData loginData = new loginData();

        // Test for correct username and password
        assertTrue(loginData.accountAndPassConfirm("ali", "mm282002"));

        // Test for incorrect password
        assertFalse(loginData.accountAndPassConfirm("ali", "wrongpassword"));

        // Test for incorrect username
        assertFalse(loginData.accountAndPassConfirm("john", "mm282002"));
    }
}

