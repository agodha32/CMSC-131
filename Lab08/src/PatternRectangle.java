import java.util.Scanner;

public class PatternRectangle {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a size for the rectangle: ");
        int size = keyboard.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (j % 2 == 0) {
                    System.out.print("$");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        keyboard.close();
    }
}
