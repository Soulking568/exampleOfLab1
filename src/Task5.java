import java.util.Scanner;

public class Task5 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Fibonacci number: " + fibonacci(n));
    }
    /**
     * This method finds a certain Fibonacci number
     * @param n - the coefficient of the fibonacci number
     * @return Fibonacci number
     */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

}
