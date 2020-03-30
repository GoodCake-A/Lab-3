package bsuir.vmsis.lab3.kitchen;

public abstract class AbstractObject {
	private double mass;
	public double getMass() {
		return mass;
	}
	public void setMass(double massGrams) {
		if(massGrams>0)
			mass = massGrams;
		else
			mass=0;
	}
	public void setMass() {
			mass=0;
	}
}
