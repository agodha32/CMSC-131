import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a size for the multiplication table: ");
        int size = keyboard.nextInt();
        for(int i = 1; i <= size; i++) {
            int printNum = i;
            for(int j = 1; j <= size; j++) {
                printNum = i * j;
                System.out.print(printNum + " ");
            }
            System.out.println();
        }
        keyboard.close();
    }
}
