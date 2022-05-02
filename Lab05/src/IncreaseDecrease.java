import java.util.Scanner;

public class IncreaseDecrease {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter first value: ");
        double first = keyboard.nextDouble();

        System.out.print("Enter second value: ");
        double second = keyboard.nextDouble();

        System.out.print("Enter third value: ");
        double third = keyboard.nextDouble();

        keyboard.close();

        if (first > second && second > third) {
            System.out.println("Decreasing");
        } else if (first < second && second < third) {
            System.out.println("Increasing");
        } else {
            System.out.println("Neither increasing nor decreasing");
        }
    }
}