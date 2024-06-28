package ProjectEuler;

public class PrimeNumberFinder {


        public static void main(String[] args) {
            int count = 0;
            int number = 1;
            int prime = 0;

            while (count < 10001) {
                number++;
                if (isPrime(number)) {
                    count++;
                    prime = number;
                }
            }

            System.out.println("The 10001st prime number is: " + prime);
        }

        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


