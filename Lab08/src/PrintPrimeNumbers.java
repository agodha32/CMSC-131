import java.util.Scanner;

public class PrintPrimeNumbers {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("How many prime numbers do you want to print? ");
        int size = keyboard.nextInt();
        int primeNumber = 2;
        int primeNumCounter = 0;
        boolean flag = true;
        while (primeNumCounter < size) {
            flag = true;
            for (int i = 2; i <= Math.sqrt(primeNumber); i++) {
                if (primeNumber % i == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.print(primeNumber + " ");
                primeNumCounter++;
                primeNumber++;
            } else {
                primeNumber++;
            }
        }
        keyboard.close();
    }
}
