package javabootcamp;

import java.util.Scanner;

public class AutoShowroom {
	Sedan sedan1 = new Sedan("Peugeot", "3001", "Otomatik", 560, "Kırmızı", 4, "Dizel","S");
	Sedan sedan2 = new Sedan("BMV", "Sport Plus", "Otomatik", 480, "Beyaz",7 , "Benzin","S");
	Sedan sedan3 = new Sedan("Toyota", "Corolla", "Düz", 100, "Beyaz", 10, "Benzin","S");
	Sedan[] sedans = {sedan1,sedan2,sedan3};
	
	Hatchback hatchback1 = new Hatchback("MINI", "Cooper", "Düz", 160, "Lacivert", 22, "LPG ve Benzin","S");
	Hatchback hatchback2 = new Hatchback("Toyota", "Yaris", "Düz", 286, "Gri", 10, "Benzin","S");
	Hatchback hatchback3 = new Hatchback("Audi", "A3", "Yarı Otomatik", 365, "Mavi", 9, "Dizel","S");
	Hatchback[] hatchbacks = {hatchback1,hatchback2,hatchback3};
	
	SUV SUV1 = new SUV("Citroen", "C4 X", "Otomatik", 510, "Gri", 1, "Benzin","S");
	SUV SUV2 = new SUV("Infiniti", "Q30", "Yarı Otomatik", 430, "Gri", 8, "Dizel","S");
	SUV SUV3 = new SUV("Land Rover", "Range Rover", "Otomatik", 725, "Siyah", 2, "Hibrit","S");
	SUV[] SUVs = {SUV1,SUV2,SUV3};
	
	public void displayCars(String chose) {
		switch (chose) {
		case "1":
			System.out.println("Günlük kiralama ücreti: " + hatchback1.rentPrice);
			System.out.println("Lütfen seçmek istediğin arabanın numarasını giriniz.");
			propertiesOfCar(hatchbacks);
			int thecar = carChose()-1;
			char dailyMonthly = dailyorMonthly();
			int dayNumber = howMany(dailyMonthly);
			if('G' == dailyMonthly) {
				System.out.println("Seçiminiz onaylanmıştır.");
				System.out.println(hatchbacks[thecar].getBrand()+ " markasının "+ hatchbacks[thecar].getType()+ " modelini "+ dayNumber + " günlüğüne kiralamış bulunmaktasınız.");		
				System.out.print("Toplam ücret: "+"\t"+ hatchbacks[thecar].dailyrentPrice(dayNumber)+"TL");
			}
			else {
				System.out.println("Seçiminiz onaylanmıştır.");
				System.out.println(hatchbacks[thecar].getBrand()+ " markasının "+hatchbacks[thecar].getType()+ " modelini "+ dayNumber + " aylığına kiralamış bulunmaktasınız.");								
				System.out.print("Toplam ücret: "+"\t"+ hatchbacks[thecar].monthlyrentPrice(dayNumber)+"TL");
			}		
			break;
			
		case "2" :
			System.out.println("Günlük kiralama ücreti: " + sedan1.rentPrice);
			System.out.println("Lütfen seçmek istediğin arabanın numarasını giriniz.");
			propertiesOfCar(sedans);
			int thecar1 = carChose()-1;
			char dailyMonthly1 = dailyorMonthly();
			int dayNumber1 = howMany(dailyMonthly1);
			if('G' == dailyMonthly1) {
				System.out.println("Seçiminiz onaylanmıştır.");
				System.out.println(sedans[thecar1].getBrand()+ " markasının "+ sedans[thecar1].getType()+ " modelini "+ dayNumber1 + " günlüğüne kiralamış bulunmaktasınız.");
				System.out.print("Toplam ücret: "+"\t"+ sedans[thecar1].dailyrentPrice(dayNumber1)+"TL");
			}
			else {
				System.out.println("Seçiminiz onaylanmıştır.");
				System.out.println(sedans[thecar1].getBrand()+ " markasının "+ sedans[thecar1].getType()+ " modelini "+ dayNumber1 + " aylığına kiralamış bulunmaktasınız.");				
				System.out.print("Toplam ücret: "+"\t"+ sedans[thecar1].monthlyrentPrice(dayNumber1)+"TL");
			}	
			break;
			
		case "3" :
			System.out.println("Günlük kiralama ücreti: " + SUV1.rentPrice);
			System.out.println("Lütfen seçmek istediğin arabanın numarasını giriniz.");
			propertiesOfCar(SUVs);
			int thecar2 = carChose()-1;
			Scanner input = new Scanner(System.in);
			System.out.println("Bu segmentteki arabaları yalnızca günlük kiralayabilirsiniz. Lütfen kaç günlüğüne kiralamak istediğinizi sayıyla yazın.");
			int number = input.nextInt();
			System.out.println("Seçiminiz onaylanmıştır.");
			System.out.println(SUVs[thecar2].getBrand()+ " markasının "+SUVs[thecar2].getType()+ " modelini "+ number + " günlüğüne kiralamış bulunmaktasınız.");
			System.out.print("Toplam ücret: "+ SUVs[thecar2].dailyrentPrice(number)+ "TL");
			
			break;		
		}	
	}
	
	public <T> void propertiesOfCar(Vehicle[] car) {
		int number = 1;
		for (int i = 0 ; i < 3;i++) {
			System.out.print(number +") ");
			System.out.println("Marka: "+car[i].getBrand()+"\t"+ "Model: " +car[i].getType()+"\t"+"Vites tipi: "+car[i].getGearType()+"\t"+ "Yakıt tipi: "+car[i].getFuelType()+"\t"+ "Bagaj kapasitesi: "+ car[i].getLuggageCapacity());
			number++;
		}
	}
	
	public static int carChose() {
		AutoShowroom cars = new AutoShowroom();
		Scanner input = new Scanner(System.in);		
		int carChosen = input.nextInt();
		return carChosen;
	}
	
	public static char dailyorMonthly() {
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen günlük mü aylık mı kiralamak istediğinizi belirtin.(G/A)");
		char dOrm = input.next().charAt(0);
		return dOrm;
	}
	
	public static int howMany(char dailyorMonthly) {
		Scanner input = new Scanner(System.in);	
		if (dailyorMonthly == 'G') {
			System.out.println("Lütfen kaç günlüğüne kiralamak istediğinizi sayıyla yazın.");		
		}
		else {
			System.out.println("Lütfen kaç aylığına kiralamak istediğinizi sayıyla yazın.");		
		}
		int number = input.nextInt();
		return number;
	}
}
