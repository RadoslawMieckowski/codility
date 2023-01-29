package easy;

import java.util.HashSet;
import java.util.Set;
//Check whether array A is a permutation.
public class PermCheck {
    public int perfectSolution(int[] A) { // works even if the min value is not 1, for min=1 u can use A.length instead of max
        Set<Integer> elements = new HashSet<>();
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (elements.contains(A[i])) {
                return 0;
            }
            elements.add(A[i]);
            if (A[i] > max) {
                max = A[i];
            }
        }
        if (max == A.length) {
            return 1;
        }
        return 0;
    }
}
