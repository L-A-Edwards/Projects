import java.util.Scanner;

public class sumDigitsInInteger {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inputNumber, number1, number2, number3, number4, total;
		
		System.out.println("Enter a number between 0 and 1000: ");
		inputNumber = input.nextInt();
		
		number1 = inputNumber % 10;
		inputNumber = inputNumber / 10;
		
		number2 = inputNumber % 10;
		inputNumber = inputNumber / 10;
		
		number3 = inputNumber % 10;
		inputNumber = inputNumber / 10;
		
		number4 = inputNumber % 10;
		inputNumber = inputNumber / 10;
		
		total = number1 + number2 + number3 + number4;
		System.out.println("The sum of the digits is " + total);
	}

}
