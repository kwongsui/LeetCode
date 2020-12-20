package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pro.kwongsui.leetcode.tree.TreeNode;

public class Solution0894 {

    public List<TreeNode> allPossibleFBT(int N) {
        if (N % 2 == 0) {
            return new ArrayList<>();
        }
        return doBFT(N, new HashMap<>());
    }

    private List<TreeNode> doBFT(int n, Map<Integer, List<TreeNode>> map) {
        List<TreeNode> list = map.getOrDefault(n, new ArrayList<>());
        if (!list.isEmpty()) {
            return list;
        }
        if (n == 1) {
            list.add(new TreeNode(0));
        }
        for (int i = 1; i < n - 1; i += 2) {
            List<TreeNode> left = doBFT(i, map);
            List<TreeNode> right = doBFT(n - i - 1, map);
            for (TreeNode l : left) {
                for (TreeNode r : right) {
                    TreeNode root = new TreeNode(0);
                    root.left = l;
                    root.right = r;
                    list.add(root);
                }
            }
        }
        map.put(n, list);
        return list;
    }
}
