package pro.kwongsui.leetcode.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0004Test {

    @ParameterizedTest
    @CsvSource({
        "'1,3', '2', 2.0",
        "'1,2', '3,4', 2.5",
        "'0,0', '0,0', 0.0",
        "'', '1', 1.0",
        "'2', '', 2.0"
    })
    void findMedianSortedArrays(@ConvertWith(IntArrayConverter.class) int[] input1,
        @ConvertWith(IntArrayConverter.class) int[] input2, double expected) {
        assertEquals(expected, new Solution0004().findMedianSortedArrays(input1, input2));
    }
}