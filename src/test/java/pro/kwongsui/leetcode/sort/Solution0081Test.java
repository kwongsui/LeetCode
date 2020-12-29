package pro.kwongsui.leetcode.sort;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0081Test {

    @ParameterizedTest
    @CsvSource({
        "'', 1, 'false'",
        "'1,1', 2, 'false'",
        "'2,2', 2, 'true'",
        "'2,5,6,0,0,1,2', 0, 'true'",
        "'2,5,6,0,0,1,2', 3, 'false'",
        "'1,1,1,0,1', 1, 'true'",
        "'1,1,0,1,1,1,1', 0, 'true'",
        "'1,1,1,1,1,0,1', 0, 'true'"
    })
    void search(@ConvertWith(IntArrayConverter.class) int[] input, int target, boolean expected) {
        assertEquals(expected, new Solution0081().search(input, target));
    }
}
