package pro.kwongsui.leetcode.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0300Test {

    @ParameterizedTest
    @CsvSource({
        "'0,3,1,6,2,2', 3",
        "'0,1,0,3,2,3', 4"
    })
    void lengthOfLIS(@ConvertWith(IntArrayConverter.class) int[] input, int expected) {
        assertEquals(expected, new Solution0300().lengthOfLIS(input));
    }
}