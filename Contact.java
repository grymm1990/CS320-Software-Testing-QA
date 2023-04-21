package contactService;

public class Contact {
	
	private String contactID;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String contactID, String firstName, String lastName, String phone, String address)
	{
		if ( contactID == null || contactID.length() > 10) throw new IllegalArgumentException("Invalid contact ID");
		if ( firstName == null || firstName.length() > 10) throw new IllegalArgumentException("Invalid first name");
		if ( lastName == null || lastName.length() > 10) throw new IllegalArgumentException("Invalid last name");
		if ( phone == null || phone.length() != 10) throw new IllegalArgumentException("Invalid phone");
		if ( address == null || address.length() > 30) throw new IllegalArgumentException("Invalid address");
		
		this.contactID = contactID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}
	
	public String getContactID() {return contactID;}
	public String getFirstName() {return firstName;}
	public String getLastName() {return lastName;}
	public String getPhone() {return phone;}
	public String getAddress() {return address;}
	
	public void updateFirstName(String newFirstName)
	{
		if ( newFirstName == null || newFirstName.length() > 10) throw new IllegalArgumentException("Invalid first name");
		
		this.firstName = newFirstName;
	}
	
	public void updateLastName(String newLastName)
	{
		if ( newLastName == null || newLastName.length() > 10) throw new IllegalArgumentException("Invalid last name");
		
		this.lastName = newLastName;
	}

	public void updatePhone(String newPhone)
	{
		if ( newPhone == null || newPhone.length() != 10) throw new IllegalArgumentException("Invalid phone");
		
		this.phone = newPhone;
	}
	
	public void updateAddress(String newAddress)
	{
		if ( newAddress == null || newAddress.length() > 30) throw new IllegalArgumentException("Invalid address");
		
		this.address = newAddress;
	}

}
