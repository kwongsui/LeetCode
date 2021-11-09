package pro.kwongsui.leetcode.dp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0416Test {

    @ParameterizedTest
    @CsvSource({
        "'1,5,11,5', true",
        "'1,2,3,5', false",
        "'3,4,7,10,2,5,9,8', true"
    })
    void canPartition(@ConvertWith(IntArrayConverter.class) int[] input, boolean expected) {
        assertEquals(expected, new Solution0416().canPartition(input));
    }
}