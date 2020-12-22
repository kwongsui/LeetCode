package pro.kwongsui.leetcode.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import pro.kwongsui.leetcode.tree.TreeNode;

public class Solution0145 {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) {
            return list;
        }
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode p = root;
        while(p != null || !stack.isEmpty()) {
            while(p != null) {
                if(p.right != null) {
                    stack.push(p.right);
                }
                stack.push(p);
                p = p.left;
            }
            p = stack.pop();
            if(!stack.isEmpty() && stack.peek() == p.right) {
                stack.pop();
                stack.push(p);
                p = p.right;
            } else {
                list.add(p.val);
                p = null;
            }
        }
        return list;
    }
}
