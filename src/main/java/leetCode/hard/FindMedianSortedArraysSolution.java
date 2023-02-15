package leetCode.hard;

import java.util.Arrays;

class FindMedianSortedArraysSolution {
    public static void main(String[] args) {
        int tab1[] = {1, 3};
        int tab2[] = {2};
        findMedianSortedArrays(tab1, tab2);
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int pointer1 = 0;
        int pointer2 = 0;
        int size = nums1.length + nums2.length;
        int mergedTable[] = new int[size];
        int medianIndex = 0;
        int medianIndexEven = 0;
        int medianIndexOdd = 0;
        int index = 0;
        while(index < size) {
            if (nums1[pointer1] < nums2[pointer2]) {
                mergedTable[index] = nums1[pointer1];
                pointer1++;
                index++;
                if (pointer1 == nums1.length) {
                    for (int i = pointer2; i < nums2.length; i++) {
                        mergedTable[index] = nums2[pointer2];
                        pointer2++;
                        index++;
                    }
                }
            } else {
                mergedTable[index] = nums2[pointer2];
                pointer2++;
                index++;
                if (pointer2 == nums2.length) {
                    for (int i = pointer1; i < nums1.length; i++) {
                        mergedTable[index] = nums1[pointer1];
                        pointer1++;
                        index++;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(mergedTable));
        if (size % 2 != 0) {
            medianIndex = size / 2;
            return mergedTable[medianIndex];
        }
        medianIndexEven = size / 2;
        medianIndexOdd = size / 2 - 1;
        double result = (mergedTable[medianIndexEven] + mergedTable[medianIndexOdd]) / 2.0;
        return result;
    }
}
