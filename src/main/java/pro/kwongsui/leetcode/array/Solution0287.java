package pro.kwongsui.leetcode.array;

public class Solution0287 {

    public int findDuplicate(int[] nums) {
        int lower = 1, upper = nums.length - 1;
        while (lower < upper) {
            int mid = lower + (upper - lower) / 2;
            int cnt = 0;
            for(int num : nums) {
                if(num <= mid) {
                    cnt++;
                }
            }
            if(cnt > mid) {
                upper = mid;
            } else {
                lower = mid + 1;
            }
        }
        return upper;
    }

    public int findDuplicate1(int[] nums) {
        int[] counter = new int[nums.length];
        for (int num : nums) {
            counter[num]++;
            if (counter[num] > 1) {
                return num;
            }
        }
        return -1;
    }
}
