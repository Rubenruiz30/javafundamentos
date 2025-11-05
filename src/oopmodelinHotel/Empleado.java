package oopmodelinHotel;

/**
 * Clase que representa a un empleado del hotel.
 * Hereda de la clase Persona.
 */
public class Empleado extends Persona {
    // Cargo o función del empleado (por ejemplo: recepcionista, cocinero, limpiador...)
    private String puesto;

    /**
     * Constructor de la clase Empleado.
     * Llama al constructor de la clase padre (Persona) para inicializar los datos comunes.
     */
    public Empleado(String id, String nombre, String telefono, String puesto) {
        super(id, nombre, telefono); // inicializa los atributos heredados
        this.puesto = puesto; // inicializa el atributo propio de Empleado
    }

    // Devuelve el puesto del empleado
    public String getPuesto() {
        return puesto;
    }

    // Cambia el puesto del empleado
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    // Muestra la información completa del empleado
    @Override
    public String toString() {
        return "Empleado{" +
                "ID='" + getId() + '\'' +
                ", Nombre='" + getNombre() + '\'' +
                ", Teléfono='" + getTelefono() + '\'' +
                ", Puesto='" + puesto + '\'' +
                '}';
    }
}
