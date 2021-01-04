package pro.kwongsui.leetcode.heap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0313Test {

    @ParameterizedTest
    @CsvSource({
        "12, '2,7,13,19', 32",
        "1690, '2,3,5', 2123366400"
    })
    void nthSuperUglyNumber(int n,
        @ConvertWith(IntArrayConverter.class) int[] input, int expected) {
        assertEquals(expected, new Solution0313().nthSuperUglyNumber(n, input));
    }
}