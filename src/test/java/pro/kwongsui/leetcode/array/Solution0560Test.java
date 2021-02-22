package pro.kwongsui.leetcode.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0560Test {

    @ParameterizedTest
    @CsvSource({
        "'1,1,1', 2, 2",
        "'1,2,3', 3, 2",
        "'0,0,1,-1,0', 0, 10",
        "'3,4,3,8', 7, 2"
    })
    void subArraySum(@ConvertWith(IntArrayConverter.class) int[] input, int k, int expected) {
        assertEquals(expected, new Solution0560().subArraySum(input, k));
    }
}