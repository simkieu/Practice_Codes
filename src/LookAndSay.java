/*
 Given a number, say 1, generate next 10 numbers like this:
1, 11, 21, 1211, 111221, 312211, ...
 */

package Epic;

public class LookAndSay {
    
    public static void test_looknsay() {
        int a = 2, n = 10;
        print_looknsay(a, n);
    }

    public static void print_looknsay(int a, int n) {
        String s = Integer.toString(a), s_new;
        int count;
        System.out.println(s);
        for (int i = 0; i < n; i++) {
            count = 1;
            s_new = "";
            if (s.length() == 1) {
                s_new += "1" + s.charAt(s.length()-1);
            } else {
                for (int j = 0; j < s.length() - 1; j++) {
                    if (s.charAt(j) == s.charAt(j + 1)) {
                        count++;
                    } else {
                        s_new += Integer.toString(count) + s.charAt(j);
                        count = 1;
                    }
                }
                if (s.charAt(s.length()-1) != s.charAt(s.length()-2)) {
                    s_new += "1" + s.charAt(s.length()-1);
                } else {
                    s_new += Integer.toString(count) + s.charAt(s.length()-1);
                }
            }
            System.out.println(s_new);
            s = s_new;
        }
    }
}
