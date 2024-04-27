package javabootcamp;

public class Hatchback extends Vehicle {
	public double rentPrice = 241 ;
	
	public Hatchback(String brand,String type,String gearType,double luggageCapacity,String color, double age,String fuelType,String segment) {
		super(brand,type, gearType, luggageCapacity,color, age, fuelType,segment);
		this.setSegment(segment);;	
	}
	
	public double dailyrentPrice (int day) {
		return day*rentPrice;
	}
	
	public double monthlyrentPrice (int month) {
		
		switch (month) {
		case 1: case 2: case 3: case 4:
			double oneMonthPrice = (int)rentPrice*30*15/100;
			return month*oneMonthPrice ;
			
		case 5: case 6: case 7: case 8:
			oneMonthPrice =(int) rentPrice*30*20/100;
			return month*oneMonthPrice ;
			
		case 9: case 10: case 11: case 12:
			oneMonthPrice =(int) rentPrice*30*25/100;
			return month*oneMonthPrice ;
			
		default:
			oneMonthPrice =(int) rentPrice*30*30/100;
			return month*oneMonthPrice ;
		}
		
	}

}
