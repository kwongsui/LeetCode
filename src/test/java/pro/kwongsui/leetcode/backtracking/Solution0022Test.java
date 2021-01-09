package pro.kwongsui.leetcode.backtracking;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution0022Test {

    @ParameterizedTest
    @CsvSource({
        "3, '((())),(()()),(())(),()(()),()()()'"
    })
    void generateParenthesis(int input, String expected) {
        assertIterableEquals(Arrays.asList(expected.split(",")),
            new Solution0022().generateParenthesis(input));
    }
}
