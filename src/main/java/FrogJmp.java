public class FrogJmp {
    public static void main(String[] args) {

    }

    public static int solution(int X, int Y, int D) {
        int approxResult = (Y - X) / D;
        if ((Y - X) % D > 0) {
            return approxResult + 1;
        }
        return approxResult;
    }
}
