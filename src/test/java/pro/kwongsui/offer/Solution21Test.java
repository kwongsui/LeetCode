package pro.kwongsui.offer;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution21Test {

    @ParameterizedTest
    @CsvSource({
        "'1,2,3,4', '1,3,4,2'",
        "'1,2,3,4,5', '1,3,5,4,2'",
        "'1', '1'",
        "'2', '2'",
        "'1,2', '1,2'",
        "'1,3', '1,3'",
        "'2,4', '4,2'",
        "'', ''"
    })
    void exchange(@ConvertWith(IntArrayConverter.class) int[] input,
        @ConvertWith(IntArrayConverter.class) int[] expected) {
        assertArrayEquals(expected, new Solution21().exchange(input));
    }
}