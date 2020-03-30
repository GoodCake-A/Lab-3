package bsuir.vmsis.lab3.kitchen;

public class Tea extends FriableThing {
	private String grade;
	public String toString() {
		return grade+" קאי "+this.getMass()+"לד";
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade=grade;
	}
	public Tea(String teaGrade, double massGrams)
	{
		this.setMass(massGrams);
		grade=teaGrade;
	}
	public Tea()
	{
		this.setMass(0);
		grade="";
	}
}
