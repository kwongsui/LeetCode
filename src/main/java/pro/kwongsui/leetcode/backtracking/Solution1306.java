package pro.kwongsui.leetcode.backtracking;

import java.util.LinkedList;
import java.util.Queue;

public class Solution1306 {

    public boolean canReach(int[] arr, int start) {
        boolean[] positioned = new boolean[arr.length];
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        while (!queue.isEmpty()) {
            int idx = queue.poll();
            if (arr[idx] == 0) {
                return true;
            }
            if (!positioned[idx]) {
                positioned[idx] = true;
                if (idx + arr[idx] < arr.length) {
                    queue.offer(idx + arr[idx]);
                }
                if (idx - arr[idx] >= 0) {
                    queue.offer(idx - arr[idx]);
                }
            }
        }
        return false;
    }

    public boolean canReach2(int[] arr, int start) {
        if (0 <= start && start < arr.length && arr[start] >= 0) {
            if (arr[start] == 0) {
                return true;
            }
            arr[start] = -arr[start];
            return canReach2(arr, start + arr[start])
                || canReach2(arr, start - arr[start]);
        }
        return false;
    }

    public boolean canReach1(int[] arr, int start) {
        if (arr[start] == 0) {
            return true;
        }
        boolean[] positioned = new boolean[arr.length];
        positioned[start] = true;
        return reach(positioned, arr, start);
    }

    private boolean reach(boolean[] positioned, int[] arr, int idx) {
        if (arr[idx] == 0) {
            return true;
        }

        if (idx + arr[idx] < arr.length && !positioned[idx + arr[idx]]) {
            positioned[idx + arr[idx]] = true;
            if (reach(positioned, arr, idx + arr[idx])) {
                return true;
            }
            positioned[idx + arr[idx]] = false;
        }
        if (idx - arr[idx] >= 0 && !positioned[idx - arr[idx]]) {
            positioned[idx - arr[idx]] = true;
            if (reach(positioned, arr, idx - arr[idx])) {
                return true;
            }
            positioned[idx - arr[idx]] = false;
        }

        return false;
    }
}
