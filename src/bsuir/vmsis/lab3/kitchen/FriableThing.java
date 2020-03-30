package bsuir.vmsis.lab3.kitchen;

public class FriableThing extends AbstractObject {
	public String toString() {
		return "������� ������� "+this.getMass()+"��";
	}
	public boolean pourOn(Cup cup) {
		return cup.takeIn(this);
	}
	public FriableThing(double massGrams) {
		this.setMass(massGrams);
	}
	public FriableThing() {
		this.setMass(0);
	}
}
