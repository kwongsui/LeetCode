package pro.kwongsui.offer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.NestedIntArrayConverter;

class Solution04Test {

    @ParameterizedTest
    @CsvSource({
        "'1', 1, 'true'",
        "'1', 2, 'false'",
        "'1,1', 2, 'false'",
        "'-1,3', -1, 'true'",
        "'-1,3', 3, 'true'",
        "'1,3,5', 1, 'true'",
        "'1,3,5', 5, 'true'",
        "'1,4,7,11,15|2,5,8,12,19', 5, 'true'",
        "'1,4,7,11,15|2,5,8,12,19|3,6,9,16,22|10,13,14,17,24|18,21,23,26,30', 5, 'true'",
        "'1,4,7,11,15|2,5,8,12,19|3,6,9,16,22|10,13,14,17,24|18,21,23,26,30', 20, 'false'",
        "'1,4,7,11,15|2,5,8,12,19|3,6,9,16,22|10,13,14,17,24|18,21,23,26,30', 13, 'true'",
        "'1,2,3,4,5|6,7,8,9,10|11,12,13,14,15|16,17,18,19,20|21,22,23,24,25', 19, 'true'"
    })
    void findNumberIn2DArray(@ConvertWith(NestedIntArrayConverter.class) int[][] input, int target,
        boolean expected) {
        assertEquals(expected, new Solution04().findNumberIn2DArray(input, target));
    }
}