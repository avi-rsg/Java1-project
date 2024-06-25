import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        int count = countTwos(number);

        System.out.println(count);

        scanner.close();
    }

    public static int countTwos(int number) {
        int count = 0;
        while (number > 0) {
            int digit = number % 10;  // Get the last digit
            if (digit == 2) {
                count++;
            }
            number /= 10;  // Remove the last digit
        }

        return count;
    }
}
