package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "yes";
//		
//		System.out.println("How many cars are you entering: ");
//		int numInput = scan.nextInt();
//		
		ArrayList<Car> carList = new ArrayList<>();
//		
//		
//		for(int i = 0; i < numInput; i++) {
//			String make = Validator.getString(scan, "Enter Car Make " + (i + 1) + ": ");
//			String model = Validator.getString(scan, "Enter Car Model  " + (i + 1) + ": ");
//			int year = Validator.getInt(scan, "Enter Car Year " + (i + 1) + ": ");
//			double price = Validator.getDouble(scan, "Enter Car Price " + (i + 1) + ": ");
//			carList.add(new Car(make, model, year, price));
//		}
//		System.out.println("Current Inventory:");
//		for(Car xCar : carList) {
//			System.out.println(xCar);
//			
//		}
		
		carList.add(new Car("Honda", "Civic", 2019, 26000.0));
		carList.add(new Car("Toyota", "4Runner", 2019, 40000.0));
		carList.add(new Car("Acura", "TLX", 2019, 35000.0));
		carList.add(new UsedCar("Subaru", "Imperza", 2015, 18999.0, 75000.0));
		carList.add(new UsedCar("Lexus", "CT", 2018, 25000.0, 8756.0));
		carList.add(new UsedCar("Audi", "r8", 2017, 24567.0,15000.0));
		
		
				while (cont.equalsIgnoreCase("yes")) {
					int n = 1;
					for(Car xCar2 : carList) {
						System.out.println((n++) +". " + xCar2);
					}
					int select = Validator.getInt(scan, "Which car would you like? ");
					
					System.out.println(carList.get(select - 1));
					cont = Validator.getString(scan, "Would you like to buy this car? ");
					if(cont.equalsIgnoreCase("yes")) {
						carList.remove(select - 1);
						System.out.println("Excellent! Our finance department will be in touch shortly.");
					}
					System.out.println("Have a great day!");
				}
		}
}
