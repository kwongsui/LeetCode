package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution1130Test {

    @ParameterizedTest
    @CsvSource({
        "'6,2,3,4', 42",
        "'6,2,3,1', 27",
        "'7,1,6,1,1,1', 56",
        "'6,4,9,7,8', 206"
    })
    void mctFromLeafValues(@ConvertWith(IntArrayConverter.class) int[] input, int expected) {
        assertEquals(expected, new Solution1130().mctFromLeafValues(input));
    }
}