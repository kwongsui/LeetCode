package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.tree.BinaryTree;
import pro.kwongsui.leetcode.tree.Solution0687;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0687Test {

    @ParameterizedTest
    @CsvSource({
        "'5,4,5,1,1,null,5', 2",
        "'5,5,5,1,1,null,5', 3",
        "'1,4,5,4,4,null,5', 2",
        "'1,4,5,2,3,null,6', 0",
        "'1,4,5,4,4,5,5,null,null,null,null,5', 3"
    })
    void longestUniValuePath(
        @ConvertWith(IntegerArrayConverter.class) Integer[] input, int output) {
        assertEquals(output, new Solution0687().longestUniValuePath(BinaryTree.create(input)));
    }
}