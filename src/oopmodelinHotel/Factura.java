package oopmodelinHotel;

/**
 * Clase que representa una factura generada después de confirmar una reserva.
 * Está compuesta por una instancia de la clase Reserva.
 */
public class Factura {
    // Objeto de tipo Reserva del cual se obtiene la información para generar la factura
    private Reserva reserva;
    // Monto total que debe pagar el huésped (calculado a partir de la reserva)
    private double monto;

    /**
     * Constructor que genera la factura con base en una reserva existente.
     *
     * @param reserva Objeto Reserva a partir del cual se genera la factura.
     * El monto se calcula directamente desde el costo total de la reserva.
     */
    public Factura(Reserva reserva) {
        this.reserva = reserva; // Guarda la reserva asociada
        this.monto = reserva.getCostoTotal(); // Calcula el total de la factura
    }

    /**
     * Imprime la factura con la información principal.
     *
     * Muestra por consola:
     * - El nombre del huésped.
     * - El número de la habitación reservada.
     * - El total a pagar.
     */
    public void imprimirFactura() {
        System.out.println("---- FACTURA ----");
        // Muestra el nombre del huésped asociado a la reserva
        System.out.println("Huésped: " + reserva.getHuesped().getNombre());
        // Muestra el número de habitación de la reserva
        System.out.println("Habitación: " + reserva.getHabitacion().getNumero());
        // Muestra el total calculado
        System.out.println("Total a pagar: $" + monto);
        System.out.println("-----------------");
    }

    // Getter opcional por si se necesita acceder al monto fuera de la clase
    public double getMonto() {
        return monto;
    }

    // Getter opcional por si se necesita acceder a la reserva asociada
    public Reserva getReserva() {
        return reserva;
    }
}

