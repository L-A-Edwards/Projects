import java.util.Scanner; 

public class computeVolumeOfCylinder {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the Radius of a Cylinder");
		double radius = input.nextDouble();
		
		System.out.println("Enter the Length of a Cylinder");
		double length = input.nextDouble();
		
		double area = (radius * radius) * 3.14159265;
		double volume = area * length;
		
		System.out.println("The area of the Cylinder is " + area);
		System.out.println("The volume of the Cylinder is " + volume);
		

	}

}
