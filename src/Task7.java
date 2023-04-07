import java.util.Scanner;

public class Task7 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr, n);
    }
    /**
     * This method outputs the reverse version of the entered array
     * @param arr - initial array, n - size of array
     * @return reverse version of array
     */
    public static void reverseArray(int[] arr, int n) {
        if (n == 0) {
            return;
        }
        System.out.print(arr[n-1] + " ");
        reverseArray(arr, n-1);
    }
}
