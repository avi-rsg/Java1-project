import java.util.Scanner;

public class AverageValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first number
        System.out.print("Input the first number: ");
        double num1 = scanner.nextDouble();

        // Input the second number
        System.out.print("Input the second number: ");
        double num2 = scanner.nextDouble();

        // Input the third number
        System.out.print("Input the third number: ");
        double num3 = scanner.nextDouble();

        // Compute the average
        double average = computeAverage(num1, num2, num3);

        // Print the average value
        System.out.println("The average value is " + average);
    }

    // Method to compute the average of three numbers
    public static double computeAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }
}


