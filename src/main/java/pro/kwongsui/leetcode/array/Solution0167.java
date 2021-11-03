package pro.kwongsui.leetcode.array;

import java.util.Arrays;

public class Solution0167 {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }

    public int[] twoSum2(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int idx = Arrays.binarySearch(numbers, i + 1, numbers.length, target - numbers[i]);
            if (idx >= 0) {
                return new int[]{i + 1, idx + 1};
            }
        }
        return new int[0];
    }
}
