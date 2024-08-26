/* Carter Williams
 * Southern New Hampshire University - CS-320
 * 3-2 Milestone: Contact Service
 * 13 August 2024
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void shouldCreateValidContact() {
        Contact contact = new Contact("C200123", "Dan", "Smith", "9876543210", "123 Seasame St");
        assertEquals("Dan", contact.getFirstName());
        assertEquals("Smith", contact.getLastName());
        assertEquals("9876543210", contact.getPhoneNumber());
        assertEquals("123 Seasame St", contact.getHomeAddress());
    	}

    @Test
    public void shouldThrowExceptionForInvalidContactCreation() {
        assertThrows(IllegalArgumentException.class, () -> new Contact(null, "Dan", "Smith", "9876543210", "123 Seasame St"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("C200123", null, "Smith", "9876543210", "123 Seasame St"));
    	}

    @Test
    public void shouldUpdateFirstName() {
        Contact contact = new Contact("C200123", "Dan", "Smith", "9876543210", "123 Seasame St");
        contact.updateFirstName("Dan");
        assertEquals("Dan", contact.getFirstName());
    	}

    @Test
    public void shouldThrowExceptionForInvalidFirstNameUpdate() {
        Contact contact = new Contact("C200123", "Dan", "Smith", "9876543210", "123 Seasame St");
        assertThrows(IllegalArgumentException.class, () -> contact.updateFirstName(null));
    	}
}