import java.util.*;

public class solution_javaList {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        List<Integer> listarray = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            listarray.add(sn.nextInt());
        }
        int a1 = sn.nextInt();
        sn.nextLine();
        for (int j = 0; j < a1; j++) {
            String str1 = sn.nextLine();
            if (str1.equals("Insert")) {
                listarray.add(sn.nextInt(), sn.nextInt());
            }
            else if (str1.equals("Delete")) {
                listarray.remove(sn.nextInt());
            }
            if(j != a1-1){
                sn.nextLine();
            }
        }
        for (int k = 0; k < listarray.size(); k++) {
            System.out.printf("%d ", listarray.get(k));
        }
   sn.close();
    }
}




