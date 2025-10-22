package datastructure;

import java.util.Arrays;

public class SortingTest {
    public static void main(String[] args) {
        String[] names = {"diego", "jorge", "Ruben", "Papu", "Enrique"};
        int[] scores = {12, 24, 3232, 323, 32323, 323323, 32323, 323};
timeduration(scores);


        Arrays.sort(scores);
        sort(scores);

        boolean isExisting = binarysearch(234, scores);
        System.out.println("Existe el numero 234  " + isExisting);

        isExisting = Linearsearch(234, scores);
        System.out.println("Existe 234 " + isExisting);
    }

    private static void timeduration(int [] scores) {
        // --- BÚSQUEDA BINARIA ---
        long inicioBinaria = System.nanoTime();
        boolean encontradoBinaria = binarysearch(234, scores);
        long finBinaria = System.nanoTime();
        long tiempoBinaria = finBinaria - inicioBinaria;


        System.out.println("Tiempo binaria: " + (tiempoBinaria / 1_000_000.0) + " ms\n");

        // --- BÚSQUEDA LINEAL ---
        long inicioLineal = System.nanoTime();
        boolean encontradoLineal = Linearsearch(234, scores);
        long finLineal = System.nanoTime();
        long tiempoLineal = finLineal - inicioLineal;
        System.out.println("Tiempo lineal: " + (tiempoLineal / 1_000_000.0) + " ms");

    }

    private static boolean Linearsearch(int value, int[] scores) {
        for (int score : scores) {
            if (score == value) {
                return true;

            }
        }
        return false;
    }

    private static boolean binarysearch(int value, int[] scores) {
        int inicio = 0;
        int fin = scores.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (scores[medio] == value) {
                return true;
            } else if (scores[medio] < value) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }
        return false;
    }


    private static void sort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    // Intercambiar valores manualmente
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            System.out.println("Paso " + (j + 1) + ": " + Arrays.toString(arr));
        }
    }
}
