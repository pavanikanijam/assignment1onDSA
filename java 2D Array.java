import java.io.*;
import java.util.*;

public class java_array {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] a = new int[6][6];
        for (int i = 0; i < 6; i++){
            for (int j =0; j<6; j++){
                a[j][i] = s.nextInt();
            }
        }
        int max = getHourglass(a, 1,1);
        for (int i=1; i<5; i++){
            for (int j=1; j<5; j++){
                int sum = getHourglass(a, j, i);
                if (sum > max){
                    max = sum;
                }
            }
        }
        System.out.println(max);
    }
    
    public static int getHourglass(int[][] a, int j, int i) {
        return a[j][i] + a[j-1][i-1] + a[j][i-1] + a[j+1][i-1] + a[j-1][i+1]
            + a[j][i+1] + a[j+1][i+1];
    }
}



