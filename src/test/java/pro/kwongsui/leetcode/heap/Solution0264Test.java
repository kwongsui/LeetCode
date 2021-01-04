package pro.kwongsui.leetcode.heap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution0264Test {

    @ParameterizedTest
    @CsvSource({
        "4, 4",
        "1690, 2123366400"
    })
    void nthUglyNumber(int input, int expected) {
        assertEquals(expected, new Solution0264().nthUglyNumber(input));
    }
}