package pro.kwongsui.leetcode.hash;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution0003Test {

    @ParameterizedTest
    @CsvSource({
        "'abcabcbb', 3",
        "'bbbbb', 1",
        "'pwwkew', 3",
        "'', 0",
        "'abba', 2"
    })
    void lengthOfLongestSubstring(String input, int expected) {
        assertEquals(expected, new Solution0003().lengthOfLongestSubstring(input));
    }
}