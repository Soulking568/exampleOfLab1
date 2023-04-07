import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n) {
            case 1:
                System.out.println("Problem 1");
                Task1.main();
                break;
            case 2:
                System.out.println("Problem 2");
                Task2.main();
                break;
            case 3:
                System.out.println("Problem 3");
                Task3.main();
                break;
            case 4:
                System.out.println("Problem 4");
                Task4.main();
                break;
            case 5:
                System.out.println("Problem 5");
                Task5.main();
                break;
            case 6:
                System.out.println("Problem 6");
                Task6.main();
                break;
            case 7:
                System.out.println("Problem 7");
                Task7.main();
                break;
            case 8:
                System.out.println("Problem 8");
                Task8.main();
                break;
            case 9:
                System.out.println("Problem 9");
                Task9.main();
                break;
            case 10:
                System.out.println("Problem 10");
                Task10.main();
                break;
        }
    }
}

