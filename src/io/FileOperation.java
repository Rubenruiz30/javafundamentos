package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileOperation {

    // Carpeta y archivo dentro del proyecto
    private static final String FOLDER_PATH = System.getProperty("user.dir") + File.separator + "logs";
    private static final File DIRECTORY = new File(FOLDER_PATH);
    private static final File CONTACTS_FILE = new File(DIRECTORY, "contacts.txt");

    // ====== CLASE CONTACT (todo en el mismo archivo) ======
    static class Contact {
        private String name;
        private String phone;
        private String email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }

        public String getName() { return name; }
        public String getPhone() { return phone; }
        public String getEmail() { return email; }

        @Override
        public String toString() {
            return "Contact{name='" + name + "', phone='" + phone + "', email='" + email + "'}";
        }
    }

    // ====== 1) CARGAR CONTACTOS DESDE ARCHIVO ======
    public static List<Contact> loadContacts() {
        createPath(DIRECTORY);
        createFile(CONTACTS_FILE);

        List<Contact> contacts = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(CONTACTS_FILE))) {
            String line;

            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                // Formato: nombre,telefono,email
                String[] parts = line.split(",", -1);

                String name = parts.length > 0 ? parts[0].trim() : "";
                String phone = parts.length > 1 ? parts[1].trim() : "";
                String email = parts.length > 2 ? parts[2].trim() : "";

                contacts.add(new Contact(name, phone, email));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return contacts;
    }

    // ====== 2) GUARDAR CONTACTO AL AÑADIR (APPEND) ======
    public static void saveContact(Contact c) {
        createPath(DIRECTORY);
        createFile(CONTACTS_FILE);

        try (FileWriter writer = new FileWriter(CONTACTS_FILE, true)) {
            writer.write(c.getName() + "," + c.getPhone() + "," + c.getEmail() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ====== EXTRA: MOSTRAR ARCHIVO COMPLETO (opcional) ======
    public static void showFiles() {
        createPath(DIRECTORY);
        createFile(CONTACTS_FILE);

        System.out.println("\n--- CONTENIDO DEL ARCHIVO contacts.txt ---");
        try (BufferedReader br = new BufferedReader(new FileReader(CONTACTS_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // ====== Helpers (crear carpeta / crear archivo) ======
    private static void createPath(File directory) {
        if (!directory.exists()) {
            if (directory.mkdirs()) {
                System.out.println("Carpeta creada: " + directory.getAbsolutePath());
            } else {
                System.out.println("No se pudo crear la carpeta.");
            }
        }
    }

    private static void createFile(File file) {
        if (!file.exists()) {
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

    // ====== MAIN (ejemplo de uso) ======
    public static void main(String[] args) {

        // 1) Cargar contactos desde archivo al iniciar
        List<Contact> contacts = loadContacts();

        System.out.println("\nContactos cargados: " + contacts.size());
        for (Contact c : contacts) {
            System.out.println(c);
        }

        // 2) Añadir un contacto a la lista y guardarlo también en el archivo
        Contact nuevo = new Contact("Pablo", "600111222", "pablo@email.com");
        contacts.add(nuevo);
        saveContact(nuevo);

        System.out.println("\nAñadido y guardado: " + nuevo);

        // Mostrar lista final en memoria
        System.out.println("\nLista final en memoria:");
        for (Contact c : contacts) {
            System.out.println(c);
        }

        // (Opcional) Mostrar el archivo entero
        showFiles();
    }
}

