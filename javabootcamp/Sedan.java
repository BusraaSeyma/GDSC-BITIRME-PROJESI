package javabootcamp;

public class Sedan extends Vehicle {
	public double rentPrice = 310;
		
	public Sedan(String brand,String type,String gearType,double luggageCapacity,String color, double age,String fuelType,String segment) {
		super(brand,type, gearType, luggageCapacity,color, age, fuelType,segment);
		this.setSegment("Sedan");		
	}
	
	public double dailyrentPrice (int day) {
		return day*rentPrice;
	}
	
	public double monthlyrentPrice (int month) {
		double oneMonthPrice =(rentPrice*30*10)/100;
		return month*oneMonthPrice;
	}
}
