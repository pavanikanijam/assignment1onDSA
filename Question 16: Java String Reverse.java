import java.util.*;

public class Java_StringReverse {

    public static void main(String[] args) {
        
        Scanner sn1=new Scanner(System.in);
        String str1=sn1.next();
        /* Enter your code here. Print output to STDOUT. */
        String rev = "";
        for(int i=str1.length()-1;i>=0;i--)
            rev+=str1.charAt(i);
        if(rev.equals(str1))
            System.out.println("Yes");
        else
            System.out.println("No");

        sn1.close();
    }
}
