package oopmodeling.addressbook;

import java.util.Scanner;
import datastructure.FlexibleArray;

public class AddressBook {

    protected FlexibleArray<Contact> contacts = new FlexibleArray<>();
    protected Scanner scanner = new Scanner(System.in);

    public void addContact(Contact c) {
        contacts.add(c);
        System.out.println("Contacto añadido correctamente.");
    }

    public void showContacts() {

        for (int i = 0; i < contacts.size(); i++) {
            System.out.println("The contacts are:" + contacts.toString());
        }
    }

    public void removeContact(String name) {

}
}

