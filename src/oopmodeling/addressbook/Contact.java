package oopmodeling.addressbook;

import java.util.jar.Attributes;

public class Contact {
public Contact(String name2, String phone, String email2, String Surname) {
		this.email = email2;
		this.name = name2;
		this.phone_number = phone;
		this.Surname = Surname;
	}
	//Attributes of fields of the classes	
	private String phone_number;
	private String name;
	private String Surname;
	private String email;
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		surname = Surname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "phone_number:" +" " +  phone_number + " " + "The name:" + " " + name  +  " " + "The surname:" + " " + Surname + " " + "The email:"+" " + " " + email;
	}
			
	
}