import java.util.*;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input a number: ");
        int userIntegerInput = keyboard.nextInt();

        int placeHolder = userIntegerInput;
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(userIntegerInput); i++) {
            int remainder = placeHolder % i;
            if (remainder == 0) {
                System.out.println("The number " + userIntegerInput + " is not prime");
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println("The number " + userIntegerInput + " is prime");
        }
        keyboard.close();
    }
}
