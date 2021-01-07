package pro.kwongsui.leetcode.dc;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Solution0973 {

    public int[][] kClosest(int[][] points, int K) {
        quick(points, 0, points.length - 1, K);
        return Arrays.copyOfRange(points, 0, K);
    }

    private void quick(int[][] points, int lower, int upper, int k) {
        if (lower >= upper) {
            return;
        }
        int pivot = partition(points, lower, upper);
        if (k < pivot - lower + 1) {
            quick(points, lower, pivot - 1, k);
        } else if (k > pivot - lower + 1) {
            quick(points, pivot + 1, upper, k - pivot + lower - 1);
        }
    }

    private int partition(int[][] points, int lower, int upper) {
        int pivot = ThreadLocalRandom.current().nextInt(lower, upper);
        swap(points, pivot, upper);
        int i = lower;
        for (int j = i; j < upper; j++) {
            if (dist(points, j) < dist(points, upper) && i++ != j) {
                swap(points, i - 1, j);
            }
        }
        swap(points, i, upper);
        return i;
    }

    private int dist(int[][] points, int k) {
        return points[k][0] * points[k][0] + points[k][1] * points[k][1];
    }

    private void swap(int[][] points, int i, int j) {
        int t0 = points[i][0], t1 = points[i][1];
        points[i][0] = points[j][0];
        points[i][1] = points[j][1];
        points[j][0] = t0;
        points[j][1] = t1;
    }
}
