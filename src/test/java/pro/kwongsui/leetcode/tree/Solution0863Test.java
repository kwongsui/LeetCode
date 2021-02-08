package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0863Test {

    @ParameterizedTest
    @CsvSource({
        "'3,5,1,6,2,0,8,null,null,7,4', 5, 2, '1,7,4'"
    })
    void distanceK(@ConvertWith(IntegerArrayConverter.class) Integer[] input, int target, int k,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        TreeNode node = BinaryTree.create(input);
        assertIterableEquals(Arrays.asList(output),
            new Solution0863().distanceK(node, search(node, target), 2));
    }

    private TreeNode search(TreeNode node, int val) {
        if (node == null) {
            return null;
        }
        if (node.val == val) {
            return node;
        }
        TreeNode treeNode = search(node.left, val);
        return treeNode == null ? search(node.right, val) : treeNode;
    }
}