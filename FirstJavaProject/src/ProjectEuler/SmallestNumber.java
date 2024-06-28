package ProjectEuler;

public class SmallestNumber {

        public static void main(String[] args) {
            int[] primes = {2, 3, 5, 7, 11, 13, 17, 19};
            int[] maxPowers = {4, 2, 1, 1, 1, 1, 1, 1}; // Highest powers from factorizations

            long lcm = 1;
            for (int i = 0; i < primes.length; i++) {
                lcm *= Math.pow(primes[i], maxPowers[i]);
            }

            System.out.println("The smallest positive number that is evenly divisible by all of the numbers from 1 to 20 is: " + lcm);
        }
    }


