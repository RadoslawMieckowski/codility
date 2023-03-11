package hackerRank.easy.algorithms.Strings;

import java.util.Stack;

public class SuperReducedString {

    public static String superReducedString(String s) {
        Stack<Character> sourceStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            sourceStack.add(s.charAt(i));
        }
        Stack<Character> destinationStack = new Stack<>();
        while(!sourceStack.empty()) {
            if (!destinationStack.empty()) {
                if (sourceStack.peek().charValue() != destinationStack.peek().charValue()) {
                    destinationStack.push(sourceStack.pop());
                } else {
                    sourceStack.pop();
                    destinationStack.pop();
                }
            } else {
                destinationStack.push(sourceStack.pop());
            }
        }
        if (!destinationStack.empty()) {
            StringBuilder builder = new StringBuilder();
            while (!destinationStack.empty()) {
                builder.append(destinationStack.pop());
            }
            return builder.toString();
        }
        return "Empty String";
    }

}
