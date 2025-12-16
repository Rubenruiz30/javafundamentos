package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {

    public static void main(String[] args) {

        // Carpeta logs dentro del directorio del proyecto
        String folderPath = System.getProperty("user.dir") + File.separator + "logs";
        File directory = new File(folderPath);

        // Archivo dentro de esa carpeta
        File file = new File(directory, "user.log");

        System.out.println("Directorio de trabajo: " + System.getProperty("user.dir"));

        createPath(directory);
        createFile(file);

        writeFile(file);

        // NUEVO MÉTODO
        showfile(directory);
    }


    private static void showfile(File directory) {

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("La carpeta no existe.");
            return;
        }

        File[] files = directory.listFiles();

        if (files == null || files.length == 0) {
            System.out.println("La carpeta está vacía.");
            return;
        }

        for (File file : files) {
            if (file.isFile()) {
                System.out.println("\n--- Leyendo archivo: " + file.getName() + " ---");
                readfile(file);
            }
        }
    }

    private static void readfile(File file) {
        try (FileReader reader = new FileReader(file)) {
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFile(File file) {
        try (FileWriter writer = new FileWriter(file, true)) {
            writer.write("Black holes\n");
            writer.write("pablo\n");
            writer.write("t\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createPath(File directory) {
        if (!directory.exists()) {
            if (directory.mkdirs()) {
                System.out.println("Carpeta creada: " + directory.getAbsolutePath());
            } else {
                System.out.println("No se pudo crear la carpeta.");
            }
        } else {
            System.out.println("La carpeta ya existe: " + directory.getAbsolutePath());
        }
    }

    private static void createFile(File file) {
        if (file.exists()) {
            System.out.println("El archivo ya existe: " + file.getAbsolutePath());
        } else {
            try {
                if (file.createNewFile()) {
                    System.out.println("Archivo creado: " + file.getAbsolutePath());
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

