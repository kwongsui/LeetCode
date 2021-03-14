package pro.kwongsui.offer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class Solution15Test {

    @ParameterizedTest
    @CsvSource({
        "'00000000000000000000000000001011', 3",
        "'00000000000000000000000010000000', 1",
//        "'11111111111111111111111111111101', 31"
    })
    void hammingWeight(String input, int expected) {
        assertEquals(expected, new Solution15().hammingWeight(Integer.parseInt(input, 2)));
    }
}