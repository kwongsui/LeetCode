package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution1379Test {

    @ParameterizedTest
    @CsvSource({
        "'7,4,3,null,null,6,19', 3, 3",
        "'7', 7, 7",
        "'8,null,6,null,5,null,4,null,3,null,2,null,1', 4, 4",
        "'1,2,3,4,5,6,7,8,9,10', 5, 5",
        "'1,2,null,3', 2, 2"
    })
    void getTargetCopy(@ConvertWith(IntegerArrayConverter.class) Integer[] input, int val,
        int expected) {
        TreeNode original = BinaryTree.create(input);
        TreeNode cloned = clone(original);
        TreeNode target = get(original, val);
        TreeNode actual = new Solution1379().getTargetCopy(original, cloned, target);
        if (actual != null) {
            assertEquals(expected, actual.val);
        }
    }

    private TreeNode get(TreeNode node, int val) {
        if (node == null) {
            return null;
        }
        if (node.val == val) {
            return node;
        }
        TreeNode l = get(node.left, val);
        if (l != null) {
            return l;
        }
        return get(node.right, val);
    }

    private TreeNode clone(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode l = clone(root.left);
        TreeNode r = clone(root.right);
        TreeNode node = new TreeNode(root.val);
        node.left = l;
        node.right = r;
        return node;
    }
}