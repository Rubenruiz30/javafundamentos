package Reflection;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import datastructure.FlexibleArray;
import oopmodeling.addressbook.AddressBook;

public class reflectionTest {
	public static void main(String[] args) throws ClassNotFoundException, IllegalArgumentException, IllegalAccessException {
		Class<AddressBook> clsClass = AddressBook.class;
		Class<AddressBook> cls2 = (Class<AddressBook>) new AddressBook().getClass();
		Class<?> cls3 = Class.forName("oopmodeling.addressbook.AddressBook");
		inspectclass(clsClass);

		AddressBook addressBook = new AddressBook();
		manipulatedObject(addressBook);
		invokeMethodsOfAnObject( addressBook);
		invokeConstructorsOfAnObect(cls3);

	}

	private static void invokeConstructorsOfAnObect(Class<?> cls) {
		try {
			cls.getConstructor().newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void invokeMethodsOfAnObject(Object obj) {
		Class<?> cls = obj.getClass();
		try {
			Method method = cls.getDeclaredMethod("getContacts", String.class);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void manipulatedObject(AddressBook addressBook) throws IllegalArgumentException, IllegalAccessException {
		Class<?> clsClass = addressBook.getClass();
		Field [] fields = clsClass.getDeclaredFields();
		
		try {
			//potentially we may get no such field exception if
			// we pass a field name that does not exist 
			Field field = clsClass.getDeclaredField("contacts");
			field.setAccessible(true);
//			read the value of a specified field
			//
			System.out.println(addressBook.getContacts());
			// change the access modifier from private to public
			System.out.println(field.get(addressBook));
			
//			modify the value of a field of the object
			try {
				field.set(addressBook, new FlexibleArray<>());
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (NoSuchFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	private static void inspectclass(Class<AddressBook> cls) {
		cls.getDeclaredConstructors();

		Method[] msMethods = cls.getDeclaredMethods();
		for (int i = 0; i < msMethods.length; i++) {
			System.out.println("Method name is" + msMethods[i].getName());
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
		for (Annotation Annonation : cls.getAnnotations()) {
			System.out.println("Annonation tpe is" + Annonation.annotationType());

		}

	}
}
