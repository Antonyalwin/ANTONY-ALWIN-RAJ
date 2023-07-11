public class LastDigitAddition {
    public static int addLastDigits(int number1, int number2) {
        int lastDigit1 = number1 % 10;
        int lastDigit2 = number2 % 10;
        int sum = lastDigit1 + lastDigit2;
        return sum;
    }

    public static void main(String[] args) {
        int number1 = 12345;
        int number2 = 67890;

        int result = addLastDigits(number1, number2);

        System.out.println("The sum of the last digits of " + number1 + " and " + number2 + " is " + result);
    }
}
