package ProjectEuler;

public class LargestPalidromeProduct {

    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        // Reverse the number
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }

        // Check if original number is equal to its reversed version
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        int largestPalindrome = 0;
        int factor1 = 0;
        int factor2 = 0;

        // Loop through all 3-digit numbers
        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) {
                int product = i * j;

                // Check if the product is a palindrome
                if (isPalindrome(product) && product > largestPalindrome) {
                    largestPalindrome = product;
                    factor1 = i;
                    factor2 = j;
                }
            }
        }

        // Print the largest palindrome and its factors
        System.out.println("The largest palindrome made from the product of two 3-digit numbers is " + largestPalindrome);
        System.out.println("Factors are: " + factor1 + " and " + factor2);
    }
}

