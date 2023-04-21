package contactService;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;

public class ContactTest {

	@Test
	void testContactID() 
	{
		Contact contact = new Contact("0", "John", "Hancock", "1112223333", "5 Cloverfield Lane");
		assertTrue(contact.getContactID().equals("0"));
		assertTrue(contact.getFirstName().equals("John"));
		assertTrue(contact.getLastName().equals("Hancock"));
		assertTrue(contact.getPhone().equals("1112223333"));
		assertTrue(contact.getAddress().equals("5 Cloverfield Lane"));
	}
	
	@Test
	void testContactIDTooLong()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("123456789001", "John", "Hancock", "1112223333", "5 Cloverfield Lane");
		});	
	}
	
	@Test
	void testContactIDIsNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "John", "Hancock", "1112223333", "5 Cloverfield Lane");
		});	
	}
	
	@Test
	void testFirstNameTooLong()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John009009090", "Hancock", "1112223333", "5 Cloverfield Lane");
		});	
	}
	
	@Test
	void testFirstNameIsNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0", null, "Hancock", "1112223333", "5 Cloverfield Lane");
		});	
	}
	
	@Test
	void testLastNameTooLong()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Hancoaaaaaaaaaa", "1112223333", "5 Cloverfield Lane");
		});	
	}
	
	@Test
	void testLastNameIsNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0", "John", null, "1112223333", "5 Cloverfield Lane");
		});	
	}
	
	@Test
	void testPhoneTooLong()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Hancock", "1112223333888", "5 Cloverfield Lane");
		});	
	}
	
	@Test
	void testPhoneTooShort()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0", "John", "Hancock", "1112223", "5 Cloverfield Lane");
		});	
	}
	
	@Test
	void testPhoneIsNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Hancock", null, "5 Cloverfield Lane");
		});	
	}
	
	@Test
	void testAddressTooLong()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1", "John", "Hancock", "1112223333", "5 Cloverfield Lane00000000000000000");
		});	
	}
	
	@Test
	void testAddressIsNull()
	{
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("0", "John", "Hancock", "1112223333", null);
		});	
	}
}
