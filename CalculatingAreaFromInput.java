import java.util.Scanner;

public class CalculatingAreaFromInput {
	public static void main(String[] args) {
		System.out.println("Enter a number for radius: ");
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		
		double area = radius * 3.14159;
		
		System.out.println("The area for the circle of radius " + 
		radius + " is " + area);
		
	}

}
