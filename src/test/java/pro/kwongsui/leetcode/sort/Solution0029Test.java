package pro.kwongsui.leetcode.sort;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution0029Test {

    @ParameterizedTest
    @CsvSource({
        "-1, 1, -1",
        "10, 3, 3",
        "7, 3, 2",
        "7, -3, -2",
        "-7, 3, -2",
        "-7, -3, 2",
        "-3, -7, 0",
        "-3, 7, 0",
        "3, -7, 0",
        "3, 7, 0",
        "-2147483648, -1, 2147483647",
        "-2147483648, 1, -2147483648",
        "2147483646, 2, 1073741823",
        "2147483647, 2, 1073741823",
        "2147483647, 3, 715827882",
        "2147483647, 4, 536870911",
        "2147483647, 5, 429496729",
        "2147483647, 1, 2147483647",
        "-2147483648, 2, -1073741824",
        "-1, -2147483648, 0",
        "63, 8, 7",
        "1023, 3, 341",
        "-1023, 2, -511"
    })
    void divide(int dividend, int divisor, int expected) {
        assertEquals(expected, new Solution0029().divide(dividend, divisor));
    }
}