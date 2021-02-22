package pro.kwongsui.leetcode.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0581Test {

    @ParameterizedTest
    @CsvSource({
        "'2,6,4,8,10,9,15', 5"
    })
    void findUnsortedSubArray(@ConvertWith(IntArrayConverter.class) int[] input, int expected) {
        assertEquals(expected, new Solution0581().findUnsortedSubArray(input));
    }
}