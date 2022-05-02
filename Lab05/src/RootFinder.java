import java.util.*;

public class RootFinder {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = keyboard.nextDouble();

        System.out.print("Enter b: ");
        double b = keyboard.nextDouble();

        System.out.print("Enter c: ");
        double c = keyboard.nextDouble();

        double discriminant = Math.pow(b, 2) - (4 * a * c);
        double root1 = (-b - Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b + Math.sqrt(discriminant)) / (2 * a);

        if (discriminant < 0) {
            System.out.println("There are no real roots");
        } else if (discriminant == 0) {
            System.out.println("The only real root is " + root1);
        } else {
            System.out.println("The roots are " + root1 + " and " + root2);
        }
        keyboard.close();
    }
}
