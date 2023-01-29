package easy;

import java.util.HashSet;
import java.util.Set;
// https://app.codility.com/programmers/lessons/4-counting_elements/
public class FrogRiverOne {
    public int perfectSolution(int X, int[] A) {
        Set<Integer> displacementSet = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            displacementSet.add(A[i]);
            if (displacementSet.size() == X) {
                return i;
            }
        }
        return -1;
    }
}
