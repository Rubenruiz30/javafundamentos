package oopmodelinHotel;

/**
 * Clase que representa una reserva realizada por un huésped.
 * Contiene información sobre la habitación, el número de noches,
 * el costo total y el huésped que hizo la reserva.
 */
public class Reserva {
    private String id;              // Identificador único de la reserva (por ejemplo: "R001")
    private Huesped huesped;        // El huésped que realiza la reserva
    private Habitacion habitacion;  // La habitación que se reserva
    private int noches;             // Número de noches de la estancia
    private double costoTotal;      // Costo total de la reserva (se calcula automáticamente)

    /**
     * Constructor que inicializa los datos de la reserva.
     *
     * @param id Identificador de la reserva
     * @param huesped El huésped que realiza la reserva
     * @param habitacion Habitación que se reserva
     * @param noches Número de noches de la reserva
     */
    public Reserva(String id, Huesped huesped, Habitacion habitacion, int noches) {
        this.id = id;
        this.huesped = huesped;
        this.habitacion = habitacion;
        this.noches = noches;
    }

    /**
     * Calcula el costo total multiplicando el precio por noche
     * de la habitación por la cantidad de noches reservadas.
     */
    public void calcularTotal() {
        costoTotal = habitacion.getPrecioPorNoche() * noches;
    }

    /**
     * Confirma la reserva solo si la habitación está disponible.
     * - Si está libre, la marca como ocupada, calcula el total y muestra un mensaje.
     * - Si no está disponible, muestra un aviso sin modificar nada.
     */
    public void confirmar() {
        if (habitacion.isDisponible()) {
            habitacion.reservar(); // Marca la habitación como ocupada
            calcularTotal();       // Calcula el costo total
            System.out.println("Reserva confirmada para " + huesped.getNombre() + " en " + habitacion);
        } else {
            System.out.println("La habitación no está disponible.");
        }
    }

    /**
     * Cancela la reserva y libera la habitación.
     * Este  método puede usarse si el huésped anula su reserva antes de llegar.
     */
    public void cancelar() {
        if (!habitacion.isDisponible()) { // solo libera si está ocupada
            habitacion.liberar();
            System.out.println("Reserva " + id + " cancelada. Habitación " + habitacion.getNumero() + " liberada.");
        } else {
            System.out.println("La habitación ya estaba disponible, no hay reserva activa.");
        }
    }

    // --- Métodos de acceso (Getters) ---
    public double getCostoTotal() { return costoTotal; }
    public Huesped getHuesped() { return huesped; }
    public Habitacion getHabitacion() { return habitacion; }

    /**
     * Devuelve una descripción en texto con los datos principales de la reserva.
     */
    @Override
    public String toString() {
        return "Reserva " + id + ": " + huesped.getNombre() + " -> Habitación " + habitacion.getNumero() +
                " (" + noches + " noches, $" + costoTotal + ")";
    }
}
