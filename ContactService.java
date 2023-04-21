package contactService;

import java.util.List;
import java.util.ArrayList;

public class ContactService {

	private List<Contact> contacts;
	private int uniqueID = 0;
	
	public ContactService()
	{
		contacts = new ArrayList<>();
	}
	
	public String addContact(String firstName, String lastName, String phone, String address)
	{
		String newId = Integer.toString(uniqueID);
		
		Contact newContact = new Contact(newId, firstName, lastName, phone, address);
		
		contacts.add(newContact);
		
		uniqueID += 1;
		
		return newId;
	}
	
	public String getNumberOfContacts()
	{
		return Integer.toString(contacts.size());
	}
	
	public Contact getContact(String contactID)
	{
		for(Contact c : contacts)
		{
			if(contactID == c.getContactID())
			{
				return c;
			}
		}
		return null;
	}
	
	public void deleteContact(String contactID)
	{
		for(Contact c : contacts)
		{
			if(contactID == c.getContactID())
			{
				contacts.remove(c);
				break;
			}
		}
	}
	
	public void updateContactFirstName(String contactID, String newFirstName)
	{
		for(Contact c : contacts)
		{
			if(contactID == c.getContactID())
			{
				c.updateFirstName(newFirstName);
				break;
			}
		}
	}
	
	public void updateContactLastName(String contactID, String newLastName)
	{
		for(Contact c : contacts)
		{
			if(contactID == c.getContactID())
			{
				c.updateLastName(newLastName);
				break;
			}
		}
	}
	
	public void updateContactPhone(String contactID, String newPhone)
	{
		for(Contact c : contacts)
		{
			if(contactID == c.getContactID())
			{
				c.updatePhone(newPhone);
				break;
			}
		}
	}
	
	public void updateContactAddress(String contactID, String newAddress)
	{
		for(Contact c : contacts)
		{
			if(contactID == c.getContactID())
			{
				c.updateAddress(newAddress);
				break;
			}
		}
	}
}
