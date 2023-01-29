package easy;

import java.util.*;
import java.util.stream.Collectors;

public class OddsInArray {
    public static void main(String[] args) {
        int tab[] = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(perfectSolution(tab));
    }


//    public static int solution(int[] A) {
//        // Implement your solution here
//        Map<Integer, Long> mapOfLetters = Arrays.stream(A)
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));  błąd kompilacji, nie wiem czemu
//        List<Integer> list = mapOfLetters.keySet().stream()
//                .filter(x -> x % 2 != 0).collect(Collectors.toList());
//        return list.get(0);
//    }

//Detected time complexity:
//O(N) or O(N*log(N))
    public static int perfectSolution(int[] A) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for(int i = 0; i < A.length; i++) {
            if (!uniqueNumbers.contains(A[i])) {
                uniqueNumbers.add(A[i]);
            } else {
                uniqueNumbers.remove(A[i]);
            }
        }
        return uniqueNumbers.stream().findAny().get();
    }

    /////////////////////////////////////////////////////////////////
    public static int solution2(int[] A) {  //traiczna złożoność 0% solution
        // Implement your solution here
        Map<Integer, Long> mapOfLetters = new HashMap<>();
        Set<Integer> keys = Arrays.stream(A).mapToObj(x -> Integer.valueOf(x)).collect(Collectors.toSet());
        keys.stream().forEach(x -> mapOfLetters.put(x, count(x, A)));
        long searchedValue = mapOfLetters.values().stream()
                .filter(x -> x % 2 != 0).findFirst().get();
       return getFirstKey(mapOfLetters, searchedValue);
    }

    public static long count(int x, int[] A) {
        return Arrays.stream(A)
                .filter(y -> y == x).count();
    }

    public static <Integer, Long> Integer getFirstKey(Map<Integer, Long> map, Long value) {
        Integer key = map
                .entrySet()
                .stream()
                .filter(entry -> value.equals(entry.getValue()))
                .map(Map.Entry::getKey)
                .findFirst()
                .get();

        return key;
    }
/////////////////////////////////////////////////////////////////


}
