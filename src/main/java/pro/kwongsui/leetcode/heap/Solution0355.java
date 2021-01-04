package pro.kwongsui.leetcode.heap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Solution0355 {

    static class Twitter {

        final static int FEED_NUM = 10;
        Map<Integer, List<Tweet>> tweets;
        Map<Integer, Set<Integer>> followees;
        int timestamp;

        public Twitter() {
            timestamp = 0;
            tweets = new HashMap<>();
            followees = new HashMap<>();
        }

        public void postTweet(int userId, int tweetId) {
            if (!tweets.containsKey(userId)) {
                tweets.put(userId, new LinkedList<>());
            }
            tweets.get(userId).add(0, new Tweet(tweetId, timestamp++));
        }

        public List<Integer> getNewsFeed(int userId) {
            Queue<Tweet> heap = new PriorityQueue<>(FEED_NUM, Comparator.comparingInt(e -> e.time));
            getNewsFeed(heap, userId);
            Set<Integer> followees = this.followees.get(userId);
            if (followees != null && followees.size() != 0) {
                for (int fid : followees) {
                    getNewsFeed(heap, fid);
                }
            }
            List<Integer> list = new LinkedList<>();
            while (!heap.isEmpty()) {
                list.add(0, heap.poll().id);
            }
            return list;
        }

        private void getNewsFeed(Queue<Tweet> heap, int fid) {
            List<Tweet> l = tweets.get(fid);
            if (l != null && l.size() != 0) {
                for (Tweet t : l) {
                    if (heap.size() == FEED_NUM) {
                        if (t.time > heap.peek().time) {
                            heap.poll();
                            heap.offer(t);
                        } else {
                            break;
                        }
                    } else {
                        heap.offer(t);
                    }
                }
            }
        }

        public void follow(int followerId, int followeeId) {
            if (followeeId == followerId) {
                return;
            }
            if (!followees.containsKey(followerId)) {
                followees.put(followerId, new HashSet<>());
            }
            followees.get(followerId).add(followeeId);
        }

        public void unfollow(int followerId, int followeeId) {
            if (!followees.containsKey(followerId)) {
                return;
            }
            followees.get(followerId).remove(followeeId);
        }

        private static class Tweet {

            int id;
            int time;

            Tweet(int _id, int _time) {
                id = _id;
                time = _time;
            }
        }
    }
}
