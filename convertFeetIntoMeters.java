import java.util.Scanner;

public class convertFeetIntoMeters {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter amount in Feet to be converted into Meters");
		double feet = input.nextDouble();
		
		double meters = feet / 3.2808;
		System.out.println(feet + " feet is " + meters);

	}

}
