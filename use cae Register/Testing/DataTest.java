import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataTest {

    Data data;

    @BeforeEach
    void setUp() {
        data = new Data();
    }

    @Test
    void testIsEmailExists() {
        // Test when email exists
        assertTrue(data.isEmailExists("existingUser@example.com"));

        // Test when email doesn't exist
        assertFalse(data.isEmailExists("newUser@example.com"));
    }

    @Test
    void testSaveData() {
        // In a real-world scenario, you would use a mock database and verify database operations,
        // but for simplicity, we will just verify the success flag.

        // Call SaveData method
        data.SaveData("John Doe", "john@example.com", "password", "1234567890");

        // Check if the success flag is set to true after saving data
        assertTrue(data.success);
    }
}