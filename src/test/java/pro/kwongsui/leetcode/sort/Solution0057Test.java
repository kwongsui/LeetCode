package pro.kwongsui.leetcode.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;
import pro.kwongsui.leetcode.util.NestedIntArrayConverter;

class Solution0057Test {

    @ParameterizedTest
    @CsvSource({
        "'', '1,3', '1,3'",
        "'1,5', '0,3', '0,5'",
        "'3,5', '1,2', '1,2|3,5'",
        "'1,2', '3,5', '1,2|3,5'",
        "'1,3|6,9', '4,5', '1,3|4,5|6,9'",
        "'1,3|6,9', '2,5', '1,5|6,9'",
        "'1,5', '2,3', '1,5'",
        "'1,5', '2,7', '1,7'",
        "'1,2|3,5|6,7|8,10|12,16', '4,9', '1,2|3,10|12,16'",
        "'1,2|3,5|8,10|12,16', '6,9', '1,2|3,5|6,10|12,16'",
        "'1,2|3,5|8,10|12,16', '6,11', '1,2|3,5|6,11|12,16'",
        "'1,2|3,5|8,10|12,16', '4,11', '1,2|3,11|12,16'"
    })
    void insert(@ConvertWith(NestedIntArrayConverter.class) int[][] input,
        @ConvertWith(IntArrayConverter.class) int[] interval,
        @ConvertWith(NestedIntArrayConverter.class) int[][] expected) {
        assertArrayEquals(expected, new Solution0057().insert(input, interval));
    }
}