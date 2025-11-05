package oopmodelinHotel;

/**
 * Representa una habitación del hotel.
 * Cada habitación tiene un número, tipo, precio y estado (disponible/ocupada).
 */
/**
 * Clase que representa una habitación del hotel.
 * Contiene información básica como el número, tipo, precio y si está disponible o no.
 */
public class Habitacion {
    private int numero;               // Número identificador de la habitación
    private String tipo;              // Ejemplo: "Individual", "Doble", "Suite"
    private double precioPorNoche;    // Precio de la habitación por noche
    private boolean disponible;       // true si está libre, false si está ocupada

    /**
     * Constructor para crear una habitación nueva.
     * Se asume que al crearla, está disponible.
     *
     * @param numero Número de la habitación
     * @param tipo Tipo de habitación
     * @param precioPorNoche Precio por noche
     */
    public Habitacion(int numero, String tipo, double precioPorNoche) {
        this.numero = numero;
        this.tipo = tipo;
        this.precioPorNoche = precioPorNoche;
        this.disponible = true; // Por defecto la habitación está libre al ser creada
    }

    // --- Métodos de acceso (Getters) ---
    public int getNumero() { return numero; }                 // Devuelve el número de habitación
    public String getTipo() { return tipo; }                  // Devuelve el tipo de habitación
    public double getPrecioPorNoche() { return precioPorNoche; } // Devuelve el precio por noche
    public boolean isDisponible() { return disponible; }      // Indica si está libre u ocupada

    /**
     * Marca la habitación como reservada (ya no está disponible).
     * Se podría llamar este método al confirmar una reserva.
     */
    public void reservar() {
        this.disponible = false;
    }

    /**
     * Libera la habitación (vuelve a estar disponible).
     * Normalmente se usaría cuando el huésped abandona el hotel.
     */
    public void liberar() {
        this.disponible = true;
    }

    /**
     * Devuelve una cadena con toda la información de la habitación:
     * número, tipo, precio y estado (disponible u ocupada).
     */
    @Override
    public String toString() {
        return "Habitación " + numero + " (" + tipo + ") $" + precioPorNoche + " por noche - "
                + (disponible ? "Disponible" : "Ocupada");
    }
}
