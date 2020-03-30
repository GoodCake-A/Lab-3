package bsuir.vmsis.lab3.kitchen;

public class Kettle extends AbstractObject {
	private double volume;
	private double temperature;
	private Water content;
	public String toString() {
		if(content.getMass()==0)
			return "пустой чайник "+this.getMass()+"мг объемом "+volume;
		else {
			double kettleMass=this.getMass()+content.getMass();
			return "не пустой чайник "+kettleMass+"мг объемом "+volume+" температура воды "+temperature+"C";
		}
	}
	public boolean pour(Cup cup) {
		if(temperature<100)
			return false;
		if(cup.getFreeVolume()<content.getMass()) {
			Water pouredWater=new Water(cup.getFreeVolume());
			content.setMass(content.getMass()-cup.getFreeVolume());
			return cup.takeIn(pouredWater);
		}
		Water pouredWater=new Water(content.getMass());
		content.setMass(0);
		return cup.takeIn(pouredWater);
	}
	public boolean pour(Cup cup,double volumeMilliliters) {
		if(volumeMilliliters>content.getMass()||volumeMilliliters<=0)
			return false;
		if(temperature<100)
			return false;
		if(cup.getFreeVolume()<volumeMilliliters) {
			Water pouredWater=new Water(cup.getFreeVolume());
			content.setMass(content.getMass()-cup.getFreeVolume());
			return cup.takeIn(pouredWater);
		}
		Water pouredWater=new Water(volumeMilliliters);
		content.setMass(content.getMass() -volumeMilliliters);
		return cup.takeIn(pouredWater);
	}
	public boolean fill() {
		content.setMass(volume);
		temperature=20;
		return true;
	}
	public boolean heat() {
		if(content.getMass()==0)
			return false;
		return changeTemprature(100);
	}
	private boolean changeTemprature(double newTemperature) {
		if(newTemperature<temperature||newTemperature>100)
			return false;
		temperature=newTemperature;
		return true;
	}
	public void setVolume(double volume) {
		temperature=20;
		content.setMass(0);
		this.volume=volume;
	}
	public double getVolume() {
		return volume;
	}
	double getTemperature() {
		return temperature;
	}
	public Kettle(double volumeMilliliters,double massGrams) {
		content = new Water();
		volume=volumeMilliliters;
		this.setMass(massGrams);
	}
	public Kettle() {
		content = new Water();
		volume=0;
		this.setMass(0);
	}
}
