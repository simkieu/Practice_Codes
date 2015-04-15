/*
Determine if a given number is colorful or not. 
*/

package Epic;

import java.util.ArrayList;
import java.util.HashSet;

public class Check_colorful_num {
    
    public static void test_check_colorful() {
        int n = 3245;
        System.out.println(color_number_check(n));
    }
    
    public static boolean color_number_check (int n) {
        boolean check = true;
        ArrayList<Integer> A = new ArrayList();
        HashSet<Integer> S = new HashSet();
        int k;
        while (n>0) {
            k = n%10;
            A.add(k);
            n = n/10;    
        }
        for (int i = 0; i < A.size(); i++) {
            int product = 1;
            for (int j = i; j < A.size(); j++) {
                product *= A.get(j);
                if (S.contains(product)) return false;
                else S.add(product);
            }
        }
        return check;
    }
}
