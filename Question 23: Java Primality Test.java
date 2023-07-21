import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Java_primalityTest {
    private static final Scanner sn1 = new Scanner(System.in);

    public static void main(String[] args) {
        String str = sn1.nextLine();
        BigInteger num = new BigInteger(str);
        if (num.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        sn1.close();
    }
}
