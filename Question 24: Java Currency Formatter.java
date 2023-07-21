import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class java_CurrencyFormatter {
    
    public static void main(String[] args) {
        Scanner sn1 = new Scanner(System.in);
        double num = sn1.nextDouble();
        sn1.close();

        NumberFormat num1 = NumberFormat.getCurrencyInstance(Locale.US);
        String str1 = num1.format(num);
        
        String str2 = "Rs." + String.format("%,.2f", num);
        
        num1 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String str3 = num1.format(num);
        
        num1 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String str4 = num1.format(num);
        
        System.out.println("US: " + str1);
        System.out.println("India: " + str2);
        System.out.println("China: " + str3);
        System.out.println("France: " + str4);
    }
}
