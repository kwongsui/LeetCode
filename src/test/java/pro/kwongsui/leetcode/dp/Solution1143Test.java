package pro.kwongsui.leetcode.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution1143Test {

    @ParameterizedTest
    @CsvSource({
        "'mitcmu', 'mtacnu', 4",
        "'nitcmu', 'mtacnu', 3",
        "'mitt', 'mt', 2",
        "abcde, ace, 3",
        "abc, abc, 3",
        "abc, def, 0",
        "bl, yby, 1",
        "bsbininm, jmjkbkjkv, 1"
    })
    void longestCommonSubsequence(String input1, String input2, int expected) {
        assertEquals(expected, new Solution1143().longestCommonSubsequence(input1, input2));
    }
}