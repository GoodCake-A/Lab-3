package bsuir.vmsis.lab3.users;

import bsuir.vmsis.lab3.kitchen.Coffee;
import bsuir.vmsis.lab3.kitchen.Cup;
import bsuir.vmsis.lab3.kitchen.Kettle;
import bsuir.vmsis.lab3.kitchen.Milk;
import bsuir.vmsis.lab3.kitchen.Sugar;
import bsuir.vmsis.lab3.kitchen.Tea;

public class Student {
	private String name;
	public String toString() {
		return "студент по имени "+this.getName();
	}
	public Cup createCoffee(Cup cup) {
		Sugar sugar=new Sugar(20);
		sugar.pourOn(cup);
		Coffee coffee=new Coffee("черный",20);
		coffee.pourOn(cup);
		Kettle kettle= new Kettle(300,1000);
		kettle.fill();
		kettle.heat();
		kettle.pour(cup);
		return cup;
	}
	public Cup createCoffeeWithMilk(Cup cup) {
		cup.clear();
		Sugar sugar=new Sugar(20);
		sugar.pourOn(cup);
		Coffee coffee=new Coffee("черный",20);
		coffee.pourOn(cup);
		Kettle kettle= new Kettle(300,1000);
		kettle.fill();
		kettle.heat();
		kettle.pour(cup,200);
		Milk milk=new Milk(100);
		cup.takeIn(milk);
		return cup;
	}
	public Cup createTea(Cup cup) {
		cup.clear();
		Sugar sugar=new Sugar(20);
		sugar.pourOn(cup);
		Tea tea=new Tea("зеленый",20);
		tea.pourOn(cup);
		Kettle kettle= new Kettle(300,1000);
		kettle.fill();
		kettle.heat();
		kettle.pour(cup);
		return cup;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student(String name) {
		this.setName(name);
	}
	public Student() {
		this.setName("");
	}
}
