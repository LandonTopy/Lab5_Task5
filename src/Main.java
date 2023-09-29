import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;

        System.out.println("What is the first number?");
        if (scan.hasNextInt()) {
            first = scan.nextInt();
        }
        else {
            System.out.println("The value you entered was not valid");
            System.exit(0);
        }

        System.out.println("What is the second number?");
        if (scan.hasNextInt()) {
            second = scan.nextInt();
        }
        else {
            System.out.println("The value you entered was not valid");
            System.exit(0);
        }
        if (first > second) {
            System.out.println("" + first + " is greater than " + second);
        } else if (second > first) {
            System.out.println("" + second + " is greater than " + first);
        } else {
            System.out.println("" + first + " is equal to " + second);
        }
    }
}