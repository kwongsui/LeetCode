package pro.kwongsui.offer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution16Test {

    @ParameterizedTest
    @CsvSource({
        "2, 10, 1024",
        "2.1, 3, 9.261",
        "2, -2, 0.25",
        "2.1, -3, 0.10798",
        "2, -2147483648, 0"
    })
    void myPow(double x, int n, double expected) {
        assertEquals(expected, new Solution16().myPow(x, n));
    }
}