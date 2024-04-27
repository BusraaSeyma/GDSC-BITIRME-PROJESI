package javabootcamp;

public class Vehicle {
	private String brand; // renault
	private String type; // megane
	private String segment; // suv hatchback sedan
	private String gearType; // otomatic
	private double luggageCapacity;
	private String color;
	private double age;
	private String fuelType; // dizel 
	/*
	 * sedan superclass
	 * hatchback sc
	 * suv superclass
	 * Bu özellİklerin birkaçı bazı araçlarda aynı olurken bazı araçlarda özelleştirilmelidir.
	 */
	public Vehicle() {
		
	}
	public Vehicle(String brand,String type,String gearType,double luggageCapacity,String color, double age,String fuelType,String segment) {
		this.setBrand(brand);
		this.setType(type);
		this.setSegment(segment);
		this.setGearType(gearType);
		this.setLuggageCapacity(luggageCapacity);
		this.setColor(color);
		this.setAge(age);
		this.setFuelType(fuelType);
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getSegment() {
		return segment;
	}
	public void setSegment(String segment) {
		this.segment = segment;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getGearType() {
		return gearType;
	}
	public void setGearType(String gearType) {
		this.gearType = gearType;
	}
	public double getLuggageCapacity() {
		return luggageCapacity;
	}
	public void setLuggageCapacity(double luggageCapacity) {
		this.luggageCapacity = luggageCapacity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getAge() {
		return age;
	}
	public void setAge(double age) {
		this.age = age;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

}
