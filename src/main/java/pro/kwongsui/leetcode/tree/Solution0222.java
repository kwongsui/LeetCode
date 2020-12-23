package pro.kwongsui.leetcode.tree;

public class Solution0222 {

    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = height(root.left);
        int r = height(root.right);
        if (l == r) {
            return (1 << (l + 1)) + countNodes(root.right);
        }
        return (1 << (r + 1)) + countNodes(root.left);
    }

    private int height(TreeNode node) {
        if (node == null) {
            return -1;
        }
        return height(node.left) + 1; // 完全二叉树的左子树比右子树高或者一样高
    }

    public int countNodes2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int level = 0;
        TreeNode p = root;
        while (p.left != null) {
            level++;
            p = p.left;
        }
        int low = 1 << level, high = (1 << (level + 1)) - 1; // 1 << level 等同于 2 ^ level
        while (low < high) { // 二分查找位于上下边界内的未知值
            int mid = low + (high - low + 1) / 2;
            if (exists(root, level, mid)) {
                low = mid;
            } else {
                high = mid - 1;
            }
        }
        return low;
    }

    /**
     * 二进制模拟树，根节点为1，0为移动到左子节点，左子节点为10，1为移动到右子节点，右子节点为11，依此类推
     */
    private boolean exists(TreeNode node, int level, int k) {
        int bits = 1 << (level - 1); // bits 长度表示到达 level 层节点需要移动的次数
        TreeNode p = node;
        while (p != null && bits > 0) {
            if ((bits & k) == 0) { // k 携带到达 level 层的移动信息，bits 中1与 k 按位与操作判断如何移动
                p = p.left;
            } else {
                p = p.right;
            }
            bits >>= 1; // bits 中1右移用于判断下一次如何移动
        }
        return p != null;
    }

    public int countNodes1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = countNodes(root.left);
        int r = countNodes(root.right);
        return l + r + 1;
    }
}
