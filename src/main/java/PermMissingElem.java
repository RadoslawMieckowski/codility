import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PermMissingElem {  //find missing element in a given permutation
    public static void main(String[] args) {

    }
    public static int solution(int[] A) {   //w aparacie masz zdjęcie, które warunki brzegowe niespełnione. Dopracuj potem
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        Iterator<Integer> iterator = set.iterator();
        int firstVal = 0;
        int secondVal = 0;
        if (iterator.hasNext()) {
            firstVal= iterator.next();
        }
        while (iterator.hasNext()) {
            secondVal = iterator.next();
            if (secondVal == firstVal + 2) {
                return secondVal - 1;
            }
            firstVal = secondVal;
        }
        return 0;

    }

    public static  int perfectSolution(int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }
        int i = 1;
        while(true) {
            if(!set.contains(i)) {
                return i;
            }
            i++;
        }
    }
}
