
public class TriangleAreaCalculator {

	/* Calculate area of triangle given lengths of three sides.
	 * This formula is attributed to a guy named "Heron", but 
	 * was actually known to Archimedes!     
	 */
	
	public static double findArea(double s1, double s2, double s3) {
		double u = (s1 + s2 + s3) / 2;
		double v = u * (u - s1) * (u - s2) * (u - s3);
		if (v <= 0) {
			throw new IllegalArgumentException("Illegal lengths: " + s1 + ", " + s2 + ", " + s3);
		}
		return Math.sqrt(v);
	}
	
	public static void main(String[] args) {
		try {
			System.out.println("Area is " + findArea(1, 1, 5));
		} catch (IllegalArgumentException e) {
			System.out.println("Problem with triangle lengths!");
		}
		System.out.println("Program over.");
	}
	
}
