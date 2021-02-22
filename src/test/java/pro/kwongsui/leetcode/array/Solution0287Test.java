package pro.kwongsui.leetcode.array;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0287Test {

    @ParameterizedTest
    @CsvSource({
        "'1,3,4,2,2', 2",
        "'3,1,3,4,2', 3",
        "'1,1', 1",
        "'1,1,2', 1",
        "'1,2,3,4,4,5,6,7', 4"
    })
    void findDuplicate(@ConvertWith(IntArrayConverter.class) int[] input, int expected) {
        assertEquals(expected, new Solution0287().findDuplicate(input));
    }
}