package leetCode.medium;

import java.util.HashSet;
import java.util.Set;

// Longest Substring Without Repeating Characters
class LengthOfLongestSubstringSolution {

    public static void main(String[] args) {
        String input = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(input));
    }
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int currMax = 0;
        int startOfSequence = 0;
        Set<Character> letters = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if(!letters.contains(s.charAt(i))) {
                letters.add(s.charAt(i));
                currMax++;
            } else {
                i = startOfSequence;
                startOfSequence++;
                letters.clear();
                if (currMax > maxLength) {
                    maxLength = currMax;
                }
                currMax = 0;
            }
        }
        if (letters.size() == s.length()) {
            return currMax;
        }
        if (currMax > maxLength) {
            maxLength = currMax;
        }
        return maxLength;
    }
}

