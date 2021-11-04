package pro.kwongsui.leetcode.dp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution0509Test {

    @ParameterizedTest
    @CsvSource({
        "4, 3",
        "30, 832040"
    })
    void fib(int input, int expected) {
        assertEquals(expected, new Solution0509().fib(input));
    }
}