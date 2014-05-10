
public class PopulationProjection {

	public static void main(String[] args) {
		int Birth;
		int Death;
		int Immigrant;
		int Seconds = 31536000;
		int Population = 312032486;
		int total;
		int Counter = 0;
		
		Birth = Seconds / 7;
		Death = Seconds / 13;
		Immigrant = Seconds / 45;
		
		
		while (Counter < 5) {
			System.out.println("Births = " + Birth);
			System.out.println("Deaths = " + Death);
			System.out.println("Immigrants = " + Immigrant);
			Birth = Birth + Birth;
			Death = Death + Death;
			Immigrant = Immigrant + Immigrant;
			Counter++;
			
		}
		
		total = Birth + Immigrant + Population - Death;
		System.out.println("Projected population after 5 years " + total);
		
			
			
		}
		
		

}
