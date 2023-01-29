package easy;

public class SmallestDifferenceInPartitions {
    public static void main(String[] args) {
        int table[] = {3, 1, 2, 4, 3};
        int table2[] = {-10, -20, -30, -40, 100};
        System.out.println(solution(table));
        System.out.println(perfectSolution(table2));
    }
    public static int solution(int[] A) {   //nie sprawdzałem wydajności i poprawności
        int pointer = 1;
        int min = Integer.MAX_VALUE;
        for (int i = pointer; i < A.length; i++) {
            int diff = calculateDiff(i, A);
            if (diff < min) {
                min = diff;
            }
        }
        return min;
    }
    public static int calculateDiff(int pointer, int[]A) {
        int firstPartSum = 0;
        for (int i = 0; i < pointer; i++) {
            firstPartSum += A[i];
        }
        int secondPartSum = 0;
        for (int i = pointer; i < A.length; i++) {
            secondPartSum += A[i];
        }
        int result = Math.abs(firstPartSum - secondPartSum);
        return result;
    }

    public static int perfectSolution(int A[]) {
        if (A.length == 2) {
            return Math.abs(A[0] - A[1]);
        }
        int sum = 0;
        int RSum = 0;
        int LSum = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }
        for (int i = 0; i < A.length - 1; i++) {
            LSum += A[i];
            RSum = sum - LSum;
            int diff = Math.abs(LSum - RSum);
            if (diff < min) {
                min = diff;
            }
        }
        return min;
    }
}
