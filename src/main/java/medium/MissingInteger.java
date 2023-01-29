package medium;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {

    public int perfectSolution(int[] A) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 0) {
                set.add(A[i]);
            }
            if (min > A[i]) {
                min = A[i];
            }
            if (max < A[i]) {
                max = A[i];
            }
        }
        if (set.isEmpty()) {
            return 1;
        }
        int minMissing = 1;
        for (; minMissing <= max; minMissing++) {
            if (set.contains(minMissing)) {
            } else {
                break;
            }
        }
        return minMissing;
    }


    //100% correctness   100% performance
    public int imperfectSolution(int[] A) {
            if (A.length == 1) {
                if (A[0] <= 0) {
                    return 1;
                } else if (A[0] == 1) {
                    return 2;
                } else {
                    return --A[0];  //tu chyba źle, bo powinno zwrócić 1
                }
            } else {
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                Set<Integer> set = new HashSet<>();
                for (int i = 0; i < A.length; i++) {
                    if (A[i] >= 0) {
                        set.add(A[i]);
                    }
                    if (min > A[i]) {
                        min = A[i];
                    }
                    if (max < A[i]) {
                        max = A[i];
                    }
                }
                if (set.isEmpty()) {
                    return 1;
                }
                int minMissing = 1;
                for (; minMissing <= max; minMissing++) {
                    if (set.contains(minMissing)) {
                    } else {
                        break;
                    }
                }
                return minMissing;
            }
        }
    }

