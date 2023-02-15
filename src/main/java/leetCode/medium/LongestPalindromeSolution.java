package leetCode.medium;

import java.util.HashSet;
import java.util.Set;

class LongestPalindromeSolution {
    public String longestPalindrome(String s) {
        int currLength = 0;
        int start = 0;
        int end = 0;
        String longestPalindrome = "";
        Set<Character> letters = new HashSet<>();
        while (start != s.length() - 1 && end != s.length() - 1) {
            currLength++;
            if (!letters.contains(s.charAt(end))) {
                letters.add(s.charAt(end));
                end++;
            } else {
                letters.clear();
                String substring = s.substring(start, end + 1);
                String reverseString = new StringBuilder(substring).reverse().toString();
                if (reverseString.equals(s)) {
                    if (currLength > longestPalindrome.length()) {
                        longestPalindrome = substring;
                    }
                }
                currLength = 0;
                start++;
                end = start;
            }
        }
        return longestPalindrome;
    }
}