import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BusinessTest {

    Business business;

    @BeforeEach
    void setUp() {
        business = new Business();
    }

    @Test
    void testEmpty() {
        // Test when input is empty
        assertTrue(business.Empty(""));

        // Test when input is not empty
        assertFalse(business.Empty("Hello"));
    }

    @Test
    void testNotNum() {
        // Test when input contains only numbers
        assertFalse(business.NotNum("123456"));

        // Test when input contains non-numeric characters
        assertTrue(business.NotNum("abc123"));

        // Test when input contains a mixture of numbers and non-numeric characters
        assertTrue(business.NotNum("12abc34"));
    }
}