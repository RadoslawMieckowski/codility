package medium;

import java.util.Arrays;

public class MaxCounters {
    public static void main(String[] args) {
        int table[] = {2, 1, 1, 2, 1};
        System.out.println(Arrays.toString(perfectSolution(1, table)));

    }


    public static int[] solution(int N, int[] A) {
        int table[] = new int[N];
        Arrays.fill(table, 0);
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                table[A[i] - 1]++; //= increase(table[i])
            } else {
                maxCounter(table);
            }
        }
        return table;
    }
    public static void maxCounter(int[] table) {
        int max = table[0];
        for (int  i = 1; i < table.length; i++) {
            if (max < table[i]) {
                max = table[i];
            }
        }
        Arrays.fill(table, max);
    }

    public static int[] perfectSolution(int N, int[] A) {   //60% performance
        int max = 0;
        int table[] = new int[N];
        Arrays.fill(table, 0);
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                table[A[i] - 1]++;
                if (max < table[A[i] - 1]) {
                    max = table[A[i] - 1];
                }
            } else {
                Arrays.fill(table, max);
            }
        }
        return table;
    }
}
