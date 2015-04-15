/*
Long Subtraction -- Given two arrays A, B, each contains elements of digits, return an array of A - B. Your machine can only do calculation of less than 20.
eg. A = [1,2,5,7,5];
B = [3,4,8,9];
A - B = [9,0,8,6];
*/

package epic;

import java.util.Arrays;

public class Epic {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 5, 7, 5};
        int[] b = new int[]{3, 4, 8, 9};
        int[] c = subtract(a, b);
        System.out.println(Arrays.toString(c));
    }

    public static int[] subtract(int[] a, int[] b) {
        int bb, rem = 0, count = 0;
        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (i < b.length) bb = b[b.length-1-i];
            else bb = 0;
            if (a[a.length-1-i] - rem < bb) {
                c[a.length-1-i] = a[a.length-1-i] - rem - bb + 10;
                rem = 1;
            } else {
                c[a.length-1-i] = a[a.length-1-i] - rem - bb;
                rem = 0;
            }
            if (c[a.length-1-i] != 0) count = i+1;
        }
        int[] cc = new int[count];
        for (int i = cc.length-1; i >= 0; i--)
            cc[i] = c[i+c.length-count];
        return cc;
    }
}
