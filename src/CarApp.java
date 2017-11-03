/*
 * @author Siddique Khatri -- created on 11/2/2017
 */
import java.util.Scanner;
import java.util.ArrayList;


public class CarApp {

	public static void main(String[] args) {
		int numCars = 0;
		String make = "";
		String model = "";
		int year = 0;
		double price = 0.00;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		System.out.println();
		System.out.println("How many cars are you entering?");
		numCars = scan.nextInt();
		scan.nextLine();
		ArrayList<Car> carsList = new ArrayList<>();
		
		for(int i=0; i < numCars; i++) {
			System.out.println("Enter Car #" + i + "" + " Make" + ":");
			make = scan.nextLine();
			System.out.println("Enter Car #" + i + "" + " Model" + ":");
			model = scan.nextLine();
			System.out.println("Enter Car #" + i + "" + " Year" + ":");
			year = scan.nextInt();
			System.out.println("Enter Car #" + i + "" + " Price" + ":");
			price = scan.nextDouble();
			scan.nextLine();
			carsList.add(new Car(make, model, year, price));
			}
		System.out.println();
		System.out.println("Current Inventory:");
		System.out.println();
		System.out.print("\t Make" + "\t\t Model" + "\t\t\t Year" + "\t\t\t Price"+ "\n");
		System.out.println("\t ====" + "\t\t =====" +  "\t\t\t ====" + "\t\t\t =====");
		System.out.println(carsList.toString());
		
		scan.close();
	}

}
