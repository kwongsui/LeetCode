package pro.kwongsui.leetcode.dp;

import java.util.List;

public class Solution0120 {

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] states = new int[n];
        states[0] = triangle.get(0).get(0);
        for(int i = 1; i < n; i++) {
            states[i] = states[i - 1] + triangle.get(i).get(i);
            for(int j = i - 1; j > 0; j--) {
                states[j] = Math.min(states[j - 1], states[j]) + triangle.get(i).get(j);
            }
            states[0] += triangle.get(i).get(0);
        }

        int min = states[0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, states[i]);
        }
        return min;
    }

    public int minimumTotal1(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][] states = new int[n][n];
        states[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            // 第一列的状态只能从上一行第一列的状态转移过来
            states[i][0] = states[i - 1][0] + triangle.get(i).get(0);
            for (int j = 1; j < i; j++) {
                states[i][j] =
                    Math.min(states[i - 1][j - 1], states[i - 1][j]) + triangle.get(i).get(j);
            }
            // 最后一列的状态只能从上一行最后一列的状态转移过来
            states[i][i] = states[i - 1][i - 1] + triangle.get(i).get(i);
        }

        int min = states[n - 1][0];
        for (int i = 1; i < n; i++) {
            min = Math.min(min, states[n - 1][i]);
        }
        return min;
    }
}
