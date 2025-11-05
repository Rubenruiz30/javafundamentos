package oopmodeling;

public class SolarSystem {
    public static void main(String[] args) {

        // Ejemplo de polimorfismo (opcional)
        Object obj = new Planet();

        // Creación de planetas
        Planet jupiter = new Planet(1.898E27, "Jupiter", 69911);
        Planet mars = new Planet(6.417E23, "Mars", 3389);

        // Impresión de datos
        System.out.println(jupiter.getName() + " - Masa: " + jupiter.getMass() + " - Radio: " + jupiter.getRadius());
        System.out.println(mars.getName() + " - Masa: " + mars.getMass() + " - Radio: " + mars.getRadius());
    }
}
