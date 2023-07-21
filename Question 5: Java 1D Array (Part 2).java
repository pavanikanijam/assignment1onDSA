import java.util.Scanner;

public class Java_Array {
    static boolean val(int i, int leap, int[] game) {
        if ((i < 0) || (game[i] == 1))
            return false;
        if ((i == game.length - 1) || (i + leap > game.length - 1))
            return true;
        game[i] = 1;
        return val(i - 1, leap, game) || val(i + 1, leap, game) || val(i + leap, leap, game);    
    }
    public static boolean canWin(int leap, int[] game) {
        boolean result = val(0, leap, game);

        return result;
    }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int a1 = sn.nextInt();
        while (a1-- > 0) {
            int num = sn.nextInt();
            int leap = sn.nextInt();
            
            int[] game = new int[num];
            for (int i = 0; i < num; i++) {
                game[i] = sn.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        sn.close();
    }

}
