package pro.kwongsui.leetcode.greedy;

public class Solution0134 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int max = gas[n - 1] - cost[n - 1];
        int idx = n - 1;
        int tank = 0;
        for (int i = n - 1; i >= 0; i--) {
            tank += gas[i] - cost[i];
            if (tank > max) {
                max = tank;
                idx = i;
            }
        }
        return tank >= 0 ? idx : -1;
    }

    public int canCompleteCircuit2(int[] gas, int[] cost) {
        int idx = 0, tank = 0, total = 0;
        for (int i = 0; i < gas.length; i++) {
            tank += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if (tank < 0) {
                idx = i + 1;
                tank = 0;
            }
        }
        return total >= 0 ? idx : -1;
    }

    public int canCompleteCircuit1(int[] gas, int[] cost) {
        int n = gas.length;
        for (int i = 0; i < n; i++) {
            int tank = gas[i] - cost[i];
            int idx = (i + 1) % n;
            while (tank >= 0 && idx != i) {
                tank += gas[idx] - cost[idx];
                idx = (idx + 1) % n;
            }
            if (tank >= 0) {
                return i;
            }
        }
        return -1;
    }
}
