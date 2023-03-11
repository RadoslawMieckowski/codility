package hackerRank.easy;

public class NumberLineJumps {
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if (x1 <= x2 && v1 < v2) {  //kangaroo at x1 always behind
            return "NO";
        }
        if (x2 <= x1 && v2 < v1) {  //kangaroo at x2 always behind
            return "NO";
        }
        while(x1 != x2) {
            if (x1 < x2) {
                x1 += v1;
                x2 += v2;
                if (x1 == x2) {
                    return "YES";
                }
                if (x1 > x2) {  //checking if the kangaroo from behind overtook the leader
                    return "NO";
                }
            }
            else { // x1 > x2
                x1 += v1;
                x2 += v2;
                if (x1 == x2) {
                    return "YES";
                }
                if (x1 < x2) {  //checking if the kangaroo from behind overtook the leader
                    return "NO";
                }
            }
        }
        return "NO";
    }
}
