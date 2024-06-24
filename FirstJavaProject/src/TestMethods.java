import java.util.Scanner;

public class TestMethods {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test 1: Find the smallest number among three numbers
        System.out.print("Input the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Input the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Input the third number: ");
        double num3 = scanner.nextDouble();
        System.out.println("The smallest value is " + findSmallest(num1, num2, num3));

        // Test 2: Compute the average of three numbers
        System.out.print("Input the first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Input the second number: ");
        num2 = scanner.nextDouble();
        System.out.print("Input the third number: ");
        num3 = scanner.nextDouble();
        System.out.println("The average value is " + computeAverage(num1, num2, num3));

        // Test 3: Display the middle character of a string
        System.out.print("Input a string: ");
        String str = scanner.next();
        System.out.println("The middle character in the string: " + getMiddleCharacter(str));

        // Test 4: Count all vowels in a string
        System.out.print("Input the string: ");
        scanner.nextLine(); // Consume the leftover newline
        str = scanner.nextLine();
        System.out.println("Number of Vowels in the string: " + countVowels(str));

        // Test 5: Count all words in a string
        System.out.print("Input the string: ");
        str = scanner.nextLine();
        System.out.println("Number of words in the string: " + countWords(str));

        // Test 6: Compute the sum of digits in an integer
        System.out.print("Input an integer: ");
        int number = scanner.nextInt();
        System.out.println("The sum is " + sumOfDigits(number));

        // Test 7: Check whether a string is a valid password
        System.out.println("1. A password must have at least eight characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits.");
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");
        String password = scanner.next();
        System.out.println("Password is valid: " + isValidPassword(password));

        // Test 8: Count the number of digits in an integer with the value 2
        System.out.print("Input a number: ");
        number = scanner.nextInt();
        System.out.println(countDigitTwo(number));
    }

    public static double findSmallest(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }

    public static double computeAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static String getMiddleCharacter(String str) {
        int length = str.length();
        int middle = length / 2;
        if (length % 2 == 0) {
            return str.substring(middle - 1, middle + 1);
        } else {
            return str.substring(middle, middle + 1);
        }
    }

    public static int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static int countWords(String str) {
        if (str.isEmpty()) {
            return 0;
        }
        String[] words = str.split("\\s+");
        return words.length;
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        int digitCount = 0;
        for (char ch : password.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }
        return digitCount >= 2;
    }

    public static int countDigitTwo(int number) {
        int count = 0;
        while (number != 0) {
            if (number % 10 == 2) {
                count++;
            }
            number /= 10;
        }
        return count;
    }
}

