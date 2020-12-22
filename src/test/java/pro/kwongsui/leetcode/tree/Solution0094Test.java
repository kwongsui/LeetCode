package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.tree.BinaryTree;
import pro.kwongsui.leetcode.tree.Solution0094;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0094Test {

    @ParameterizedTest
    @CsvSource({
        "'', ''",
        "'1', '1'",
        "'1,null,2,3', '1,3,2'",
        "'1,2,3,null,null,4,5', '2,1,4,3,5'"
    })
    void inorderTraversal(
        @ConvertWith(IntegerArrayConverter.class) Integer[] input,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        assertIterableEquals(Arrays.asList(output),
            new Solution0094().inorderTraversal(BinaryTree.create(input)));
    }
}