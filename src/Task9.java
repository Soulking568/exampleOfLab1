import java.util.Scanner;

public class Task9 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int k = sc.nextInt();

        System.out.println("Binomial coefficient: " + binomialCoefficient(n,k));
    }
    /**
     * This method find Binomial coefficient
     * @param k - upper number, n - lower number
     * @return value Binomial coefficient
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomialCoefficient(n-1, k-1) * n / k;
        }
    }
}
