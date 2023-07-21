import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
    public static void main(String[] args){
        
        Scanner sn1 = new Scanner(System.in);
        int num = Integer.parseInt(sn1.nextLine());
        while(num>0){
            String str = sn1.nextLine();
            boolean found=false;
            Pattern ptr=Pattern.compile("<(.+)>([^<]+)</\\1>");
            Matcher mat = ptr.matcher(str);
            while(mat.find())
            {
                System.out.println(mat.group(2));
                found = true;
            }
            if ( !found) {
                System.out.println("None");
            }

            
            num--;
        }
    }
}




