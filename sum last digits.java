public class LastDigitSum {
    public static int getLastDigit(int number) {
        return number % 10;
    }

    public static int sumLastDigits(int number1, int number2) {
        int lastDigit1 = getLastDigit(number1);
        int lastDigit2 = getLastDigit(number2);
        int sum = lastDigit1 + lastDigit2;
        return sum;
    }

    public static void main(String[] args) {
        int number1 = 12345;
        int number2 = 67890;

        int result = sumLastDigits(number1, number2);

        System.out.println("The sum of the last digits of " + number1 + " and " + number2 + " is " + result);
    }
}

