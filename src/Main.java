import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5, 2, 9, 1, 7};
        //TODO Problem 1
        int min = findMin(arr, arr.length);
        System.out.println("Minimum element in the array is: " + min);

        //TODO Problem 2
        double avg = findAvg(arr, arr.length);
        System.out.println("Avarage:" + avg);

        //TODO Problem 3
        int n = sc.nextInt();
        System.out.println("Prime? " + isPrime(n));

        //TODO Problem 4
        System.out.println("Factorial " + factorial(n));

        //TODO Problem 5
        System.out.println("Find Fibonacci number " + fibonacci(n));

        //TODO Problem 6
        int a= sc.nextInt();
        int nPower = sc.nextInt();
        System.out.println("Power" + power(a,nPower));

        /*//TODO Problem 7
        int[] array = {4,5,6,7,9,4,2};
        System.out.println(reverse(array););*/

        //TODO Problem 8
        String s = sc.next();
        System.out.println("String countains only digit? " + isAllDigits(s));
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

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static int power(int a, int n) {

        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }

    /*public static void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start+1, end-1);
    }
    public static void reverseArray(int[] arr) {
        reverse(arr, 0, arr.length-1);
    }*/

    public static String isAllDigits(String s) {

        if (s.length() == 0) {
            return "Yes";
        }
        if (Character.isDigit(s.charAt(0))) {
            return isAllDigits(s.substring(1));
        }
        return "No";
    }

}
