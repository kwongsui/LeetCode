package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0230Test {

    @ParameterizedTest
    @CsvSource({
        "'1', 1, 1",
        "'3,1,4,null,2', 1, 1",
        "'3,1,4,null,2', 4, 4",
        "'5,3,6,2,4,null,null,1', 3, 3"
    })
    void kthSmallest(
        @ConvertWith(IntegerArrayConverter.class) Integer[] input, int k, int expected) {
        assertEquals(expected, new Solution0230().kthSmallest(BinaryTree.create(input), k));
    }
}