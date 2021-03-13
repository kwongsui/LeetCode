package pro.kwongsui.offer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution14Test {

    @ParameterizedTest
    @CsvSource({
        "2, 1",
        "3, 2",
        "4, 4",
        "5, 6",
        "10, 36",
        "25, 8748",
        "1000, 620946522"
    })
    void cuttingRope(int input, int expected) {
        assertEquals(expected, new Solution14().cuttingRope2(input));
    }
}