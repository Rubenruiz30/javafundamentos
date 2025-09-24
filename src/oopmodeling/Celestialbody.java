package oopmodeling;

public class Celestialbody {

	private double mass = 50000000000000.5; // double duplica la cantidad de números de float y private hace que ese valor solo sea para esa clase
	public float size = 52542424355555555555555443242.6f;// variable decimal y puclic sirve para ese valor este en cualquier tipo de calse
	protected String name = "strella roja";// string en una variable de frase y protected sirve para que ese valor lo heredere sus hijos como planet y star
	public double getMass() {
		return mass;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
