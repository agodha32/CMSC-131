public class ModulusPrimeChallange {

    public static void main(String[] args) {
        findIt();
    }

    public static void howManyFactors(int n) {
        int factorsCounter = 0;
        for (int number = 1; number <= n; number++) {
            if (n % number == 0) {
                factorsCounter++;
            }
        }
        System.out.println("The number of factors for " + n + " is " + factorsCounter);
    }

    public static void isItPrime(int n) {
        boolean flag = true;
        for (int number = 2; number < Math.sqrt(n); number++) {
            if (n % number == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void printNthPrime(int n) {
        int count = 0;
        int number = 2;
        boolean flag;
        while (count < n) {
            flag = true;
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
            number++;
        }
        System.out.println(number - 1);
    }

    public static void findIt() {
        long number = 1;
        boolean found = false;
        while (!found) {
            for (int i = 2; i <= 23; i++) {
                if (number % i != i - 1) {
                    break;
                } else if (i == 23) {
                    found = true;
                }
            }
            if (found) {
                System.out.println(number);
            } else {
                number++;
            }

        }
    }
}

