import java.util.Scanner;

public class SmallestValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Input the second number: ");
        double num2 = scanner.nextDouble();


        System.out.print("Input the third number: ");
        double num3 = scanner.nextDouble();

        double smallest = findSmallest(num1, num2, num3);
        System.out.println("The smallest value is " + smallest);
    }

    public static double findSmallest(double a, double b, double c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
}

