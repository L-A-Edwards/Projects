import java.util.Scanner;
public class convertCelsiusToFahrenheit {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		double fahrenheit;
		// take users input for celsius
		System.out.println("Enter a temperature in Celsius");
		double celsius = input.nextDouble();
		
		// calculate fahrenheit with mathmatical expression
		fahrenheit = (9 * celsius) / 5 + 32;
		// print fahrenheit
		System.out.println(fahrenheit);
		
		
	}

}
