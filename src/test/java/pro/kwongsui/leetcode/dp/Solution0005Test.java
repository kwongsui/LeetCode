package pro.kwongsui.leetcode.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution0005Test {

    @ParameterizedTest
    @CsvSource({
        "babad, bab"
    })
    void longestPalindrome(String input, String expected) {
        assertEquals(expected, new Solution0005().longestPalindrome(input));
    }
}