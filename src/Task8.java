import java.util.Scanner;

public class Task8 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println("String countains only digit? " + isAllDigits(s));
    }
    /**
     * This method checks whether all the characters in the string contain numeric values
     * @param s - string
     * @return yes or no
     */
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
