import java.util.Scanner;

public class PrintTriangle {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a size for the triangle: ");
        int size = keyboard.nextInt();
        for (int i = 0; i < size; i++) {
            for (int j = 1; j <= size; j++) {
                if (j < size - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        keyboard.close();
    }

}
