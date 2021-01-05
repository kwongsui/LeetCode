package pro.kwongsui.leetcode.greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0055Test {

    @ParameterizedTest
    @CsvSource({
        "'0', 'true'",
        "'0,2,3', 'false'",
        "'2,3,1,1,4', 'true'",
        "'3,2,1,0,4', 'false'"
    })
    void canJump(@ConvertWith(IntArrayConverter.class) int[] input, boolean expected) {
        assertEquals(expected, new Solution0055().canJump(input));
    }
}
