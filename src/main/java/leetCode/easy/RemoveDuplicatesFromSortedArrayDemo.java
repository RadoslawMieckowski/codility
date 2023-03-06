package leetCode.easy;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayDemo {
    public static void main(String[] args) {
        int table[] = {1, 1, 2};
        System.out.println(removeDuplicates(table));
    }
    public static int removeDuplicates(int[] nums) {    // to chyba złe rozwiązanie, ale nie wiem, dlaczego
        // return (int) Arrays.stream(nums).distinct().count();
        int j = 0;
        int uniqueVal = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != uniqueVal) {
                nums[j] = uniqueVal;
                j++;
                uniqueVal = nums[i];
            }
        }
        nums[j] = uniqueVal;
        System.out.println(Arrays.toString(nums));
        return j;
    }
}
