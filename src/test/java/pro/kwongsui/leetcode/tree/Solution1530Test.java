package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution1530Test {

    @ParameterizedTest
    @CsvSource({
        "'1,2,3,null,4', 3, 1",
        "'1,2,3,4,5,6,7', 3, 2",
        "'7,1,4,6,null,5,3,null,null,null,null,null,2', 3, 1",
        "'100', 1, 0",
        "'1,1,1', 2, 1"
    })
    void countPairs(@ConvertWith(IntegerArrayConverter.class) Integer[] input, int distance,
        int expected) {
        assertEquals(expected, new Solution1530().countPairs(BinaryTree.create(input), distance));
    }
}