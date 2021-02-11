package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution1372Test {

    @ParameterizedTest
    @CsvSource({
        "'1,null,1,1,1,null,null,1,1,null,1,null,null,null,1,null,1', 3",
        "'1,1,1,null,1,null,null,1,1,null,1', 4",
        "'1', 0",
        "'', 0"
    })
    void longestZigZag(@ConvertWith(IntegerArrayConverter.class) Integer[] input, int expected) {
        assertEquals(expected, new Solution1372().longestZigZag(BinaryTree.create(input)));
    }
}