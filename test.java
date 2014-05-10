import java.util.Scanner;

import javax.swing.JOptionPane;

public class test {
	public static void main(String[] args) {
		String input = JOptionPane.showInputDialog(null,"Enter an input","Input Dialog Demo",JOptionPane.QUESTION_MESSAGE);
		double doubleValue = Double.parseDouble(input);
		double answer = 0;
		answer = doubleValue * 10 + 5;
		System.out.println(answer);
	}

}
