import java.util.Scanner;

public class EvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int result = isEven(number);
        System.out.println("Result: " + result);
    }

    public static int isEven(int number) {
        if (number % 2 == 0) {
            return 2; // Even number
        } else {
            return 1; // Odd number
        }
    }
}
