package easy;

public class PassingCars {


    public int solution(int[] A) {  //100% correctness, 0% performance
        int counter = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] == 0 && A[j] == 1) {
                    counter++;
                }
            }
        }
        if (counter > 1_000_000_000) {
            return -1;
        }
        return counter;
    }
}
