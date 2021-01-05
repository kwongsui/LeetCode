package pro.kwongsui.leetcode.greedy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution0402Test {

    @ParameterizedTest
    @CsvSource({
        "1432219, 3, 1219",
        "432291, 3, 221",
        "1432291, 3, 1221",
        "143229871, 3, 122871",
        "10200, 1, 200",
        "10, 2, 0",
        "10, 1, 0",
        "112, 1, 11",
        "11222333, 3, 11222",
        "11222331, 3, 11221"
    })
    void removeKdigits(String input, int k, String expected) {
        assertEquals(expected, new Solution0402().removeKdigits(input, k));
    }
}