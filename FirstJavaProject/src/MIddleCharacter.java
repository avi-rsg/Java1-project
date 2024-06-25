import java.util.Scanner;

class MiddleCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input a string: ");
        String inputString = scanner.nextLine();

        // Find and display the middle character(s)
        String middleCharacters = findMiddleCharacter(inputString);
        System.out.println("The middle word in the string: " + middleCharacters);
    }

    public static String findMiddleCharacter(String str) {
        int length = str.length();
        int middle = length / 2;

        if (length % 2 == 0) {
            return String.valueOf(str.charAt(middle));
        } else
            return String.valueOf(str.charAt(middle));
        }
    }
}
