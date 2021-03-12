package pro.kwongsui.offer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution13Test {

    @ParameterizedTest
    @CsvSource({
        "1, 2, 1, 2",
        "2, 3, 1, 3",
        "3, 1, 0, 1",
        "5, 5, 5, 19",
        "100, 100, 20, 6117"
    })
    void movingCount(int m, int n, int k, int expected) {
        assertEquals(expected, new Solution13().movingCount(m, n, k));
    }
}