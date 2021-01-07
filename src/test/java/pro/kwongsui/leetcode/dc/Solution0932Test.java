package pro.kwongsui.leetcode.dc;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0932Test {

    @ParameterizedTest
    @CsvSource({
        "2, '1,2'",
        "3, '1,3,2'",
        "4, '1,3,2,4'",
        "5, '1,5,3,2,4'",
        "6, '1,5,3,2,6,4'",
        "8, '1,5,3,7,2,6,4,8'"
    })
    void beautifulArray(int input, @ConvertWith(IntArrayConverter.class) int[] expected) {
        assertArrayEquals(expected, new Solution0932().beautifulArray(input));
    }
}
