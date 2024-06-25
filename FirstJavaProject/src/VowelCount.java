import java.util.Scanner;

public class VowelCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the string: ");
        String inputString = scanner.nextLine();
        int vowelCount = countVowelsUsingLoop(inputString);

        System.out.println("Number of Vowels in the string: " + vowelCount);
    }

    public static int countVowelsUsingLoop(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }

        return count;
    }
}

