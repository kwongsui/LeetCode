package pro.kwongsui.leetcode.tree;

public class Solution0117 {

    public TreeNode connect(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode sentinel = new TreeNode(-1);
        sentinel.next = root;
        while (sentinel.next != null) {
            TreeNode p = sentinel.next;
            TreeNode q = sentinel;
            sentinel.next = null;
            while (p != null) {
                if (p.left != null) {
                    q.next = p.left;
                    q = q.next;
                }
                if (p.right != null) {
                    q.next = p.right;
                    q = q.next;
                }
                p = p.next;
            }
        }
        return root;
    }

    public TreeNode connect1(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode p = next(root);
        if (root.left != null && root.right != null) {
            root.left.next = root.right;
            root.right.next = p;
        } else if (root.left != null) {
            root.left.next = p;
        } else if (root.right != null) {
            root.right.next = p;
        }
        connect1(root.right);
        connect1(root.left);
        return root;
    }

    private TreeNode next(TreeNode root) {
        TreeNode p = root.next;
        while (p != null) {
            if (p.left != null || p.right != null) {
                break;
            }
            p = p.next;
        }
        return p != null ? (p.left != null ? p.left : p.right) : null;
    }
}
