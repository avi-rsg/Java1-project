public class LoopProgram{

    public static void main(String[] args) {
        // Calling each method to perform the tasks
        printOddNumbers();
        printSquares();
        printNumbersWithIncrement();
    }

    // Method to print odd numbers between 0 and 34
    public static void printOddNumbers() {
        System.out.println("Odd numbers between 0 and 34:");
        for (int i = 0; i <= 34; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println(); // For better readability
    }

    // Method to print the squares of numbers between 1 and 10
    public static void printSquares() {
        System.out.println("Squares of numbers between 1 and 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Square of " + i + " is: " + (i * i));
        }
        System.out.println(); // For better readability
    }

    // Method to print numbers between 20 and 50 with increments of 1.5
    public static void printNumbersWithIncrement() {
        System.out.println("Numbers between 20 and 50 with increments of 1.5:");
        for (double i = 20; i <= 50; i += 1.5) {
            System.out.println(i);
        }
    }
}

