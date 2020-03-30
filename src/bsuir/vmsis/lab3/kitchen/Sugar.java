package bsuir.vmsis.lab3.kitchen;

public class Sugar extends FriableThing {
	public String toString() {
		return "сахар "+this.getMass()+"мг";
	}
	public Sugar(double massGrams){
		this.setMass(massGrams);
	}
	public Sugar(){
		this.setMass(0);
	}
}
