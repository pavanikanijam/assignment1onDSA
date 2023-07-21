import java.io.*;
import java.util.*;
public class Java_BitSet1 {

    public static void main(String[] args) {
        Scanner sn1 = new Scanner(System.in);
        int num1 = sn1.nextInt();
        int num2 = sn1.nextInt();
        BitSet[] b = new BitSet[]{new BitSet(num1), new BitSet(num1)};
        for (int i = 0; i < num2; i++) {
            String str1 = sn1.next();
            int n1 = sn1.nextInt() - 1;
            int n2 = sn1.nextInt() - 1;
            if (str1.equals("AND")) {
                b[n1].and(b[n2]);
            }
            if (str1.equals("OR")) {
                b[n1].or(b[n2]);
            }
            if (str1.equals("XOR")) {
                b[n1].xor(b[n2]);
            }
            if (str1.equals("FLIP")) {
                b[n1].flip(num1 - n2 - 1);
            }
            if (str1.equals("SET")) {
                b[n1].set(num1 - n2 - 1);
            }
            System.out.println(b[0].cardinality() + " " + b[1].cardinality());
        }
        sn1.close();
    }
}
