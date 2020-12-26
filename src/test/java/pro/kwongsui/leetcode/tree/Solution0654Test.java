package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0654Test {

    @ParameterizedTest
    @CsvSource({
        "'3,2,1,6,0,5', '6,3,5,2,0,1'"
    })
    void constructMaximumBinaryTree(@ConvertWith(IntArrayConverter.class) int[] input,
        @ConvertWith(IntegerArrayConverter.class) Integer[] expected) {
        assertIterableEquals(Arrays.asList(expected),
            BinaryTree.bfs(new Solution0654().constructMaximumBinaryTree(input)));
    }
}