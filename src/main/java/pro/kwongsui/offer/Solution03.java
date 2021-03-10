package pro.kwongsui.offer;

public class Solution03 {

    public int findRepeatNumber(int[] nums) {
        int ans = 0;
        int[] counter = new int[nums.length];
        for(int num : nums) {
            counter[num]++;
            if(counter[num] > 1) {
                return num;
            }
        }
        return ans;
    }
}
