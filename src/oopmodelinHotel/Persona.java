package oopmodelinHotel;

/**
 * Clase abstracta base que representa a cualquier persona relacionada con el hotel.
 * Sirve como clase padre para "Huesped" y "Empleado", ya que ambos comparten
 * datos comunes como el id, el nombre y el teléfono.
 *
 * Al ser abstracta, no se puede crear directamente un objeto Persona,
 * solo se pueden crear objetos de sus clases hijas.
 */
public abstract class Persona {
    // --- Atributos comunes ---
    private String id;        // Identificador único (puede ser un código o DNI)
    private String nombre;    // Nombre completo de la persona
    private String telefono;  // Teléfono de contacto

    /**
     * Constructor que inicializa los datos básicos de la persona.
     *
     * @param id Identificador único de la persona
     * @param nombre Nombre completo
     * @param telefono Número de teléfono
     */
    public Persona(String id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    // --- Métodos de acceso (Getters) ---
    public String getId() { return id; }           // Devuelve el identificador
    public String getNombre() { return nombre; }   // Devuelve el nombre
    public String getTelefono() { return telefono; } // Devuelve el número de teléfono

    // --- Métodos modificadores (Setters) ---
    public void setNombre(String nombre) { this.nombre = nombre; }   // Cambia el nombre
    public void setTelefono(String telefono) { this.telefono = telefono; } // Cambia el teléfono

    /**
     * Devuelve una descripción en texto con el nombre y el id de la persona.
     * Este método puede ser reutilizado y ampliado por las clases hijas.
     */
    @Override
    public String toString() {
        return nombre + " (" + id + ")";
    }
}
