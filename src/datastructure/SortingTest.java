package datastructure;

import java.util.Arrays;

public class SortingTest {
	public static void main(String[] args) {
		String[] names = { "diego", "jorge", "Ruben", "Papu", "Enrique" };
		int[] scores = { 12, 24, 3232, 323, 3232, 323323, 32323, 323 };
		Arrays.sort(scores);
		Sort(scores);

	}

	private static void Sort(int [] arr) {
		int guardar =  arr[0];
		for (int i = 0; i < arr.length; i++) {
			if( arr[i] < arr[i]);
				arr[i] = arr[i];
				arr[1] = guardar;
		System.out.println(Arrays.toString(arr));
			
		}
	}
}
