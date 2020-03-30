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
		Student student= new Student("Андрей");
		System.out.println("Студент "+student.getName()+" приготовил");
		student.createCoffee(cup);
		System.out.println(Drinks.identifyDrink(cup));
		student.createCoffeeWithMilk(cup);
		System.out.println(Drinks.identifyDrink(cup));
		student.createTea(cup);
		System.out.println(Drinks.identifyDrink(cup));
		cup.clear();
		FriableThing coffee=new Coffee("Латте",20);
		System.out.println("Берём "+cup.toString()+" и очищаем");
		coffee.pourOn(cup);
		System.out.println("Берём "+cup.toString());
		Kettle kettle=new Kettle();
		kettle.setVolume(1000);
		kettle.setMass(900);
		System.out.println("Берём "+kettle.toString());
		if(kettle.heat())
			System.out.println("Чайник нагрелся");
		else
			System.out.println("Нельзя нагревать пустой чайник!");
		System.out.println("Наполняем чайник");
		kettle.fill();
		if(kettle.heat())
			System.out.println("Чайник нагрелся");
		else
			System.out.println("Нельзя нагревать пустой чайник!");
		System.out.println("Наполняем чашку не полностью");
		kettle.pour(cup, 200);
		System.out.println("Получилось - "+ Drinks.identifyDrink(cup));
		FriableThing sugar=new Sugar(20);
		System.out.println("Добавляем "+sugar.toString());
		sugar.pourOn(cup);
		System.out.println("Получилось - "+ Drinks.identifyDrink(cup));
		Milk milk=new Milk(100);
		System.out.println("Добавляем "+milk.toString());
		cup.takeIn(milk);
		System.out.println("Получилось - "+ Drinks.identifyDrink(cup));
	}
}
