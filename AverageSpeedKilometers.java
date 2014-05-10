
public class AverageSpeedKilometers {

	public static void main(String[] args) {
		double Miles = 24;
		double Time = 1.6635;
		double SpeedMPH;
		double SpeedKPH;
		
		SpeedMPH = Miles / Time;
		System.out.println(SpeedMPH);
		SpeedKPH = SpeedMPH * 1.6;
		
		System.out.println(SpeedKPH);
		
		
	}

}
