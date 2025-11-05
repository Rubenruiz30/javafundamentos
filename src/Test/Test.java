package Test;

import oopmodeling.Planet;
import oopmodeling.Star;

public class Test {
    public static void main(String[] args) {
        int num1 = 5455;
        int num2 = 5868;

        Star sun = new Star();
        Star sun2 = new Star();
        Planet planet = new Planet();
        Planet planet2 = new Planet();

        // Usar getter para acceder a mass
        System.out.println("Sun mass: " + sun.getMass());
        sun.setMass(75667);

        sun2.setMass(234);

        // Usar getter para acceder a size
        System.out.println("Sun size: " + sun.getSize());

        planet.setMass(5855858);
        planet2.setMass(45454);

        // Imprimir usando toString
        System.out.println("Planet 1: " + planet);
        System.out.println("Planet 2: " + planet2.toString());

        System.out.println("The mass of planet 1 is now " + (int) planet.getMass());

        Star utus = null;
        // Evitar NullPointerException
        if (utus != null) {
            System.out.println("The mass of utus is " + utus.getMass());
        } else {
            System.out.println("utus is null, cannot access mass.");
        }
    }
}
