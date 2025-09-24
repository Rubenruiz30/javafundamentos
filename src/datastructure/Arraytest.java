package datastructure;

import java.lang.module.FindException;
import java.util.Random;

import oopmodeling.Planet;

public class Arraytest {
	public static void main(String[] args) {

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
 * if the current maximun us less than the element
 * that we are accesing we change the maximun to
 * the value of the elemt
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
