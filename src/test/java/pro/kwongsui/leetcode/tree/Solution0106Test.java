package pro.kwongsui.leetcode.tree;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0106Test {

    @ParameterizedTest
    @CsvSource({
        "'9,3,15,20,7', '9,15,7,20,3', '3,9,20,15,7'",
        "'13,15,16,17,18,19,25,27,33,34,50,51,55,58,66', "
            + "'15,13,17,19,27,25,18,16,34,55,51,66,58,50,33', "
            + "'33,16,50,13,18,34,58,15,17,25,51,66,19,27,55'"
    })
    void buildTree(@ConvertWith(IntArrayConverter.class) int[] inorder,
        @ConvertWith(IntArrayConverter.class) int[] postorder,
        @ConvertWith(IntegerArrayConverter.class) Integer[] expected) {
        TreeNode node = new Solution0106().buildTree(inorder, postorder);
        List<Integer> actual = BinaryTree.bfs(node);
        Assertions.assertIterableEquals(Arrays.asList(expected), actual);
    }
}