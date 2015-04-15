/*
 Print all the palindromes of size greater than or equal to 3 in a given string.
 */
 
package Epic;

import java.util.HashSet;

public class Palindrome3 {

    public static void test_palindrome3() {
        String x = "abaabccbaaba";
        print_palindrome_3(x);
    }

    public static void print_palindrome_3(String x) {
        if (x.length() < 3) {
            System.out.println("No palindromes of size > 2 was found.");
        } else {
            HashSet<String> S = new HashSet();
            String y = "$";
            for (int i = 0; i < x.length(); i++) {
                y += x.charAt(i) + "$";
            }
            for (int i = 3; i < y.length() - 3; i++) {
                String p = Character.toString(y.charAt(i));
                int count = 0;
                for (int j = 1; i - j >= 0 && i + j <= y.length() - 1; j++) {
                    if (y.charAt(i - j) == y.charAt(i + j)) {
                        count++;
                        p = Character.toString(y.charAt(i - j)) + p + Character.toString(y.charAt(i + j));
                        if (count > 2 && y.charAt(i - j) == '$') {
                            if (!S.contains(p)) {
                                for (int k = 1; k < p.length() - 1; k += 2) {
                                    System.out.print(p.charAt(k));
                                }
                                System.out.println();
                                S.add(p);
                            }
                        }
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
