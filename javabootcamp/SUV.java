package javabootcamp;

public class SUV extends Vehicle {
	public double rentPrice = 257;
	
	public SUV(String brand,String type,String gearType,double luggageCapacity,String color, double age,String fuelType,String segment) {
		super(brand,type, gearType, luggageCapacity,color, age, fuelType,segment);
		this.setSegment(segment);
	}
	
	public double dailyrentPrice (int day) {
		return day*rentPrice;
	}
}
