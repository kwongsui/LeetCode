package pro.kwongsui.leetcode.sort;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0153Test {

    @ParameterizedTest
    @CsvSource({
        "'1', 1",
        "'2,1', 1",
        "'1,2', 1",
        "'5,1,3', 1",
        "'5,7,3', 3",
        "'6,7,3,4,5', 3",
        "'5,6,7,3,4', 3",
        "'3,4,5,6,7,0,1,2', 0",
        "'4,5,6,7,0,1,2,3', 0",
        "'5,6,7,0,1,2,3,4', 0",
        "'1,2,3,4,5,6,7,0', 0"
    })
    void findMin(@ConvertWith(IntArrayConverter.class) int[] input, int expected) {
        assertEquals(expected, new Solution0153().findMin(input));
    }
}
