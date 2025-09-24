package Test;

import oopmodeling.Planet;
import oopmodeling.Star;

public class Test {
	public static void main(String[] args) {
		System.out.println();
		int num1 = 5455;
		int num2 = 5868;

		Star sun = new Star();
		Star sun2 = new Star();
		Planet planet = new Planet();
		Planet planet2 = new Planet();
		System.out.println(sun.getMass());
		sun.setMass(75667);
		System.out.println();
		sun2.setMass(234);
		System.out.println(sun.size);
		planet.setMass(5855858);
		planet2.setMass(45454);
		System.out.println(planet);
		planet2.toString();
		System.out.println("the mass of the planet is now " + (int) planet.getMass());
		Star utus = null;
		if (utus == null) {
			return;
		} else {

		}
		System.out.println("the mass of the planet is now " + utus.getMass());

	}

}
