package pro.kwongsui.offer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution20Test {

    @ParameterizedTest
    @CsvSource({
        "'+100', 'true'",
        "'5e2', 'true'",
        "'-123', 'true'",
        "'3.1416', 'true'",
        "'-1E-16', 'true'",
        "'+.5', 'true'",
        "'-.4', 'true'",
        "'12e', 'false'",
        "'1a3.14', 'false'",
        "'1.2.3', 'false'",
        "'+-5', 'false'",
        "'12e+5.4', 'false'",
        "'.-4', 'false'",
        "'', 'false'"
    })
    void isNumber(String input, boolean expected) {
        assertEquals(expected, new Solution20().isNumber(input));
    }
}