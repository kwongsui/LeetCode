package pro.kwongsui.offer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution11Test {

    @ParameterizedTest
    @CsvSource({
        "'1,1', 1",
        "'2,2', 2",
        "'3,1', 1",
        "'2,5,6,0,0,1,2', 0",
        "'1,1,1,0,1', 0",
        "'1,1,0,1,1,1,1', 0",
        "'1,1,1,1,1,0,1', 0",
        "'2,2,2,0,1', 0"
    })
    void minArray(@ConvertWith(IntArrayConverter.class) int[] input, int expected) {
        assertEquals(expected, new Solution11().minArray(input));
    }
}