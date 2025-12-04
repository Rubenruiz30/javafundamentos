package io;

import java.io.File;
import java.io.IOException;

public class FileOperation {

    public static void main(String[] args) {

        // Carpeta logs dentro del directorio del proyecto
        String folderPath = System.getProperty("user.dir") + File.separator + "logs";

        // Archivo dentro de esa carpeta
        File directory = new File(folderPath);
        File file = new File(directory, "/logs/user.log");

        System.out.println("Directorio de trabajo: " + System.getProperty("user.dir"));

        createPath(directory);
        createFile(file);
        File absolutedirFile = new File(System.getProperty("use.dir") + "/logs/user.log");
        absolutedirFile.mkdir();
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
                System.out.println("Error creando el archivo:");
                e.printStackTrace();
            }
        }
    }
}
