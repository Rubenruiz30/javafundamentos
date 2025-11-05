package oopmodeling;

public class Celestialbody {

    // Atributos encapsulados
    private double mass = 5.0E13; // 5 × 10^13
    private String name = "Unknown";
    private double size = 4.2E9; // double para valores grandes
    private int age = 1000;

    // Getters y setters
    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name)  {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
