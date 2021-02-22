package pro.kwongsui.leetcode.stack;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0739Test {

    @ParameterizedTest
    @CsvSource({
        "'73,74,75,71,69,72,76,73','1,1,4,2,1,1,0,0'"
    })
    void dailyTemperatures(@ConvertWith(IntArrayConverter.class) int[] input,
        @ConvertWith(IntArrayConverter.class) int[] expected) {
        assertArrayEquals(expected, new Solution0739().dailyTemperatures(input));
    }
}