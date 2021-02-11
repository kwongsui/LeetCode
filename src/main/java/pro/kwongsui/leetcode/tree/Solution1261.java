package pro.kwongsui.leetcode.tree;

import java.util.HashSet;
import java.util.Set;

public class Solution1261 {

    static class FindElements {

        private final Set<Integer> set;

        public FindElements(TreeNode root) {
            set = new HashSet<>();
            recover(root, 0);
        }

        private void recover(TreeNode node, int val) {
            if (node == null) {
                return;
            }
            node.val = val;
            set.add(val);
            recover(node.left, 2 * val + 1);
            recover(node.right, 2 * val + 2);
        }

        public boolean find(int target) {
            return set.contains(target);
        }
    }
}
