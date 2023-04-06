import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 2, 9, 1, 7};
        // Problem 1
        int min = findMin(arr, arr.length);
        System.out.println("Minimum element in the array is: " + min);

        //Problem 2
        double avg = findAvg(arr, arr.length);
        System.out.println("Avarage:" + avg);

        //Problem 3
        int n = sc.nextInt();
        System.out.println("Prime? " + isPrime(n));

        //Problem 4
        System.out.println("Factorial " + factorial(n));

    }
    public static int findMin(int[] arr, int n) {
        if (n == 1) {
            return arr[0];
        }

        int min = findMin(arr, n - 1);
        if (arr[n - 1] < min) {
            min = arr[n - 1];
        }
        return min;
}
    public static double findAvg(int[] arr, int n) {

        if (n == 1) {
            return arr[0];
        }

        double sum = findAvg(arr, n - 1) * (n - 1);
        sum += arr[n - 1];
        return  sum / n;
    }
    public static boolean isPrime(int n, int i) {
        if (n <= 2) {
            return (n == 2) ? true : false;
        }
        if (n % i == 0) {
            return false;
        }

        if (i * i > n) {
            return true;
        }
        return isPrime(n, i + 1);
    }

    public static boolean isPrime(int n) {
        return isPrime(n, 2);
    }
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }




}