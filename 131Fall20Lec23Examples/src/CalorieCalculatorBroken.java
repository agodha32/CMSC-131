import java.util.Scanner;

public class CalorieCalculatorBroken {

	private static double getUserDoritoArea() {
		Scanner sc = new Scanner(System.in);
		double area = 0.0;
		System.out.println("How big is your Dorito?");
		System.out.print("Length of side 1 (inches)? ");
		double s1 = sc.nextDouble();
		System.out.print("Length of side 2 (inches)? ");
		double s2 = sc.nextDouble();
		System.out.print("Length of side 3 (inches)? ");
		double s3 = sc.nextDouble();
		area = TriangleAreaCalculator.findArea(s1, s2, s3);
		sc.close();
		return area;
	}

	public static void main(String[] args) {
		double calories = getUserDoritoArea() * 6.4;
		System.out.println("That is " + calories + " calories.");
	}

}
