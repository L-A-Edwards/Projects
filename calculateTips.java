import java.util.Scanner; 

public class calculateTips {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the subtotal and a gratuity rate: ");
		double subtotal = input.nextDouble();
		double gratuity = input.nextDouble();
		double total;
		
		gratuity = gratuity / 10;
		total = subtotal + gratuity;
		System.out.println("The gratuity is " + gratuity + " and the total is " + total);
		
	}

}
