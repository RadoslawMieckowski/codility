package hackerRank.easy.medium;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

public class ClimbingTheLeaderboard {
    public static List<Integer> climbingLeaderboard(List<Integer> ranked, List<Integer> player) { // O(n + m)
        Stack<Integer> rankedStack = new Stack<>();
        ranked.stream().distinct()
                .forEach(element -> rankedStack.add(element));
        Stack<Integer> playerStack = new Stack<>();
        for (int i = player.size() - 1; i >= 0; i--) {
            playerStack.add(player.get(i));
        }
        List<Integer> results = new LinkedList<>();
        while (!playerStack.isEmpty()) {
            if(!rankedStack.isEmpty()) {
                if (rankedStack.peek() > playerStack.peek()) {
                    rankedStack.add(playerStack.pop());
                    results.add(rankedStack.size());
                } else {
                    rankedStack.pop();
                }
            } else {
                rankedStack.add(playerStack.pop());
                results.add(rankedStack.size());
            }
        }
        return results;
    }

    public static List<Integer> climbingLeaderboard_ON2(List<Integer> ranked, List<Integer> player) {   // O(n^2)
         List<Integer> results = new LinkedList<>();
         List<Integer> uniqueRanked = ranked.stream()
             .distinct().collect(Collectors.toList());
         for (int i = 0; i < player.size(); i++) {
             int index = 1;
             for (int j = 0; j < uniqueRanked.size(); j++) {
                 if (player.get(i) < uniqueRanked.get(j)) {
                     index++;
                 }
             }
             results.add(index);
         }
         System.out.println(results);
         return results;
    }
}
