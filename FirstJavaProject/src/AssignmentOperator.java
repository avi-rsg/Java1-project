import java.util.Scanner;

public class AssignmentOperator {

    public void intMethod(int i,int i1){
        if(i>i1){
            int sum=i+i1;
            System.out.println("add operation is(>) : "+sum);
        }else if(i<i1){
            int sub=i1-i;
            System.out.println("sub operation is(<) : "+sub);
        }else if(i==i1){
            int mul=i*i1;
            System.out.println("mul operation is(==) : "+mul);
        }else{
            System.out.println("None of above");
        }

    }

    public void doubleMethod(double d1,double d2){
        if(d1!=d2){
            if(d1>=d2){
                System.out.println("D1 is greater then D2");
            } else if (d1<=d2) {
                System.out.println("D1 is less then D2");
            }
        }else {
            System.out.println("d1 is equal to d2");
        }
    }


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the i value : ");
        int i=scanner.nextInt();
        System.out.println("Enter the i1 value : ");
        int i1=scanner.nextInt();
        System.out.println("Enter the d1 value : ");
        double d1=scanner.nextDouble();
        System.out.println("Enter the d2 value : ");
        double d2=scanner.nextDouble();

        AssignmentOperator ao=new AssignmentOperator();
        ao.intMethod(i,i1);
        ao.doubleMethod(d1,d2);
    }

}