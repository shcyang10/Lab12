package co.grandcircus;

import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cont = "yes";
		
		System.out.println("Welcome to Sean's Motors admin console!");
		
		System.out.println("How many cars are you entering: ");
		int numInput = scan.nextInt();
		
		ArrayList<Car> carList = new ArrayList<>();
		
		
		for(int i = 0; i < numInput; i++) {
			String make = Validator.getString(scan, "Enter Car Make " + (i + 1) + ": ");
			String model = Validator.getString(scan, "Enter Car Model  " + (i + 1) + ": ");
			int year = Validator.getInt(scan, "Enter Car Year " + (i + 1) + ": ");
			double price = Validator.getDouble(scan, "Enter Car Price " + (i + 1) + ": ");
			carList.add(new Car(make, model, year, price));
		}
		System.out.println("Current Inventory:");
		for(Car xCar : carList) {
			System.out.println(xCar);
			
		}
		

		}
}
