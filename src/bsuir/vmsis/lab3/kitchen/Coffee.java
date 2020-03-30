package bsuir.vmsis.lab3.kitchen;

public class Coffee extends FriableThing {
	private String taste;
	public String toString() {
		return "���� "+taste+this.getMass()+"��";
	}
	public String getTaste() {
		return taste;
	}
	public Coffee(String coffeTaste, double massGrams) {
		taste=coffeTaste;
		this.setMass(massGrams);
	}
	public Coffee() {
		taste="";
		this.setMass(0);
	}
}
