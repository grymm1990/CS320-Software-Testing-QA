package contactService;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {

	@Test
	void testAddContact() 
	{
		ContactService service = new ContactService();
		String newId = service.addContact("John", "Hancock", "1112223333", "5 Cloverfield Lane");
		
		Contact addedContact = service.getContact(newId);
		
		assertTrue(addedContact.getContactID().equals("0"));
		assertTrue(addedContact.getFirstName().equals("John"));
		assertTrue(addedContact.getLastName().equals("Hancock"));
		assertTrue(addedContact.getPhone().equals("1112223333"));
		assertTrue(addedContact.getAddress().equals("5 Cloverfield Lane"));
	}
	
	@Test
	void testDeleteContact() 
	{
		ContactService service = new ContactService();
		String newId = service.addContact("John", "Hancock", "1112223333", "5 Cloverfield Lane");
		
		assertTrue(service.getNumberOfContacts().equals("1"));
		
		service.deleteContact(newId);
		
		assertTrue(service.getNumberOfContacts().equals("0"));
	}
	
	@Test
	void testUpdateContact() 
	{
		ContactService service = new ContactService();
		String contactId = service.addContact("John", "Hancock", "1112223333", "5 Cloverfield Lane");
		
		service.updateContactFirstName(contactId, "Jimmy");
		service.updateContactLastName(contactId, "Hendrix");
		service.updateContactPhone(contactId, "5556667777");
		service.updateContactAddress(contactId, "177A Bleecker Street");
		
		Contact updatedContact = service.getContact(contactId);
		
		assertTrue(updatedContact.getFirstName().equals("Jimmy"));
		assertTrue(updatedContact.getLastName().equals("Hendrix"));
		assertTrue(updatedContact.getPhone().equals("5556667777"));
		assertTrue(updatedContact.getAddress().equals("177A Bleecker Street"));
	}
}
