/*
If you have a list {1,7,6,3,5,8,9} and user is entering a sum 16.
Output should display (2-4) that is {7,6,3} bc 7+6+3 = 16
 */

package Epic;

import java.util.ArrayList;

public class Knapsack_Exact {
    
    public static void test_knapsack() {
        int[] A = new int[]{1, 7, 6, 3, 5, 8, 9};
        int n = 16;
        ArrayList<Integer> a = knapsack(A, n);
        for (int i = 0; i < a.size()/2; i++) {
            System.out.println("["+a.get(2*i)+", "+a.get(2*i+1)+"]");
        }
    }

    public static ArrayList<Integer> knapsack(int[] A, int n) {
        ArrayList<Integer> a = new ArrayList();
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                if (sum == n) {
                    a.add(i+1);
                    a.add(j+1);
                }
            }
        }
        return a;
    }
}
