package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0114Test {

    @ParameterizedTest
    @CsvSource({
        "'1', '1'",
        "'1,2', '1,2'",
        "'1,2,5,3,4,null,6', '1,2,3,4,5,6'",
        "'1,null,2,null,3,null,4,null,5,null,6', '1,2,3,4,5,6'",
        "'1,2,5,3,4,null,6,null,null,null,null,7,8', '1,2,3,4,5,6,7,8'"
    })
    void flatten(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        @ConvertWith(IntegerArrayConverter.class) Integer[] expected) {
        TreeNode node = BinaryTree.create(input);
        new Solution0114().flatten(node);
        List<Integer> actual = BinaryTree.bfs(node);
        assertIterableEquals(Arrays.asList(expected), actual);
    }
}