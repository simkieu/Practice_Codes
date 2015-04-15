/*
Find seed of a number.
Eg: 1716 = 143*1*4*3, so 143 is the seed of 1716. 
Find all possible seeds of a given number.
 */

package Epic;

import java.util.ArrayList;

public class FindSeed {
    
    public static void test_find_seed() {
        int n = 1716;
        ArrayList<Integer> s = find_seed(n);
        System.out.println(s);
    }
    
    public static ArrayList<Integer> find_seed(int n) {
        ArrayList<Integer> s = new ArrayList();
        int r, product, factor;
        for (int i = 1; i <= n/2; i++) {
            product = 1; factor = i;
            for (;factor > 0;factor /= 10) {
                r = factor%10;
                product *= r;
            }
            if (product*i == n) {
                s.add(i);
            }
        }
        return s;
    }
}
