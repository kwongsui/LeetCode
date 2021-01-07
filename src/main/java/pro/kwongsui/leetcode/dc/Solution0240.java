package pro.kwongsui.leetcode.dc;

public class Solution0240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int m = matrix.length, n = matrix[0].length;
        int row = 0, col = n - 1;
        while (row < m && col >= 0) {
            if (matrix[row][col] < target) {
                row++;
            } else if (matrix[row][col] > target) {
                col--;
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean searchMatrix3(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        return search(matrix, target,
            0, matrix[0].length - 1, 0, matrix.length - 1);
    }

    private boolean search(int[][] matrix, int target, int left, int right, int up, int down) {
        if (left > right || up > down) {
            return false;
        } else if (target < matrix[up][left] || target > matrix[down][right]) {
            return false;
        }
        int mid = left + (right - left) / 2;
        int lower = up, upper = down, pivot = up;
        if (matrix[down][mid] < target) {
            pivot = down + 1; // 考虑一列所有值都小于目标值的情况
        } else {
            /*
             * 查找一列中第一个大于目标值的值
             */
            while (lower <= upper) {
                int half = lower + (upper - lower) / 2;
                if (matrix[half][mid] < target) {
                    lower = half + 1;
                } else {
                    if (matrix[half][mid] == target) {
                        return true;
                    } else if (half == 0 || matrix[half - 1][mid] < target) {
                        pivot = half;
                        break;
                    } else {
                        upper = half - 1;
                    }
                }
            }
        }
        return search(matrix, target, left, mid - 1, pivot, down)
            || search(matrix, target, mid + 1, right, up, pivot - 1);
    }

    public boolean searchMatrix2(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int min = Math.min(matrix.length, matrix[0].length);
        for (int i = 0; i < min; i++) {
            boolean row = search(matrix, target, i, true);
            boolean col = search(matrix, target, i, false);
            if (row || col) {
                return true;
            }
        }
        return false;
    }

    private boolean search(int[][] matrix, int target, int start, boolean row) {
        int lower = start, upper = row ? matrix[0].length - 1 : matrix.length - 1;
        while (lower <= upper) {
            int mid = lower + (upper - lower) / 2;
            if (row) {
                if (matrix[start][mid] == target) {
                    return true;
                } else if (matrix[start][mid] < target) {
                    lower = mid + 1;
                } else {
                    upper = mid - 1;
                }
            } else {
                if (matrix[mid][start] == target) {
                    return true;
                } else if (matrix[mid][start] < target) {
                    lower = mid + 1;
                } else {
                    upper = mid - 1;
                }
            }
        }
        return false;
    }

    public boolean searchMatrix1(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        if (matrix.length > matrix[0].length) {
            for (int col = 0; col < matrix[0].length; col++) {
                int lower = 0, upper = matrix.length - 1;
                while (lower <= upper) {
                    int mid = lower + (upper - lower) / 2;
                    if (matrix[mid][col] == target) {
                        return true;
                    } else if (matrix[mid][col] < target) {
                        lower = mid + 1;
                    } else {
                        upper = mid - 1;
                    }
                }
            }
        } else {
            for (int[] row : matrix) {
                int lower = 0, upper = row.length - 1;
                while (lower <= upper) {
                    int mid = lower + (upper - lower) / 2;
                    if (row[mid] == target) {
                        return true;
                    } else if (row[mid] < target) {
                        lower = mid + 1;
                    } else {
                        upper = mid - 1;
                    }
                }
            }
        }
        return false;
    }
}
