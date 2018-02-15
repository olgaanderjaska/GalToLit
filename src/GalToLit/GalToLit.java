package GalToLit;

public class GalToLit {

	public static void main(String[] args) {
		double gallons; // converting gallons to liters
		double liters;
		
		double km; //converting kilometers to miles 
		double miles;
		
		
		
		gallons = 10; // gallons 
		liters = gallons * 3.7854;
		System.out.println(gallons + " gallons is " + liters + " liters. ");
		System.out.println();
		
		km = 23; // kilometers
		miles = km * 0.62137;
		
		System.out.println(km + " killometers is " + miles + " miles. ");
		
	}

}
