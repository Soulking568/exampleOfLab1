import java.util.Scanner;

public class Task10 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD: " + gcd(a,b));
    }
    /**
     * This method finds GCD two numbers
     * @param a - first number, n - second number
     * @return value GCD
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
