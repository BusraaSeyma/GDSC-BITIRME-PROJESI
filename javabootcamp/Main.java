package javabootcamp;
import java.util.Scanner;

public class Main {
	static Customer costumer = new Customer();

	public static void main(String[] args) {
		System.out.println("Merhaba");
		System.out.println("Araç kiralama firmamıza hoşgeldiniz!");		
		boolean costumerType = isBireysel();
		yonlendirme(costumerType);
		aracYonlendirme(costumerType);
		
		
	}
	
	public static boolean isBireysel() {
		Scanner input = new Scanner(System.in) ;
		System.out.println("Bireysel kullancı mısınız yoksa şirket kullancısı mı?(B/Ş)");	
		char name = input.next().charAt(0);
		return  name == 'B';
				
		}
	
	public static void yonlendirme(boolean costumerType) {
		if (costumerType) {
			Scanner input = new Scanner(System.in);
			System.out.println("Lütfen ismnizi giriniz: ");	
			costumer.setName(input.next());
			System.out.println("Lütfen telefon numaranızı giriniz: ");
			Scanner input1 = new Scanner(System.in);
			costumer.setPhoneNumber(input1.next());
			System.out.println("Lütfen TC no giriniz: ");
			Scanner input2 = new Scanner(System.in);
			costumer.setId(input2.next());		
			
		}
		
		else {
			Scanner input = new Scanner(System.in);
			System.out.println("Lütfen şirket ismnizi giriniz: ");
			costumer.setName(input.next());
			Scanner input1 = new Scanner(System.in);
			System.out.println("Lütfen telefon numaranızı giriniz: ");			
			costumer.setPhoneNumber(input1.next());
			Scanner input2 = new Scanner(System.in);
			System.out.println("Lütfen vergi no giriniz: ");
			costumer.setId(input2.next());		
		}
	}
	
	public static void aracYonlendirme(boolean costumerType) {
		AutoShowroom cars = new AutoShowroom();
		if (costumerType) {
			System.out.println("Hoşgeldin "+costumer.getName()+". Lütfen seçmek istediğin araba segmentinin numarasını yaz.");
			System.out.println("1- Hatchback");
			System.out.println("2- Sedan");
			Scanner input = new Scanner(System.in);		
			String chose = input.nextLine();
			cars.displayCars(chose);
		}
		else {
			System.out.println("Hoşegldiniz! Lütfen seçmek istediğiniz araba segmentinin numarasını girin.");
			System.out.println("1-Hatchback");
			System.out.println("2-Sedan ");
			System.out.println("3-SUV");
			Scanner input = new Scanner(System.in);
			String chose = input.nextLine();
			cars.displayCars(chose);
			
		}		
	}
}
