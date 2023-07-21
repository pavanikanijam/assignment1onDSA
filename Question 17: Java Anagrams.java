import java.util.Scanner;

public class java_Anagram {

    static boolean isAnagram(String str1, String str2) {
        boolean val = false;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        StringBuilder builder = new StringBuilder(str2);

        if (str1.length() == str2.length()) {
            for (int c = 0; c < str1.length(); c++) {
                for (int d = 0; d < builder.length(); d++) {
                    if (str1.charAt(c) == builder.charAt(d)) {
                        builder.deleteCharAt(d);
                        if (c == str1.length() - 1 && builder.length() == 0) {
                            val = true;
                            break;
                        }
                        break;
                    }
                }
            }
        }
        return val;
    }


  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
