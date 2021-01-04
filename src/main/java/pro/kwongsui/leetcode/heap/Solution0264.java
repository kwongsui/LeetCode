package pro.kwongsui.leetcode.heap;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Solution0264 {

    public int nthUglyNumber(int n) {
        PriorityQueue<Long> heap = new PriorityQueue<>();
        Set<Long> set = new HashSet<>();
        heap.offer((long) 1);
        set.add((long) 1);
        long nth = 0L;
        while (n-- != 0) {
            if (!heap.isEmpty()) {
                nth = heap.poll();
            }
            if (set.add(nth * 2)) {
                heap.offer(nth * 2);
            }
            if (set.add(nth * 3)) {
                heap.offer(nth * 3);
            }
            if (set.add(nth * 5)) {
                heap.offer(nth * 5);
            }
        }
        return Math.toIntExact(nth);
    }
}
