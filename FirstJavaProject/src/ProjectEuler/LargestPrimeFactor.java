package ProjectEuler;

public class LargestPrimeFactor {
    public static void main(String[] args) {
        long number = 600851475143L;
        System.out.println("The largest prime factor of " + number + " is " + largestPrimeFactor(number));
    }

    public static long largestPrimeFactor(long number) {
        long largestFactor = -1;

        // Divide out the factor of 2
        while (number % 2 == 0) {
            largestFactor = 2;
            number /= 2;
        }

        // Try odd factors from 3 upwards
        for (long i = 3; i <= Math.sqrt(number); i += 2) {
            while (number % i == 0) {
                largestFactor = i;
                number /= i;
            }
        }

        // If number is still greater than 2, then it must be prime
        if (number > 2) {
            largestFactor = number;
        }

        return largestFactor;
    }
}

