public class SphereVolume {
	public static void main(String[] args) {
		
		System.out.println(sphereVolume(2.0));
	}
	
	public static double sphereVolume(double radius) {
		
		double sphereVolumeFormula = (4.0 / 3.0) * (Math.PI * Math.pow(radius, 3));
		
		return sphereVolumeFormula;
	}
}
