import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class PresentationViewTest {
    private PresentationView presentationView;

    @Before
    public void setUp() {
        presentationView = new PresentationView();
    }


    @Test
    public void testEmailExists() {
        // Assuming the email already exists in the database
        Data D1 = new Data();
        D1.SaveData("Existing User", "existing@example.com", "existingpassword", "existingpassword");


        // Assuming the email doesn't exist in the database
        assertFalse(D1.isEmailExists("new@example.com"));
    }
}