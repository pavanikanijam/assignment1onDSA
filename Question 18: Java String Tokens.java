import java.io.*;
import java.util.*;

public class Java_StringTokens {

    public static void main(String[] args) {
        Scanner sn1 = new Scanner(System.in);
        String str1 = sn1.nextLine();
        // Write your code here.
        str1 = str1.trim();
        if (str1.length() == 0) {
            System.out.println(0);
        }
        else {
            String[] array = str1.split("[ !,?._'@]+");
            System.out.println(array.length);
            for (String str : array) {
                System.out.println(str);
            }
        }
        sn1.close();
    }
}
