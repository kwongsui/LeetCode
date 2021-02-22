package pro.kwongsui.leetcode.array;

public class Solution0048 {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int level = 0;
        while (n - level * 2 > 1) {
            int step = n - level * 2 - 1;
            while (step-- != 0) {
                int rightUp = matrix[level][n - level - 1];
                int rightDown = matrix[n - level - 1][n - level - 1];
                int leftDown = matrix[n - level - 1][level];
                for (int i = n - level - 1; i >= 1 + level; i--) {
                    matrix[level][i] = matrix[level][i - 1];
                }
                for (int i = n - level - 1; i >= 1 + level; i--) {
                    if (i - 1 == level) {
                        matrix[i][n - level - 1] = rightUp;
                    } else {
                        matrix[i][n - level - 1] = matrix[i - 1][n - level - 1];
                    }
                }
                for (int i = level; i < n - level - 1; i++) {
                    if (i == n - level - 2) {
                        matrix[n - level - 1][i] = rightDown;
                    } else {
                        matrix[n - level - 1][i] = matrix[n - level - 1][i + 1];
                    }
                }
                for (int i = level; i < n - level - 1; i++) {
                    if (i == n - level - 2) {
                        matrix[i][level] = leftDown;
                    } else {
                        matrix[i][level] = matrix[i + 1][level];
                    }
                }
            }
            level++;
        }
    }
}
