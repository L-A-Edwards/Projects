import java.util.Scanner;

public class convertPoundsToKilos {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter amount of Pounds to be converted to Kilograms");
		double pounds = input.nextDouble();
		
		double kilos = pounds / 2.2046;
		System.out.println(pounds + " pounds is " + kilos + "kilograms" );

	}

}
