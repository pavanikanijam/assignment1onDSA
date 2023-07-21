import java.util.Scanner;
import java.util.regex.*;

public class Java_SyntaxChecker
{
    public static void main(String[] args){
        Scanner sn1 = new Scanner(System.in);
        int num = Integer.parseInt(sn1.nextLine());
        while(num>0){
            String str = sn1.nextLine();
              try {
                Pattern.compile(str);
                System.out.println("Valid");
            } catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
            num--;
        }
    }
}
