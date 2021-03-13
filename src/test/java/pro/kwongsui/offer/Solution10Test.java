package pro.kwongsui.offer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution10Test {

    @ParameterizedTest
    @CsvSource({
        "0, 0",
        "1, 1",
        "2, 1",
        "5, 5",
        "90, 210345902",
        "100, 687995182"
    })
    void fib(int input, int expected) {
        assertEquals(expected, new Solution10().fib(input));
    }

    @ParameterizedTest
    @CsvSource({
        "0, 1",
        "1, 1",
        "2, 2",
        "7, 21",
        "100, 782204094"
    })
    void numWays(int input, int expected) {
        assertEquals(expected, new Solution10().numWays(input));
    }
}