import java.util.Random;
import java.util.Scanner;

public class RandomTriangleMaker {

	private static Random randomGenerator = new Random();

	// returns a random integer from 1 to 10
	private static int getRandomLength() {
		return randomGenerator.nextInt(10) + 1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many triangles would you like? ");
		int trianglesNeeded = sc.nextInt();
		while (trianglesNeeded > 0) {
			int s1 = getRandomLength();
			int s2 = getRandomLength();
			int s3 = getRandomLength();
			double area; 
			try {
				area = TriangleAreaCalculator.findArea(s1, s2, s3);
			} catch(IllegalArgumentException e) {
				continue;
			}
			System.out.print(s1 + ", " + s2 + ", " + s3);
			System.out.println(": area = " + area);
			trianglesNeeded--;
		}
		sc.close();
	}

}
