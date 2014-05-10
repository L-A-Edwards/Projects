
public class AreaPerimeterOfACircle {
	public static void main(String[] args) {
		double Pi = 4;
		double Perimeter;
		double Radius = 5.5;
		double Area;
		boolean plus = false;
		for (int i = 3; i < 10000000; i += 2)
		{
		    if (plus)
		    {
		        Pi += 4.0 / i;
		    }
		    else
		    {
		        Pi -= 4.0 / i;
		    }
		    plus = !plus;
		 }
		
		Perimeter =  2 * Radius * Pi;
		Area = Radius * Radius * Pi;
		
		System.out.println("Perimeter = " + Perimeter);
		System.out.println("Area = " + Area);

	}

}
