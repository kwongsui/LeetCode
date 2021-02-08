package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class Solution0971 {

    private int idx = 0;

    public List<Integer> flipMatchVoyage(TreeNode root, int[] voyage) {
        List<Integer> list = new ArrayList<>();
        doFlipMatch(root, voyage, list);
        if (list.size() != 0 && list.get(0) == -1) {
            list.clear();
            list.add(-1);
        }
        return list;
    }

    private void doFlipMatch(TreeNode root, int[] voyage, List<Integer> list) {
        if (idx >= voyage.length) {
            return;
        }
        if (root == null) {
            return;
        }
        if (root.val != voyage[idx++]) {
            list.clear();
            list.add(-1);
            return;
        }
        if (root.left != null && root.left.val != voyage[idx]) {
            list.add(root.val);
            doFlipMatch(root.right, voyage, list);
            doFlipMatch(root.left, voyage, list);
        } else {
            doFlipMatch(root.left, voyage, list);
            doFlipMatch(root.right, voyage, list);
        }
    }
}
