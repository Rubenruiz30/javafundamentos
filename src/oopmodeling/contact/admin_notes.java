package oopmodeling.contact;

import java.util.Scanner;

public class admin_notes {

    public static void main(String[] args) {

        collage_list lista = new collage_list();
        add_notes acciones = new add_notes(lista);
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENÚ NOTAS =====");
            System.out.println("1) Añadir alumno");
            System.out.println("2) Poner nota a alumno");
            System.out.println("3) Ver alumnos y medias");
            System.out.println("4) Eliminar alumno");
            System.out.println("0) Salir");
            System.out.print("Opción: ");

            int opcion;
            try {
                opcion = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Escribe un número válido.");
                continue;
            }

            if (opcion == 1) {
                System.out.print("Nombre del alumno: ");
                String nombre = sc.nextLine();

                boolean ok = acciones.addAlumno(nombre);
                System.out.println(ok ? "Alumno añadido." : "Ese alumno ya existe.");

            } else if (opcion == 2) {
                System.out.print("Nombre del alumno: ");
                String nombre = sc.nextLine();

                System.out.print("Número de nota (1-3): ");
                int numNota = Integer.parseInt(sc.nextLine());

                System.out.print("Nota (0-10): ");
                double nota = Double.parseDouble(sc.nextLine());

                boolean ok = acciones.ponerNota(nombre, numNota, nota);
                System.out.println(ok ? "Nota guardada." : "Error al poner la nota.");

            } else if (opcion == 3) {
                if (lista.size() == 0) {
                    System.out.println("No hay alumnos.");
                } else {
                    System.out.println("\n--- LISTA DE ALUMNOS ---");
                    for (int i = 0; i < lista.size(); i++) {
                        collage_list.Alumno a = lista.getAlumno(i);
                        System.out.println(a.nombre +
                                " | Nota1: " + a.nota1 +
                                " | Nota2: " + a.nota2 +
                                " | Nota3: " + a.nota3 +
                                " | Media: " + String.format("%.2f", a.media()));
                    }
                }

            } else if (opcion == 4) {
                System.out.print("Nombre del alumno a eliminar: ");
                String nombre = sc.nextLine();

                boolean ok = lista.eliminarAlumno(nombre);
                System.out.println(ok ? "Alumno eliminado." : "Ese alumno no existe.");

            } else if (opcion == 0) {
                System.out.println("Programa terminado.");
                break;

            } else {
                System.out.println("Opción incorrecta.");
            }
        }

        sc.close();
    }
}
