package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.List;

public class Solution1305 {

    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
        List<Integer> l1 = new ArrayList<>(), l2 = new ArrayList<>(), list = new ArrayList<>();
        inorder(root1, l1);
        inorder(root2, l2);

        int i = 0, j = 0;
        while (i < l1.size() && j < l2.size()) {
            if (l1.get(i) <= l2.get(j)){
                list.add(l1.get(i++));
            } else{
                list.add(l2.get(j++));
            }
        }

        while (i < l1.size()) {
            list.add(l1.get(i++));
        }
        while (j < l2.size()) {
            list.add(l2.get(j++));
        }

        return list;
    }

    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}
