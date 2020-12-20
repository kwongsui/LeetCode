package pro.kwongsui.leetcode.dico;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.dico.Solution0395;

class Solution0395Test {

    @ParameterizedTest
    @CsvSource({
        "'a', 2, 0",
        "'a', 1, 1",
        "'aaabb', 3, 3",
        "'ababbc', 2, 5",
        "'ababacb', 3, 0",
        "'bbaaacbd', 3, 3",
        "'weitong', 2, 0",
        "'zzzzzzzzzzaaaaaaaaabbbbbbbbhbhbhbhbhbhbhicbcbcibcbccccccccccbbbbbbbbaaaaaaaaa"
            + "fffaahhhhhiaahiiiiiiiiifeeeeeeeeee', 10, 21"
    })
    void longestSubstring(String input, int k, int output) {
        assertEquals(output, new Solution0395().longestSubstring(input, k));
    }
}