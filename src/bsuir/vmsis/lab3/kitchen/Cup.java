package bsuir.vmsis.lab3.kitchen;

import java.util.ArrayList;

public class Cup extends AbstractObject {
	private double volume;
	private ArrayList<AbstractObject> content;
	
	public String toString() {
		if(content.size()==0)
			return "пустая чашка "+this.getMass()+"мг объемом "+volume;
		else {
			double cupMass=0;
			for(int i=0;i<content.size();i++) 
				cupMass+=content.get(i).getMass();
			cupMass+=this.getMass();
			return "не пустая чашка "+cupMass+"мг объемом "+volume;
		}
	}
	
	public boolean takeIn(Milk thing) {
		if(getFreeVolume()<thing.getMass())
			return false;
		content.add(thing);
		return true;
	}
	
	public boolean takeIn(FriableThing thing) {
		if(volume==0)
			return false;
		if(thing instanceof Sugar) {
			content.add(thing);
			return true;
		}
		if(thing instanceof Tea) {
			for(int i=0;i<content.size();i++) 
				if(content.get(i) instanceof Tea||content.get(i) instanceof Coffee)
					return false;
			content.add(thing);
			return true;
		}
		if(thing instanceof Coffee) {
			for(int i=0;i<content.size();i++) 
				if(content.get(i) instanceof Tea||content.get(i) instanceof Coffee)
					return false;
			content.add(thing);
			return true;
		}
		return false;
	}
	
	public boolean takeIn(Water thing) {
		if(getFreeVolume()<thing.getMass())
			return false;
		content.add(thing);
		return true;
	}
	
	public AbstractObject getContent(int i) {
		return content.get(i);
	}
	
	public int getContentSize() {
		return content.size();
	}
	
	public void clear() {
		content.clear();
	}
	
	public double getFreeVolume() {
		double takenVolume=0;
		for(int i=0;i<content.size();i++) 
			if(content.get(i) instanceof Water||content.get(i) instanceof Milk)
				takenVolume+=content.get(i).getMass();
		return volume-takenVolume;
	}
	
	public double getVolume() {
		return volume;
	}
	
	public void setVolume(double volume) {
		content.clear();
		this.volume=volume;
	}
	
	public Cup(double volumeMilliliters, double massGrams) {
		content=new ArrayList<AbstractObject>();
		volume=volumeMilliliters;
		this.setMass(massGrams);
	}
	public Cup() {
		volume=0;
		this.setMass(0);
	}
}
