
public class CalculatingPi {

	public static void main(String[] args) {
		double Pi = 4;
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
		System.out.println(Pi);
	}

}
