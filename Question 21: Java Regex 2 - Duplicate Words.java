import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Java_DuplicateWords {

    public static void main(String[] args) {

        String str1 = "\\b(\\w+)(\\s+\\1)+\\b";
        Pattern ptr = Pattern.compile(str1, Pattern.CASE_INSENSITIVE);

        Scanner sn1 = new Scanner(System.in);
        int num = Integer.parseInt(sn1.nextLine());
        
        while (num-- > 0) {
            String str2 = sn1.nextLine();
            
            Matcher mat = ptr.matcher(str2);
            
            // Check for subsequences of input that match the compiled pattern
            while (mat.find()) {
                str2 = str2.replaceAll(mat.group(), mat.group(1));
            }
            
            // Prints the modified sentence.
            System.out.println(str2);
        }
        
        sn1.close();
    }
}
