import java.util.*;

public class ComputingNaturalLog {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input a number to find the natural log: ");
        double userIntegerInput = keyboard.nextInt();
        double sum = 0;
        for (double n = 1.0; n <= userIntegerInput; n++) {
            if (n % 2.0 == 0) {
                sum -= (1 / n);
            } else {
                sum += (1 / n);
            }
        }
        System.out.println("ln(" + userIntegerInput + ") = " + sum);
        keyboard.close();
    }

}

