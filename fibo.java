/*
There is one kind of numbers call Fibonacci number, which satisfy the following situation:
A. can be spilt into several numbers;
B. The first two number are the same, the next number is equal to the sum of previous two
eg. 112 (2 = 1 + 1), 12,122,436(12 + 12 = 24, 12 + 24 = 36)
If you are given a range by the user, print all numbers that are Fibonacci number in the range.
*/

package Epic;

import static java.lang.Math.cbrt;

public class fibo {

    public static void test_print_fibo() {
        int a = 100, b = 100000;
        print_fibo(a,b);
    }
    
    public static void print_fibo (double a, double b) {
        boolean reach_upper_bound = false;
        double n, p1, p2, i = 1;
        while (i < cbrt(b) && reach_upper_bound == false) {
            n = Double.parseDouble(Integer.toString((int) i)+Integer.toString((int) i)+Integer.toString((int) i*2));
            p1 = i; p2 = 2*i;
            if (n > b) {
                reach_upper_bound = true;
            }
            while (n <= b) {
                if (n >= a) {
                    System.out.println((int) n);
                }
                n = Double.parseDouble(Integer.toString((int) n)+Integer.toString((int) p1 + (int) p2));
                p2 = p1 + p2;
                p1 = p2 - p1;
            }
            i++;
        }
    }
}
