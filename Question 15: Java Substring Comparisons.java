import java.util.Scanner;

public class Java_SubStringComparision {
    public static String getSmallestAndLargest(String str1, int num1) {

        String str2 = str1.substring(0, num1);
        String str3 = str2;
        String str4 = str2;

        for (int i = 1; i <= (str1.length() - num1); i++) {
            str2 = str1.substring(i, (i + num1));

            if (str2.compareTo(str3) < 0) {
                str3 = str2;
            }
            if (str2.compareTo(str4) > 0) {
                str4 = str2;
            }
        }

        return str3 + "\n" + str4;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
