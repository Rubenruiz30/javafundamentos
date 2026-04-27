package Reflection;

import oopmodeling.addressbook.AddressBook;

public class reflectionTest {
public static void main(String[] args)  throws ClassNotFoundException{
	Class<AddressBook> clsClass = AddressBook.class;
	Class<AddressBook> cls2 = 
			(Class<AddressBook>) new AddressBook().getClass();
	Class<?> cls3 =
			Class.forName("oopmodeling.addressbook.AddressBook");
}
}
