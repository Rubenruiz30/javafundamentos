package oopmodeling.addressbook;


import java.util.Scanner;

public class ContactApp {
	 final static AddressBook addressBook = new AddressBook();
	 final static Scanner scanner = new Scanner(System.in);

	
public static void main(String[] args) {
	byte option = 4;
	
	while(true) {
		showMenu();
		
		option = scanner.nextByte();
		scanner.nextLine(); 

		System.out.println(option);
		
		
		
		
		if (option == 4) {
			System.out.println("Vas a salir del programa");
			break;
		}
		else if (option == 1) {
			
			addContact();

	}
		
	
	}
	
	
//	addressBook = new AddressBook();
//	addressBook.showContacts();
//	addressBook.removeContact(null);
	
	
	
	
}


private static void addContact() {
	System.out.println("-----add contact to your address book------");
//1 the user introduce the number, name and other information about the contact
	System.out.print("Introduce the name: ");
    String name = scanner.nextLine();

    System.out.print("Introduce the phone number: ");
    String phone = scanner.nextLine();

    System.out.print("Introduce the email: ");
    String email = scanner.nextLine();
//	2 create an object of "contact" encapsulating all the data passed in the first step
    

 
//	3 Add the new object to the contact array
   


}





private static void showMenu() {
System.out.println("1. Añadir contacto");	
System.out.println("2. Enseñar contacto");	
System.out.println("3. Eliminar contacto");	
System.out.println("4.Exit");	

}
	
	
}
