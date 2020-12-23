package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0337Test {

    @ParameterizedTest
    @CsvSource({
        "'3,2,3,null,3,null,1', 7",
        "'3,4,5,1,3,null,1', 9",
        "'3,6,5,2,4,null,1', 11",
        "'4,1,null,2,null,3', 7"
    })
    void rob(@ConvertWith(IntegerArrayConverter.class) Integer[] input, int expected) {
        assertEquals(expected, new Solution0337().rob(BinaryTree.create(input)));
    }
}