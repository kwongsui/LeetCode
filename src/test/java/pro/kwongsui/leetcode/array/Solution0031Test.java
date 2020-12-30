package pro.kwongsui.leetcode.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0031Test {

    @ParameterizedTest
    @CsvSource({
        "'1','1'",
        "'1,1', '1,1'",
        "'1,2', '2,1'",
        "'2,1', '1,2'",
        "'1,1,5','1,5,1'",
        "'1,2,3', '1,3,2'",
        "'1,3,2', '2,1,3'",
        "'3,2,1', '1,2,3'",
        "'2,3,1', '3,1,2'",
        "'1,2,3,4', '1,2,4,3'",
        "'2,5,4,3,1', '3,1,2,4,5'",
        "'2,1,5,4,3,2', '2,2,1,3,4,5'",
        "'3,2,5,4,2,1', '3,4,1,2,2,5'"
    })
    void nextPermutation(
        @ConvertWith(IntArrayConverter.class) int[] input,
        @ConvertWith(IntArrayConverter.class) int[] expected) {
        new Solution0031().nextPermutation(input);
        assertArrayEquals(expected, input);
    }

    @ParameterizedTest
    @CsvSource({
        "'1,2,3,4', '4,3,2,1'",
        "'1,2,3,4,5', '5,4,3,2,1'"
    })
    void reverse(
        @ConvertWith(IntArrayConverter.class) int[] input,
        @ConvertWith(IntArrayConverter.class) int[] output) {
        new Solution0031().reverse(input, 0, input.length - 1);
        assertArrayEquals(output, input);
    }
}