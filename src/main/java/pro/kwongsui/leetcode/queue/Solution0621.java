package pro.kwongsui.leetcode.queue;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution0621 {

    /**
     * 相同任务之间必须间隔 n 个单位时间。
     * 贪心算法：求得最少 idle 时间的个数。
     * 1. 最多执行次数的任务次数是 m 次，有 cnt 种需执行 m 次的不同类型任务。
     * 2. 由 cnt 个不同类型任务组成的任务序列，共 m 个
     * 3. m 个序列之间有 m - 1 个长度为 n 的区间，需由 idle 和其他不属于这 cnt 种任务类型的任务填充
     *    3.1 假定填充的都是 idle 个单位时间，若需执行次数最多的任务数只有1个，总的 idle 时间个数：
     *     (m - 1) * (n - 1)，有 cnt 个，则总的 idle 时间个数： (m - 1) * (n - (cnt - 1))
     *    3.2 其他不属于 cnt 种任务类型的任务数：tasks.length - m * cnt
     *    3.3 则实际需要填充的 idle 时间个数：(m - 1) * (n - (cnt - 1)) - (tasks.length - m * cnt)
     *    3.4 若 n < cnt - 1，idle 时间个数小于0，此时区间长度实际为0，idle 为0。
     * 4. 总的执行时间：idle 个单位时间 + 任务总数
     */
    public int leastInterval(char[] tasks, int n) {
        if (tasks.length <= 1 || n == 0) {
            return tasks.length;
        }

        int[] counter = new int['Z' - 'A' + 1];
        int m = 0, cnt = 0;
        for (char task : tasks) {
            counter[task - 'A']++;
            if (m == counter[task - 'A']) {
                cnt++;
            } else if (counter[task - 'A'] > m) {
                m = counter[task - 'A'];
                cnt = 1;
            }
        }

        int partCount = m - 1;
        int partLength = n - (cnt - 1);
        int emptySlots = partCount * partLength;
        int availableTasks = tasks.length - m * cnt;
        int idles = Math.max(0, emptySlots - availableTasks);
        return tasks.length + idles;
    }

    public int leastInterval1(char[] tasks, int n) {
        if (tasks.length <= 1 || n == 0) {
            return tasks.length;
        }

        Map<Character, Task> map = new HashMap<>();
        for (char t : tasks) {
            map.putIfAbsent(t, new Task(t, 0));
            map.get(t).freq++;
        }
        PriorityQueue<Task> priorityQueue = new PriorityQueue<>((t1, t2) -> t2.freq - t1.freq);
        priorityQueue.addAll(map.values());  // 任务次数多优先级高，待执行任务队列

        int number = 0;
        Queue<Task> queue = new LinkedList<>();  // 冷却中任务队列

        while (!priorityQueue.isEmpty() || !queue.isEmpty()) {
            // 优先执行需执行次数最多的任务
            Task t = priorityQueue.poll();
            Objects.requireNonNull(t).last = number++;
            t.freq--;
            // 任务仍需执行，进入冷却中任务队列
            if (t.freq != 0) {
                queue.offer(t);
            }
            // 若没有任务可执行，进入冷却状态，直到第一个冷却状态的任务解冻继续执行
            if (priorityQueue.isEmpty() && !queue.isEmpty()) {
                number = queue.peek().last + n + 1;
            }
            // 冷却状态的任务解冻后进入待执行任务队列
            while (!queue.isEmpty() && number > queue.peek().last + n) {
                priorityQueue.offer(queue.poll());
            }
        }

        return number;
    }

    static class Task {

        char name;
        int freq, last = -1;

        Task(char name, int freq) {
            this.name = name;
            this.freq = freq;
        }
    }
}