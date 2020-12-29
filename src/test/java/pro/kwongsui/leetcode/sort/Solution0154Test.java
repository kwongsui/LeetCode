package pro.kwongsui.leetcode.sort;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0154Test {

    @Test
    void findMin() {
    }

    @ParameterizedTest
    @CsvSource({
        "'1,1', 1",
        "'2,2', 2",
        "'3,1', 1",
        "'2,5,6,0,0,1,2', 0",
        "'1,1,1,0,1', 0",
        "'1,1,0,1,1,1,1', 0",
        "'1,1,1,1,1,0,1', 0"
    })
    void findMin(@ConvertWith(IntArrayConverter.class) int[] input, int expected) {
        assertEquals(expected, new Solution0154().findMin(input));
    }
}
