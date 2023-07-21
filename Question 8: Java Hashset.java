import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class java_hashset1 {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        Set<String> val = new HashSet<String>();
        for (int j = 0; j < pair_right.length; j++) {
            String str1 = pair_left[j] + " "+ pair_right[j];
            val.add(str1);
            System.out.println(val.size());
        }
        s.close();
   }
}
