package oopmodeling;

public class Planet extends Celestialbody {

    private float radius;

    public Planet() {
        // Constructor vacío
    }

    // Constructor con dos parámetros
    public Planet(double mass, String name) {
        this.setMass(mass);
        this.setName(name);
    }

    // Constructor con tres parámetros
    public Planet(double mass, String name, float radius) {
        this.setMass(mass);
        this.setName(name);
        this.radius = radius;
    }

    // Getter y setter del radio
    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
}