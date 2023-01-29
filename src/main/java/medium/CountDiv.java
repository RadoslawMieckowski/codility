package medium;
//Compute number of integers divisible by k in range [a..b].
public class CountDiv {


    public static int solution(int A, int B, int K) {   //100% correctness, 0(B-A) 0% performance
        int counter = 0;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                counter++;
            }
        }
        return counter;
    }
}
