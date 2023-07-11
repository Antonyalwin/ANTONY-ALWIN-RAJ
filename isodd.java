import java.util.Scanner;

public class OddNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int result = isOdd(number);
        System.out.println("Result: " + result);
    }

    public static int isOdd(int number) {
        if (number % 2 == 1) {
            return 2; // Number is odd
        } else {
            return 1; // Number is even
        }
    }
}
