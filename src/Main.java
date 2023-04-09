import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch (n) {
            case 1 -> {
                System.out.println("Problem 1");
                Task1.main();
            }
            case 2 -> {
                System.out.println("Problem 2");
                Task2.main();
            }
            case 3 -> {
                System.out.println("Problem 3");
                Task3.main();
            }
            case 4 -> {
                System.out.println("Problem 4");
                Task4.main();
            }
            case 5 -> {
                System.out.println("Problem 5");
                Task5.main();
            }
            case 6 -> {
                System.out.println("Problem 6");
                Task6.main();
            }
            case 7 -> {
                System.out.println("Problem 7");
                Task7.main();
            }
            case 8 -> {
                System.out.println("Problem 8");
                Task8.main();
            }
            case 9 -> {
                System.out.println("Problem 9");
                Task9.main();
            }
            case 10 -> {
                System.out.println("Problem 10");
                Task10.main();
            }
        }

    }
}
