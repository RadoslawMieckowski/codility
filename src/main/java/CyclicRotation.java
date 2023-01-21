import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new int[]{1, 2, 3, 4, 5}, 3)));
    }
    public static int[] solution(int[] A, int K) {
        if (K == 0 || A.length == 0) {
            return A;
        }
        int realShifts = K % A.length;
        while (realShifts != 0) {
            A = singleRotation(A, realShifts--);
        }
        return A;
    }
    public static int[] singleRotation(int[] A, int K) {
        int newTab[] = new int[A.length];
        newTab[0] = A[A.length - 1];
        for (int i = 1; i < A.length; i++) {
            newTab[i] = A[i - 1];
        }
        return newTab;
    }

}

