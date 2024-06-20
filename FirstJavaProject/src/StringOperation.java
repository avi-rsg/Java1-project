import java.util.Scanner;

public class StringOperation {

    public boolean nameEquals(String str1, String str2) {
        return str1.equals(str2);
    }

    public boolean nameEqualsIgnoreCase(String str3, String str4) {
        return str3.equalsIgnoreCase(str4);
    }

    public void stringPreDefinedSplitMethod(String str5) {
//        String sl = str5.toLowerCase();
        String[] s1 = str5.split(" ");
        for (String ss1 : s1) {
            System.out.println(ss1);
        }
        System.out.println("-----------");
        String[] s2 = str5.split(" ", 2);
        for (int i = 0; i < s2.length; i++) {
            System.out.println(s2[i]);
        }
    }

    public void stringPreDefinedTrimMethod(String str5) {
        String s3 = str5.trim();
        System.out.println(s3);
    }

    public void stringPreDefinedStripMethod(String str5){

    }

    public void stringPreDefinedSubStringMethod(String str5){

    }


    public static void main(String[] args) {


        StringOperation stringOperation = new StringOperation();

        stringOperation.stringPreDefinedSplitMethod("software testing");
        stringOperation.stringPreDefinedTrimMethod("Software Training");
    }
}