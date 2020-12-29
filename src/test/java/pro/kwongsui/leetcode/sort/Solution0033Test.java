package pro.kwongsui.leetcode.sort;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0033Test {

    @ParameterizedTest
    @CsvSource({
        "'', 0, -1",
        "'1', 0, -1",
        "'1', 1, 0",
        "'2,1', 0, -1",
        "'2,1', 1, 1",
        "'1,3', 3, 1",
        "'5,1,3', 1, 1",
        "'5,7,3', 7, 1",
        "'5,7,3', 3, 2",
        "'6,7,3,4,5', 5, 4",
        "'5,6,7,3,4', 5, 0",
        "'5,7,3', 5, 0",
        "'4,5,6,7,0,1,2,3', 0, 4",
        "'3,4,5,6,7,0,1,2', 0, 5",
        "'4,5,6,7,0,1,2', 0, 4",
        "'4,5,6,7,0,1,2', 3, -1"
    })
    void search(@ConvertWith(IntArrayConverter.class) int[] input, int target, int expected) {
        assertEquals(expected, new Solution0033().search(input, target));
    }
}