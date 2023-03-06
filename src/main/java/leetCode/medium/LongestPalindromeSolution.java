package leetCode.medium;
//find longest palindrome in a given string. Multiple answers possible
class LongestPalindromeSolution {
    public static void main(String[] args) {
        String input = "aacabdkacaa";
        System.out.println(longestPalindrome(input));
    }
    public static String longestPalindrome(String s) {  //OK but Time Limit Exceeded!
        String longestPalindrome = "";
        if (s.length() == 0) {
            return longestPalindrome;
        }
        if (s.length() == 1) {
            return String.valueOf(s.charAt(0));
        }
        longestPalindrome = String.valueOf(s.charAt(0));
        int k = 1;
        int maxLength = s.length();
        String reversedString = new StringBuilder(s).reverse().toString();
        if (s.equals(reversedString)) {
            return s;
        }
        maxLength--;
        k++;
        int start = 0;
        while (maxLength != 0) {
//            System.out.println("maxLength " + maxLength);
            int end = 0;
            for (int i = k - 1; i >= 0; i--) {
//                System.out.println("k " + k);
//                System.out.println("i " + i);
                end = start + maxLength - 1;
                String substring;
//                System.out.println("start " + start);
//                System.out.println("end " + end);
                if (end + 1 > s.length()) {
                    substring = s.substring(start);
                } else {
                    substring = s.substring(start, end + 1);
                }
                reversedString = new StringBuilder(substring).reverse()
                        .toString();
                if (substring.equals(reversedString)) {
                    return substring;
                }
                start++;
            }
            start = 0;
            k++;
            maxLength--;
        }
        return longestPalindrome;
    }
}
