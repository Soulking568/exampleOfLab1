import java.util.Scanner;

public class Task6 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println("Number power: " + power(a,n));
    }
    /**
     * This method finds the degree of the entered number
     * @param a - number, n - degree of number
     * @return power of number
     */
    public static int power(int a, int n) {

        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }
}
