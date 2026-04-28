package Reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.security.Policy.Parameters;

import oopmodeling.addressbook.AddressBook;

public class reflectionTest {
public static void main(String[] args)  throws ClassNotFoundException{
	Class<AddressBook> clsClass = AddressBook.class;
	Class<AddressBook> cls2 = 
			(Class<AddressBook>) new AddressBook().getClass();
	Class<?> cls3 =
			Class.forName("oopmodeling.addressbook.AddressBook");
	inspectclass(clsClass);
}

private static void inspectclass(Class<AddressBook> cls) {
	cls.getDeclaredConstructors();
	
	Method[] msMethods = cls.getDeclaredMethods();
	for (int i = 0; i < msMethods.length; i++) {
		System.out.println("Method name is"+ msMethods[i].getName());
		Parameter[] parameters = msMethods[i].getParameters();

		for (Parameter parameter : parameters) {
		    System.out.println("Parameter name is " + parameter.getName());
		    System.out.println("Parameter type is " + parameter.getType().getName());
		}

	}
	
	
	cls.getDeclaredFields();
	for (Field field : cls.getDeclaredFields()) {
		System.out.println("field name type is" + field.getName());
		System.out.println("field type is" + field.getType());
		
	}
	cls.getAnnotations();
	for (Annotation Annonation: cls.getAnnotations()) {
		System.out.println("Annonation tpe is" + Annonation.annotationType());
		
	}
	
}
}
