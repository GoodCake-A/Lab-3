package bsuir.vmsis.lab3.kitchen;

public class Water extends AbstractObject{
	public String toString() {
		return "גמהא "+this.getMass()+"לד";
	}
	public Water(double massGrams) {
		this.setMass(massGrams);
	}
	public Water() {
		this.setMass(0);
	}
}
