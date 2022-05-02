import java.util.*;

public class ReverseNumber {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input an integer to be reversed: ");
        int userIntegerInput = keyboard.nextInt();

        int placeHolder = userIntegerInput;
        int reverse = 0;

        while (placeHolder > 0) {
            int remainder = placeHolder % 10;
            reverse *= 10;
            reverse += remainder;
            placeHolder /= 10;
        }

        System.out.println("The reverse of " + userIntegerInput + " is " + reverse);

        keyboard.close();
    }

}
