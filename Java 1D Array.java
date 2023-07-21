package MyTestProject;

import java.util.Scanner;

public class java_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        int count = 0;
        int sum;
        for (int i = 0; i < n; i++){
            sum = array[i];
            if (sum < 0) {
                count++;
            }
            for (int j = i + 1; j < n; j++) {
                sum = sum + array[j];
                if (sum < 0) {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}
