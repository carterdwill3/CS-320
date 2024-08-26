/* Carter Williams
 * Southern New Hampshire University - CS-320
 * 3-2 Milestone: Contact Service
 * 13 August 2024
 */
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {
    private ContactService service;

    @BeforeEach
    public void setup() {
        service = new ContactService();
    	}

    @Test
    public void shouldAddContactSuccessfully() {
        Contact contact = new Contact("C300456", "Charlie", "Bucket", "1029384756", "404 Capitol Ave");
        service.addContact(contact);
        assertEquals(contact, service.findContact("C300456"));
    	}

    @Test
    public void shouldThrowErrorOnDuplicateContactAddition() {
        Contact contact = new Contact("C300456", "Charlie", "Bucket", "1029384756", "404 Capitol Ave");
        service.addContact(contact);
        assertThrows(IllegalArgumentException.class, () -> service.addContact(contact));
    	}

    @Test
    public void shouldRemoveContactSuccessfully() {
        Contact contact = new Contact("C300456", "Charlie", "Bucket", "1029384756", "404 Capitol Ave");
        service.addContact(contact);
        service.removeContact("C300456");
        assertNull(service.findContact("C300456"));
    	}

    @Test
    public void shouldModifyContactSuccessfully() {
        Contact contact = new Contact("C300456", "Charlie", "Bucket", "1029384756", "404 Capitol Ave");
        service.addContact(contact);
        service.modifyContact("C300456", "Charles", null, null, "414 Douglas Blvd");
        assertEquals("Charles", service.findContact("C300456").getFirstName());
        assertEquals("414 Douglas Blvd", service.findContact("C300456").getHomeAddress());
    	}

    @Test
    public void shouldThrowErrorWhenUpdatingNonExistentContact() {
        assertThrows(IllegalArgumentException.class, () -> service.modifyContact("NonExistentID", "Charles", null, null, "414 Douglas Blvd"));
    	}
}