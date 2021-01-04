package pro.kwongsui.leetcode.heap;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Solution0313 {

    public int nthSuperUglyNumber(int n, int[] primes) {
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(e -> e[0]));
        for (int prime : primes) {
            queue.offer(new int[]{prime, prime, 0});
        }

        int[] uglies = new int[n + 1];
        uglies[0] = 1;

        int i = 1;
        while (i < n) {
            if (!queue.isEmpty()) {
                int[] ugly = queue.poll();
                int num = ugly[0], prime = ugly[1], index = ugly[2];
                if (num != uglies[i - 1]) {
                    uglies[i] = num;
                    i++;
                }
                queue.offer(new int[]{prime * uglies[index + 1], prime, index + 1});
            }
        }
        return uglies[n - 1];
    }

    public int nthSuperUglyNumber1(int n, int[] primes) {
        PriorityQueue<Long> heap = new PriorityQueue<>();
        Set<Long> set = new HashSet<>();
        heap.offer((long) 1);
        set.add((long) 1);
        long nth = 0L;
        while (n-- != 0) {
            if (!heap.isEmpty()) {
                nth = heap.poll();
            }
            for (int prime : primes) {
                if (set.add(nth * prime)) {
                    heap.offer(nth * prime);
                }
            }
        }
        return Math.toIntExact(nth);
    }
}
