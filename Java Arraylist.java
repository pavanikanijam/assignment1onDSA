import java.util.*;

public class Java_Arraylist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        ArrayList<ArrayList<Integer>> array = new ArrayList<>();
        
        for (int i = 0; i < num; i++) {
            int val = s.nextInt();
            ArrayList<Integer> array1 = new ArrayList<>();
            
            for (int j = 0; j < val; j++) {
                array1.add(s.nextInt());
            }
            
            array.add(array1);
        }
        
        int val1 = s.nextInt();
        
        for (int i = 0; i < val1; i++) {
            int a1 = s.nextInt();
            int a2 = s.nextInt();
            
            try {
                System.out.println(array.get(a1 - 1).get(a2 - 1));
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
