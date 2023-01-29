package easy;

import java.util.HashSet;
import java.util.Set;

public class BinaryGap {

    public static void main(String[] args) {
        System.out.println(solutionWithFlags(561892));
    }



    public static int solutionWithSet(int N) {
        int maxLength = 0;
        String inputString = Integer.toBinaryString(N);
        int counter = 0;
        Set<Character> numbersAvailable = new HashSet<>();
        for (int  i = 0; i < inputString.length(); i++) {
            if (!numbersAvailable.contains(inputString.charAt(i))) {
                if(inputString.charAt(i) == '0') {
                    counter++;
                    numbersAvailable.add(inputString.charAt(i));
                } else {
                    numbersAvailable.add(inputString.charAt(i));
                }
            }  else {
                if (inputString.charAt(i) == '0') {
                    counter++;
                } else {
                    if (counter > maxLength) {
                        maxLength = counter;
                        counter = 0;
                    } else {
                        counter = 0;
                    }
                }
            }
        }
        return maxLength;
    }

    public static int solutionWithFlags(int N) {
        int maxLength = 0;
        String inputString = Integer.toBinaryString(N);
        int counter = 0;
        boolean has0 = false;
        boolean has1 = false;
        for (int  i = 0; i < inputString.length(); i++) {
            if (!has0 && !has1) {
                if(inputString.charAt(i) == '0') {
                    counter++;
                    has0 = true;
                } else {
                    has1 = true;
                }
            }  else {
                if (inputString.charAt(i) == '0') {
                    counter++;
                } else {
                    if (counter > maxLength) {
                        maxLength = counter;
                        counter = 0;
                    } else {
                        counter = 0;
                    }
                }
            }
        }
        return maxLength;
    }

    public static int bestSolution(int input) {
        String inputString = Integer.toBinaryString(input);
        int counter = 0;
        int maxLength = 0;
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '0') {
                counter++;
            } else {
                if (counter > maxLength) {
                    maxLength = counter;
                }
                counter = 0;
            }
        }
        return maxLength;
    }
}