package pro.kwongsui.leetcode.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0152Test {

    @ParameterizedTest
    @CsvSource({
        "'2,3,-2,4', 6",
        "'-2,0,-1', 0",
        "'-1,2,-3,-4,-5', 120"
    })
    void maxProduct(@ConvertWith(IntArrayConverter.class) int[] input, int expected) {
        assertEquals(expected, new Solution0152().maxProduct1(input));
    }
}