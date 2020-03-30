package bsuir.vmsis.lab3;

import bsuir.vmsis.lab3.drinks.Drinks;
import bsuir.vmsis.lab3.kitchen.Coffee;
import bsuir.vmsis.lab3.kitchen.Cup;
import bsuir.vmsis.lab3.kitchen.FriableThing;
import bsuir.vmsis.lab3.kitchen.Kettle;
import bsuir.vmsis.lab3.kitchen.Milk;
import bsuir.vmsis.lab3.kitchen.Sugar;
import bsuir.vmsis.lab3.users.Student;

public class Source {
	public static void main(String[] args) {
		Cup cup= new Cup(300,100);
		Student student= new Student("������");
		System.out.println("������� "+student.getName()+" ����������");
		student.createCoffee(cup);
		System.out.println(Drinks.identifyDrink(cup));
		student.createCoffeeWithMilk(cup);
		System.out.println(Drinks.identifyDrink(cup));
		student.createTea(cup);
		System.out.println(Drinks.identifyDrink(cup));
		cup.clear();
		FriableThing coffee=new Coffee("�����",20);
		System.out.println("���� "+cup.toString()+" � �������");
		coffee.pourOn(cup);
		System.out.println("���� "+cup.toString());
		Kettle kettle=new Kettle();
		kettle.setVolume(1000);
		kettle.setMass(900);
		System.out.println("���� "+kettle.toString());
		if(kettle.heat())
			System.out.println("������ ��������");
		else
			System.out.println("������ ��������� ������ ������!");
		System.out.println("��������� ������");
		kettle.fill();
		if(kettle.heat())
			System.out.println("������ ��������");
		else
			System.out.println("������ ��������� ������ ������!");
		System.out.println("��������� ����� �� ���������");
		kettle.pour(cup, 200);
		System.out.println("���������� - "+ Drinks.identifyDrink(cup));
		FriableThing sugar=new Sugar(20);
		System.out.println("��������� "+sugar.toString());
		sugar.pourOn(cup);
		System.out.println("���������� - "+ Drinks.identifyDrink(cup));
		Milk milk=new Milk(100);
		System.out.println("��������� "+milk.toString());
		cup.takeIn(milk);
		System.out.println("���������� - "+ Drinks.identifyDrink(cup));
	}
}
