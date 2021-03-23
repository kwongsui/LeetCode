package pro.kwongsui.offer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution17Test {

    @ParameterizedTest
    @CsvSource({
        "1, '1,2,3,4,5,6,7,8,9'",
    })
    void printNumbers(int input, String expected) {
        assertEquals(expected, new Solution17().printNumbers(input));
    }
}