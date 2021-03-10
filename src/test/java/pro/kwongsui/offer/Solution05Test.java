package pro.kwongsui.offer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution05Test {

    @ParameterizedTest
    @CsvSource("'We are happy.', 'We%20are%20happy.'")
    void replaceSpace(String input, String expected) {
        assertEquals(expected, new Solution05().replaceSpace(input));
    }
}