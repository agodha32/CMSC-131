import java.util.Scanner;

public class PrintDiamond {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a size for the diamond: ");
        int size = keyboard.nextInt();
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (size - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        keyboard.close();
    }
}
