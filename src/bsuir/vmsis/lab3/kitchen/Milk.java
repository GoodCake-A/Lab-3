package bsuir.vmsis.lab3.kitchen;

public class Milk extends AbstractObject {
	public String toString() {
		return "������ "+this.getMass()+"��";
	}
	public Milk(double massGrams){
		this.setMass(massGrams);
	}
	public Milk(){
		this.setMass(0);
	}
}
