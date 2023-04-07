import java.util.Scanner;

public class Task3 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Is this a prime number? " + isPrime(n,2));
    }
    /**
     * This method determines whether the entered number is simple
     * @param n - entered number
     * @return yes or no
     */
    public static String isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2) ? "Yes" : "No";
        }
        if (n % i == 0) {
            return "No";
        }

        if (i * i > n) {
            return "Yes";
        }
        return isPrime(n, i + 1);
    }

    public static String isPrime(int n) {
        return isPrime(n, 2);
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
