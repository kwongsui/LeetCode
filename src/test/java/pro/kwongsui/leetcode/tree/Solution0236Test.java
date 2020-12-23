package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0236Test {

    @ParameterizedTest
    @CsvSource({
        "'3,5,1,6,2,0,8,null,null,7,4', 5, 1, 3",
        "'3,5,1,6,2,0,8,null,null,7,4', 5, 4, 5"
    })
    void lowestCommonAncestor(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        int val1, int val2, int expected) {
        TreeNode root = BinaryTree.create(input);
        assert root != null;
        TreeNode p = get(root, val1);
        TreeNode q = get(root, val2);
        assertEquals(expected, new Solution0236().lowestCommonAncestor(root, p, q).val);
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
}