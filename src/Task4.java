import java.util.Scanner;

public class Task4 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Factorial " + factorial(n));
    }
    /**
     * This method leads the factorial of the entered number
     * @param n - the number of which it is necessary to find the factorial
     * @return factorial of a number
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
