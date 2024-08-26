/* Carter Williams
 * Southern New Hampshire University - CS-320
 * 3-2 Milestone: Contact Service
 * 12 August 2024
 */
public class Contact {
    private final String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String homeAddress;

    public Contact(String id, String firstName, String lastName, String phoneNumber, String homeAddress) {
        validateId(id);
        validateFirstName(firstName);
        validateLastName(lastName);
        validatePhoneNumber(phoneNumber);
        validateAddress(homeAddress);
        
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
    	}

    private void validateId(String id) {
        if (id == null || id.length() > 10) {
            throw new IllegalArgumentException("Invalid contact ID.");
        	}
    	}

    private void validateFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name.");
        	}
    	}

    private void validateLastName(String lastName) {
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name.");
        	}
    	}

    private void validatePhoneNumber(String phoneNumber) {
        if (phoneNumber == null || !phoneNumber.matches("\\d{10}")) {
            throw new IllegalArgumentException("Phone number must be 10 digits.");
        	}
    	}

    private void validateAddress(String homeAddress) {
        if (homeAddress == null || homeAddress.length() > 30) {
            throw new IllegalArgumentException("Invalid address.");
        	}
    	}

    public String getId() {
        return id;
    	}

    public String getFirstName() {
        return firstName;
    	}

    public String getLastName() {
        return lastName;
    	}

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getHomeAddress() {
        return homeAddress;
    	}

    public void updateFirstName(String firstName) {
        validateFirstName(firstName);
        this.firstName = firstName;
    	}

    public void updateLastName(String lastName) {
        validateLastName(lastName);
        this.lastName = lastName;
    	}

    public void updatePhoneNumber(String phoneNumber) {
        validatePhoneNumber(phoneNumber);
        this.phoneNumber = phoneNumber;
    	}

    public void updateHomeAddress(String homeAddress) {
        validateAddress(homeAddress);
        this.homeAddress = homeAddress;
    	}
}