package pro.kwongsui.leetcode.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0238Test {

    @ParameterizedTest
    @CsvSource({
        "'1,2,3,4', '24,12,8,6'",
        "'5,6,2,3', '36,30,90,60'"
    })
    void productExceptSelf(@ConvertWith(IntArrayConverter.class) int[] input,
        @ConvertWith(IntArrayConverter.class) int[] expected) {
        assertArrayEquals(expected, new Solution0238().productExceptSelf(input));
    }
}