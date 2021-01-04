package pro.kwongsui.leetcode.heap;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0347Test {

    @ParameterizedTest
    @CsvSource({
        "'1', 1, '1'",
        "'1,1,1,2,2,3', 2, '2,1'"
    })
    void topKFrequent(@ConvertWith(IntArrayConverter.class) int[] input,
        int k, @ConvertWith(IntArrayConverter.class) int[] expected) {
        assertArrayEquals(expected, new Solution0347().topKFrequent(input, k));
    }
}