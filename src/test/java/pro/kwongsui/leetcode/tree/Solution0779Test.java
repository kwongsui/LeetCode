package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.tree.Solution0779;

class Solution0779Test {

    @ParameterizedTest
    @CsvSource({
        "1, 1, 0",
        "2, 1, 0",
        "2, 2, 1",
        "4, 5, 1",
        "30, 100, 0"
    })
    void kthGrammar(int N, int K, int output) {
        assertEquals(output, new Solution0779().kthGrammar(N, K));
    }
}