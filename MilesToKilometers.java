
public class MilesToKilometers {
	public static void main(String[] args) {
		double miles = 100;
		double kilometers;
		final double KILOMETERS_PER_MILE = 1.609;
		
		kilometers = miles * KILOMETERS_PER_MILE;
		
		System.out.println(kilometers);
	}

}
