import java.util.Scanner;
public class Task1 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Min number " + findMin(arr,n));
    }

    /**
     * This method finds the minimum value of the array
     * @param n - size array, arr - the required array for the task
     * @return minimum value of the array
     */
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
}
