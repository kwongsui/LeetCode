package pro.kwongsui.leetcode.hash;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution0166Test {

    @ParameterizedTest
    @CsvSource({
        "0, 1, '0'",
        "1, 2, '0.5'",
        "11, 100, '0.11'",
        "2, 3, '0.(6)'",
        "4, 333, '0.(012)'",
        "-1, -2147483648, '0.0000000004656612873077392578125'"
    })
    void fractionToDecimal(int input1, int input2, String expected) {
        assertEquals(expected, new Solution0166().fractionToDecimal(input1, input2));
    }
}