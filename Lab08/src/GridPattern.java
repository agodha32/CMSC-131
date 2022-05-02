import java.util.Scanner;

public class GridPattern {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a size for the rectangle: ");
        int size = keyboard.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        keyboard.close();
    }
}
