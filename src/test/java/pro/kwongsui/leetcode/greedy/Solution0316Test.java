package pro.kwongsui.leetcode.greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution0316Test {

    @ParameterizedTest
    @CsvSource({
        "a, a",
        "bcabc, abc",
        "cbacdcbc, acdb",
        "cbaacdcbc, acdb",
        "cdadabccdaccb, abcd",
        "abacb, abc",
        "bbcaac, bac"
    })
    void removeDuplicateLetters(String input, String expected) {
        assertEquals(expected, new Solution0316().removeDuplicateLetters(input));
    }
}
