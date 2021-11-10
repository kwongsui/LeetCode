package pro.kwongsui.leetcode.dp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution0509Test {

    @ParameterizedTest
    @CsvSource({
        "0, 0",
        "1, 1,",
        "2, 1",
        "3, 2",
        "4, 3",
        "30, 832040"
    })
    void fib(int input, int expected) {
        assertEquals(expected, new Solution0509().fib(input));
    }

    @ParameterizedTest
    @CsvSource({
        "2, 10, 1024",
        "5, 5, 3125"
    })
    void quickPow(int input1, int input2, int expected) {
        assertEquals(expected, new Solution0509().quickPow(input1, input2));
    }
}