package bsuir.vmsis.lab3.drinks;

import bsuir.vmsis.lab3.kitchen.Coffee;
import bsuir.vmsis.lab3.kitchen.Cup;
import bsuir.vmsis.lab3.kitchen.Milk;
import bsuir.vmsis.lab3.kitchen.Sugar;
import bsuir.vmsis.lab3.kitchen.Tea;
import bsuir.vmsis.lab3.kitchen.Water;

final public class Drinks {
	public static String identifyDrink(Cup cup) {
		String drink=" ";
		boolean water=false;
		for(int i=0;i<cup.getContentSize();i++) {
			if(cup.getContent(i) instanceof Water) 
				water=true;
		}
		if(water==false)
			return "�� ������� �������";
		for(int i=0;i<cup.getContentSize();i++) {
			if(cup.getContent(i) instanceof Tea) {
				drink="��� ";
				if(((Tea)cup.getContent(i)).getGrade()!="")
					drink=((Tea)cup.getContent(i)).getGrade()+" "+drink;
				break;
			}
			if(cup.getContent(i) instanceof Coffee) {
				drink="���� ";
				if(((Coffee)cup.getContent(i)).getTaste()!="")
					drink=drink+((Coffee)cup.getContent(i)).getTaste()+" ";
				break;
			}
		}
		for(int i=0;i<cup.getContentSize();i++) 
			if(cup.getContent(i) instanceof Milk) {
				drink=drink+"� �������";
				break;
			}
		for(int i=0;i<cup.getContentSize();i++) 
			if(cup.getContent(i) instanceof Sugar) {
				drink="������� "+drink;
				break;
			}
		return drink;
	}
	private Drinks() {
		
	}
}
