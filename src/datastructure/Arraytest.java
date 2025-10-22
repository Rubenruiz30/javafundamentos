package datastructure;

import java.lang.module.FindException;
import java.security.cert.CertPathValidator;
import java.util.Arrays;
import java.util.Random;

import oopmodeling.Planet;

public class Arraytest {
	public static void main(String[] args) {
		int[] scores = { 12, 34, 3224, 32 };
		int[] arr = { 1, 20, 40, 80 };

		String[] name = { "pablo", "diego", "jorge" };
		Planet[] planet = { new Planet(), new Planet() };
		for (int i = 0; i < planet.length; i++) {

		}

		// accedes a name desde ahora
		System.out.println(name[0]);
		System.out.println(name[1]);

		sumup();

		int[] nums = new int[10000];
		// cretae an array with of storing 10000 integers
		System.out.println("The lenght of the number array is " + nums.length);

		for (int i = 0; i < nums.length; i++) {

		}
		while (true) {
			break;

		}
		initalizeARRAY(nums);
		finmaxmin(nums);
		float[] salaries = { 4.5f, 5.6f, 6.7f, 45.4484f };
		salaries[0] = salaries[0] + 10;
		System.out.println(salaries[0]);
		salaries[1] = salaries[1] + 10;
		System.out.println(salaries[1]);
		salaries[2] = salaries[2] + 10;
		System.out.println(salaries[2]);
		salaries[3] = salaries[3] + 10;
		System.out.println(salaries[3]);
		// Automización del proceso con bucles

		for (int i = 0; i < salaries.length; i++) {
			salaries[i] = salaries[i] + 10;
			System.out.println(" la automización de este proceso se hace así:" + salaries[i]);
		}

		switchvalues(scores, 0, 2);
		incrementsalary();
		reverse(arr);
		System.out.println(Arrays.toString(scores));
		int[] sliced = slice(scores, 0, 2);

	}

	private static int[] slice(int[] arr, int start, int end) {
		
		
		System.out.println(Arrays.toString(arr));
		int[] result = new int[end - start +1];
		
		System.out.println(Arrays.toString(result));
		for (int i = 0; i < result.length; i++) {
			result[i] = arr[start + i];
			
		}
		if (arr ==null) {
			return null;
		}
		if (start < 0 || end < 0 || start >= arr.length || end >= arr.length) {
			return null;
		}
		if (start > end) {
			return null;
		}
		System.out.println(Arrays.toString(result));
		return result;
	}

	private static int[] reverse(int[] list) {
		int[] nuevo = new int[list.length];

		for (int j = 0; j < nuevo.length; j++) {
//			nuevo[nuevo.length -1] = list[0];
//			nuevo[nuevo.length -2] = list[1];
//			nuevo[nuevo.length -3] = list[2];
//			nuevo[nuevo.length -4] = list[3];
			nuevo[nuevo.length - 1 - j] = list[j];
		}
//		int j = 0;
//		
//		nuevo[nuevo.length -1 - j] = list[j];
//		j++;
//		
//		
//		nuevo[nuevo.length -1 - j] = list[j];
//		j++;
//		
//		nuevo[nuevo.length -1 - j] = list[j];
//		j++;
//		
//		nuevo[nuevo.length -1 - j] = list[j];
//		j++;

		System.out.println(Arrays.toString(nuevo));

		return nuevo;
	}

	public static void switchvalues(int[] arr, int index1, int index2) {
		if (arr == null) {
			return;

		}
		if (index1 < 0 || index2 < 0) {
			return;
		}
		
//		int temp = arr[index1];
//		arr[index1] = arr[index2];
//		arr[index2] = temp;
//
//		System.out.println(Arrays.toString(arr));
		
		int dato = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = dato;
//		System.out.println(dato);
	}

	private static void sumup() {
		int[] scores = { 12, 34, 3224, 32 };

		int suma = 0;
		for (int num : scores) {
			suma += num;

		}
		int totalScore = 0;
		for (int i = 0; i < scores.length; i++) {
			totalScore = totalScore + scores[i];
			System.out.println("totalScores = " + totalScore);

		}
		System.out.println(scores[0]);// ejecuta el primer numero de scores
		System.out.println(scores[1]);// ejecuta el segundo numero de scores
		System.out.println(scores[2]);// ejecuta el tercer numero de scores
		System.out.println(scores[3]);// ejecuta el cuatro numero de scor
		System.out.println(scores[0]);// ejecuta el primer numero de scores
		System.out.println(scores[1]);// ejecuta el segundo numero de scores
		System.out.println(scores[2]);// ejecuta el tercer numero de scores
		System.out.println(scores[3]);// ejecuta el cuatro numero de scores

		System.out.println("La suma de todos los numero es: " + suma);
	}

	private static void incrementsalary() {

	}

	private static void initalizeARRAY(int[] nums) {
		Random random = new Random();

		// Llenar el array con números aleatorios
		for (int i = 0; i < nums.length; i++) {
			nums[i] = random.nextInt(-1000000, 100000000);
		}

	}

	private static void finmaxmin(int[] nums) {
		int mayor = nums[0];
		int menor = nums[0];
		/**
		 * if the current maximun us less than the element that we are accesing we
		 * change the maximun to the value of the elemt
		 */
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > mayor) {
				mayor = nums[i];
			}
			if (nums[i] < menor) {
				menor = nums[i];
			}

		}

		System.out.println("El número más grande es: " + mayor);
		System.out.println("El número más pequeño es: " + menor);
	}
}
