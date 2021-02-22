package pro.kwongsui.leetcode.stack;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution0394Test {

    @ParameterizedTest
    @CsvSource({
        "3[a]2[bc], aaabcbc",
        "3[a2[c]], accaccacc",
        "2[abc]3[cd]ef, abcabccdcdcdef",
        "abc3[cd]xyz, abccdcdcdxyz",
        "10[c], cccccccccc",
        "3[z]2[2[xy]w], zzzxyxywxyxyw"
    })
    void decodeString(String input, String expected) {
        assertEquals(expected, new Solution0394().decodeString(input));
    }
}