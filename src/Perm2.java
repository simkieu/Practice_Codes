/*
Given a keyboard with every letter maps a digit from 0 to 9, return all possible permutations of given a n digit number.

eg. 0 <- z,a,q,x,s,w
1 <- c,d,e
2 <- v,f,r
3 <- b,g,t
...
Then permutation of num 1230 will be:
cvbz
cvba
cvbq
...
*/

package Epic;

public class Perm2 {
 
    public static void test_find_perm_2() {
        char[][] A = new char[10][];
        A[0] = new char[] {'z','a','q','x','s','w'};
        A[1] = new char[] {'c','d','e'};
        A[2] = new char[] {'v','f','r'};
        A[3] = new char[] {'b','g','t'};
        A[4] = new char[] {'m','n','k'};
        int n = 1230;
        find_perm_2(n,A,"");
    }
    
    public static void find_perm_2(int n, char[][] A, String a) {
        if (n == 0) {
            for (int i = 0; i < A[0].length; i++)
                System.out.println(A[0][i]);
        } else find_perm_2b(n,A,a);
    }
    
    public static void find_perm_2b(int n, char[][] A, String a) {
        int k, m = n;
        if(m>0) {
            m = m/10;
            k = m%10;
            for (int i = 0; i < A[k].length; i++) {
                find_perm_2b(m,A,A[k][i]+a);
            }
        } else {
            System.out.println(a);
        }     
    }
}
