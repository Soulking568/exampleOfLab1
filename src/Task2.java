import java.util.Scanner;

public class Task2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Avarage array " + findAvg(arr,n));
    }
    /**
     * This method finds the average value of the array
     * @param n - size array, arr - the required array for the task
     * @return average value of the array
     */
    public static double findAvg(int[] arr, int n) {

        if (n == 1) {
            return arr[0];
        }

        double sum = findAvg(arr, n - 1) * (n - 1);
        sum += arr[n - 1];
        return  sum / n;
    }
}
