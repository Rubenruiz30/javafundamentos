package oopmodeling.addressbook;

public class ContactApp {
public static void main(String[] args) {
	AddressBook addressBook = new AddressBook();
	addressBook.showContacts();
	addressBook.removeContact(addressBook);
	
}
	
	
}
