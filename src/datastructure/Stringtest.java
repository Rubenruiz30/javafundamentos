package datastructure;

import java.util.Arrays;

public class Stringtest {
	public static void main(String[] args) {
		String[] params = { "manolo", "dgmail.com" };
		selectquery(params, "Ruben", "d");
	}

	/**
	 * 
	 * @param parameters
	 * @param username
	 * @param email
	 * @return String
	 */
	private static String selectquery(String[] parameters, String username, String email) {
		String querysql = "selec * from user where username = 'Ruben' and email  = 'manolo@gmail.com'";
		querysql = "select *from user where username = ? and email = ?";
		char[] characters = querysql.toCharArray();
		int i = 0;

		String sumString = "";

		for (char character : characters) {
//			System.out.println("the current character is " + character);
//			relational operator of inequality is "!=" "no igual "
			if (character != '?') {
//				"+=" operator to connect 
				sumString += character;
			} else {// character == ?
				sumString += parameters[i];
				i++;
			}
		}
		System.out.println("the new string is : " + sumString);
		System.out.println("sub String" + querysql.subSequence(0, 10));

		System.out.println(" replace all ? with the value passed thorught the username variable "
				+ querysql.replace("?", username));

		System.out.println(Arrays.toString(characters));
		System.out.println(querysql.indexOf("?"));
		System.out.println(querysql.charAt(35));
		System.out.println(querysql.charAt(3));
		return "";

	}
}
