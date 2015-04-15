/*
Output all the permutations of HashSet
*/

package Epic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Perm1 {

     public static void test_find_perm_1() {
        HashSet<String> S = new HashSet();
        int[] a = new int[]{1, 2, 3, 4, 5};
        int[] b = new int[]{4, 5, 6, 7, 8};
        String[] c = convert2string(a);
        String[] d = convert2string(b);
        S.addAll(Arrays.asList(c));
        S.addAll(Arrays.asList(d));
        print_permutation("",S);
    }

    public static String[] convert2string(int[] a) {
        String[] b = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = Integer.toString(a[i]);
        }
        return b;
    }

    public static void print_permutation(String prefix, HashSet<String> a) {
        if (a.isEmpty()) {
            System.out.println(prefix);
        } else {
            Iterator<String> I = a.iterator();
            while (I.hasNext()) {
                String str = I.next();
                HashSet<String> c = new HashSet();
                c.addAll(a);
                c.remove(str);
                print_permutation(prefix+str,c);
            }
        }
    }
}
