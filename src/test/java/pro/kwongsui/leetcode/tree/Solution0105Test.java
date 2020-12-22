package pro.kwongsui.leetcode.tree;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0105Test {

    @ParameterizedTest
    @CsvSource({
        "'3,9,20,15,7', '9,3,15,20,7', '3,9,20,15,7'",
        "'1,2,4,8,9,5,3,6,7', '8,4,9,2,5,1,6,3,7', '1,2,3,4,5,6,7,8,9'",
        "'33,16,13,15,18,17,25,19,27,50,34,58,51,55,66',"
            + "'13,15,16,17,18,19,25,27,33,34,50,51,55,58,66', "
            + "'33,16,50,13,18,34,58,15,17,25,51,66,19,27,55'"
    })
    void buildTree(@ConvertWith(IntArrayConverter.class) int[] preorder,
        @ConvertWith(IntArrayConverter.class) int[] inorder,
        @ConvertWith(IntegerArrayConverter.class) Integer[] expected) {
        TreeNode node = new Solution0105().buildTree(preorder, inorder);
        List<Integer> actual = BinaryTree.bfs(node);
        Assertions.assertIterableEquals(Arrays.asList(expected), actual);
    }
}