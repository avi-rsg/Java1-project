import java.util.Scanner;

public class Digits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int input = scanner.nextInt();
        int sum = sumOfDigits(input);
        System.out.println("The sum is " + sum);
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}

