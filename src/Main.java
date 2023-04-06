import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int min = findMin(arr, arr.length);
        System.out.println("Minimum element in the array is: " + min);
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

}