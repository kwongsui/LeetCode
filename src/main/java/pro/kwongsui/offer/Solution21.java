package pro.kwongsui.offer;

public class Solution21 {

    public int[] exchange(int[] nums) {
        if (nums == null || nums.length == 0) {
            return nums;
        }
        int[] res = new int[nums.length];
        int odd = 0, even = res.length - 1;
        for (int num : nums) {
            if (num % 2 == 0) {
                res[even--] = num;
            } else {
                res[odd++] = num;
            }
        }
        return res;
    }
}
