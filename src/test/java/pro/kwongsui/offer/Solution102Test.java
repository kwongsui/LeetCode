package pro.kwongsui.offer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution102Test {

    @ParameterizedTest
    @CsvSource({
        "0, 1",
        "1, 1",
        "2, 2",
        "7, 21",
        "100, 782204094"
    })
    void numWays(int input, int expected) {
        assertEquals(expected, new Solution102().numWays(input));
    }
}