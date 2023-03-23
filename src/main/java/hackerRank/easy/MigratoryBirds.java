package hackerRank.easy;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MigratoryBirds {
    //return key of the max value from the map, if many keys, return the lowest key from all with max val
    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Long> map = arr.stream().collect(Collectors.groupingBy(
                Function.identity(), Collectors.counting()));
        Set<Integer> keys = map.keySet();
        int randomKey = keys.stream()
                .limit(1)
                .findAny()
                .get();
        long randomValue = map.get(randomKey);
        long maxValue = randomValue;
        for (int key : keys) {
            if(map.get(key) > maxValue) {
                maxValue = map.get(key);
            }
        }
        final long finalMaxVal = maxValue;
        return keys.stream()
                .filter(x -> map.get(x) == finalMaxVal)
                .sorted()
                .limit(1)
                .findAny()
                .get();
    }
}
