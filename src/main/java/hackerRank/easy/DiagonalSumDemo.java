package hackerRank.easy;

import java.util.List;

public class DiagonalSumDemo {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int LR_Sum = 0;
        int RL_Sum = 0;
        int size = arr.size();
        int rowHelper = size - 1;
        for (int c = 0; c < size; c++) {
            for (int r = 0; r < size; r++) {
                if (c == r) {
                    LR_Sum += arr.get(c).get(r);
                }
                if (r == rowHelper) {
                    RL_Sum += arr.get(c).get(r);
                    rowHelper--;
                }
            }
        }
        return Math.abs(LR_Sum - RL_Sum);
    }

}
