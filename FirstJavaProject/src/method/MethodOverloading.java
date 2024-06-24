package method;

public class MethodOverloading {

        // Method 1: No parameters

        public void overload() {
            System.out.println(" Display method with no parameters.");
        }

        // Method 2: One parameter
        public void overload(int a) {
            System.out.println(" method with one integer parameter: " + a);
        }

        // Method 3: One string parameter
        public void overload(String s) {
            System.out.println(" method with one string parameter: " + s);
        }

        // Method 4: Two parameters (integer and string)
        public void overload(int a, String s) {
            System.out.println(" method with one integer and one string parameter: " + a + ", " + s);
        }

        // Method 5: Two parameters (string and integer)
        public void overload(String s, int a) {
            System.out.println(" method with one string and one integer parameter: " + s + ", " + a);
        }
    }




