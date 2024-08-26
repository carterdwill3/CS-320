/* Carter Williams
 * Southern New Hampshire University - CS-320
 * 3-2 Milestone: Contact Service
 * 12 August 2024
 */
import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private final Map<String, Contact> contactList = new HashMap<>();

    public void addContact(Contact contact) {
        if (contactList.containsKey(contact.getId())) {
            throw new IllegalArgumentException("Contact ID already exists.");
        	}
        contactList.put(contact.getId(), contact);
    	}

    public void removeContact(String id) {
        if (!contactList.containsKey(id)) {
            throw new IllegalArgumentException("Contact ID not found.");
        	}
        contactList.remove(id);
    	}

    public void modifyContact(String id, String firstName, String lastName, String phoneNumber, String homeAddress) {
        Contact contact = contactList.get(id);
        if (contact == null) {
            throw new IllegalArgumentException("Contact ID not found.");
        	}
        if (firstName != null) contact.updateFirstName(firstName);
        if (lastName != null) contact.updateLastName(lastName);
        if (phoneNumber != null) contact.updatePhoneNumber(phoneNumber);
        if (homeAddress != null) contact.updateHomeAddress(homeAddress);
    	}

    public Contact findContact(String id) {
        return contactList.get(id);
    	}
}