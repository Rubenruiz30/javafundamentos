package datastructure;

	import java.util.Arrays;

	public class SortingTest {
	    public static void main(String[] args) {
	        int[] scores = { 12, 24, 3232, 323, 3232, 32332, 32323, 323 };
	        String[] name = { "pablo", "diego", "jorge" };
	        sort(scores);
	        System.out.println("Final sorted array: " + Arrays.toString(scores));
	    }

	    private static void sort(int[] arr) {
	        int j = 0;

	        while (j < arr.length - 1) {
	            for (int i = 0; i < arr.length - 1 - j; i++) {
	                int previous = arr[i];
	                int next = arr[i + 1];

	                if (previous > next) {
	                    Arraytest.switchvalues(arr, i, i);
	                    System.out.println("el array es " + Arrays.toString(arr));
	                }
	                
	            }
	            j++;
	        }
	    }
	}
