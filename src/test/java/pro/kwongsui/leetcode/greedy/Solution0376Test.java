package pro.kwongsui.leetcode.greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0376Test {

    @ParameterizedTest
    @CsvSource({
        "'0,0', 1",
        "'0,1', 2",
        "'1,7,4,9,2,5', 6",
        "'1,2,3,4,5,6,7,8,9', 2",
        "'1,17,5,10,13,15,10,5,16,8', 7",
        "'1,17,5,10,13,15,10,5,16,20', 6",
    })
    void wiggleMaxLength(@ConvertWith(IntArrayConverter.class) int[] input, int expected) {
        assertEquals(expected, new Solution0376().wiggleMaxLength(input));
    }
}
