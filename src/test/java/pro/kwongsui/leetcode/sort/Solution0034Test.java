package pro.kwongsui.leetcode.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0034Test {

    @ParameterizedTest
    @CsvSource({
        "'5,7,7,8,8,10', 8, '3,4'",
        "'5,7,7,8,8,10', 6, '-1,-1'",
        "'', 0, '-1,-1'",
        "'5', 5, '0,0'",
        "'1', 0, '-1,-1'",
        "'1,1', 1, '0,1'",
        "'1,1', 2, '-1,-1'"
    })
    void searchRange(@ConvertWith(IntArrayConverter.class) int[] input, int target,
        @ConvertWith(IntArrayConverter.class) int[] expected) {
        assertArrayEquals(expected, new Solution0034().searchRange(input, target));
    }
}