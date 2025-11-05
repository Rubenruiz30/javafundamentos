package oopmodelinHotel;

/**
 * Clase que representa a un huésped (cliente) del hotel.
 * Hereda de la clase abstracta Persona, por lo que también tiene
 * los atributos id, nombre y teléfono definidos en la clase padre.
 */
public class Huesped extends Persona {
    // Correo electrónico del huésped (para contacto o envío de confirmaciones)
    private String correo;

    /**
     * Constructor que inicializa los datos del huésped.
     *
     * @param id Identificador único del huésped (heredado de Persona)
     * @param nombre Nombre completo del huésped
     * @param telefono Número de contacto del huésped
     * @param correo Correo electrónico del huésped
     */
    public Huesped(String id, String nombre, String telefono, String correo) {
        // Llama al constructor de la clase padre (Persona)
        super(id, nombre, telefono);
        this.correo = correo; // Inicializa el atributo propio de Huesped
    }

    // --- Métodos de acceso (Getters y Setters) ---
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * Devuelve una descripción en texto del huésped,
     * incluyendo la información heredada de Persona
     * y el correo electrónico del cliente.
     */
    @Override
    public String toString() {
        return super.toString() + " - Correo: " + correo;
    }
}
