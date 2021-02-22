package pro.kwongsui.leetcode.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution0062Test {

    @ParameterizedTest
    @CsvSource({
        "3, 7, 28",
        "7, 3, 28",
        "3, 2, 3",
        "3, 3, 6"
    })
    void uniquePaths(int m, int n, int expected) {
        assertEquals(expected, new Solution0062().uniquePaths(m, n));
    }
}