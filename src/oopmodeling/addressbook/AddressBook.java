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

    	System.out.println("Los contactos son:");
        for (int i = 0; i < contacts.size(); i++) {
            Contact c = contacts.get(i); 
            System.out.println((i + 1) + ". " + c.toString()); 
        }
    }

    public void removeContact(String name) {
      

        // Muestra los contactos de la agenda
        showContacts();

        System.out.print("Número del contacto a eliminar: ");

        // Leemos el número que introduce el usuario
        int index = scanner.nextInt();
        scanner.nextLine(); // limpiamos el salto de línea

        // Comprobamos que el índice está en rango
        if (index > 0 && index <= contacts.size()) {
            Contact c = contacts.get(index - 1); // obtenemos el contacto elegido
            contacts.remove(index - 1);          // lo eliminamos del FlexibleArray
            System.out.println("Contacto \"" + c.getName() + "\" eliminado correctamente.");
        } else {
            System.out.println("Índice inválido.");
        }
    }
   }



