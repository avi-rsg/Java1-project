package superclass;

public class Solution {
    public static void main(String[] args) {
        Adder adder = new Adder();
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());

        int sum1 = adder.add(20, 22);
        int sum2 = adder.add(7, 6);
        int sum3 = adder.add(10, 10);

        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);
    }
}
