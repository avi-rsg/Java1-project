import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A password must have at least ten characters.");
        System.out.println("A password consists of only letters and digits.");
        System.out.println("A password must contain at least two digits.");
        System.out.print("Input a password (You are agreeing to the above Terms and Conditions.): ");

        String password = scanner.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid: " + password);
        } else {
            System.out.println("Password is invalid: " + password);
        }

        scanner.close();
    }

    public static boolean isValidPassword(String password) {
        // Check if password has at least ten characters
        if (password.length() < 10) {
            return false;
        }

        int digitCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);

            // Check if password consists of only letters and digits
            if (!Character.isLetterOrDigit(ch)) {
                return false;
            }

            // Count digits
            if (Character.isDigit(ch)) {
                digitCount++;
            }
        }

        // Check if password contains at least two digits
        if (digitCount < 2) {
            return false;
        }

        return true;
    }
}
