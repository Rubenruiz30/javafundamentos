package datastructure;

import java.util.List;

public class RecursiveAlgorithms {

    // Imprime n líneas de asteriscos crecientes (1, 2, 3... n)
    public static void draw(int n) {

        // Caso base: si n es 0 o menor, termina
        if (n <= 0) {
            return;
        }

        // Llamada recursiva con n-1 (primero baja)
        draw(n - 1);

        // Imprime n asteriscos en la misma línea
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }

        // Salto de línea
        System.out.println();
    }

    // Imprime un patrón tipo espejo (ej: 123|321)
    public static void pattern(int n) {

        // Caso base: imprime | cuando n llega a 0
        if (n <= 0) {
            System.out.print("|");
            return;
        }

        // Imprime n antes de la recursión
        System.out.print(n);

        // Llamada recursiva
        pattern(n - 1);

        // Imprime n después (efecto espejo)
        System.out.print(n);
    }

    // Imprime "count" asteriscos en la misma línea
    public static void printStars(int count) {

        // Repite mientras count sea mayor que 0
        while (count > 0) {

            // Imprime un asterisco
            System.out.print("* ");

            // Reduce el contador (equivalente a count - 1 en la recursión)
            count--;
        }
    }

    //  versión con bucle sin implementar
    public static void printStarswithLoop(int count) {

        // Repite "count" veces
        for (int i = 0; i < count; i++) {

            // Imprime un asterisco en cada iteración
            System.out.print("* ");
        }
    }

    // Dibuja una cuadrícula de rows filas y cols columnas de asteriscos
    public static void drawGrid(int rows, int cols) {

        // Caso base: si no hay filas, termina
        if (rows == 0) return;

        printStars(cols);

        System.out.println();

        // Llamada recursiva para la siguiente fila
        drawGrid(rows - 1, cols);	
    }

    public static void main(String[] args) {

        // Llama al método para dibujar una cuadrícula 3x5
        drawGrid(3, 5);
        printStarswithLoop(20);
    }

  
    public static int paths(int row, int col) {
        if (row == 0 || col == 0) {
            return 1;
        }

       
        return paths(row - 1, col) + paths(row, col - 1);
    }

    public static int transform(int n) {

       
        if (n < 10) {
            return n;
        }

        return (n % 10) + transform(n / 10);
    }

    public static int process(List<Integer> list) {

        if (list.isEmpty()) {
            return 0;
        }

     
        int head = list.get(0);

       
        List<Integer> rest = list.subList(1, list.size());

      
        if (head % 2 != 0) {
            return head + process(rest);
        } else {
            return process(rest);
        }
    }

  
    public static <T> int analyze(Node<T> node) {

   
        if (node == null) {
            return 0;
        }

   
        int a = analyze(node.left);


        int b = analyze(node.right);

  
        return 1 + Math.max(a, b);
    }

    
    public static String execute(String s) {

        
        if (s == null || s.length() <= 1) {
            return s;
        }

      
        return execute(s.substring(1)) + s.charAt(0);
    }

   
    private class Node<T> {
        public Node<T> left;
        public Node<T> right;
    }
}

