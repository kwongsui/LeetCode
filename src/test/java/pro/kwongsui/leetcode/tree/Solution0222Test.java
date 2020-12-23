package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0222Test {

    @ParameterizedTest
    @CsvSource({
        "'', 0",
        "'1,2', 2",
        "'1,2,3,4,5,6', 6",
        "'1,2,3,4,5,6,7,8,9,10,11,12,13,14,15', 15"
    })
    void countNodes(@ConvertWith(IntegerArrayConverter.class) Integer[] input, int expected) {
        assertEquals(expected, new Solution0222().countNodes(BinaryTree.create(input)));
    }
}