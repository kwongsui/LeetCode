package pro.kwongsui.leetcode.sort;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.NestedIntArrayConverter;

class Solution0056Test {

    @ParameterizedTest
    @CsvSource({
        "'1,3', '1,3'",
        "'1,4|2,3', '1,4'",
        "'1,4|4,5', '1,5'",
        "'1,3|4,5', '1,3|4,5'",
        "'1,3|2,6|8,10|15,18', '1,6|8,10|15,18'",
        "'1,3|2,9|8,10|15,18', '1,10|15,18'",
        "'1,3|2,9|8,12|11,18', '1,18'",
        "'2,9|1,4|7,11|10,15', '1,15'",
        "'5,5|1,3|3,5|4,6|1,1|3,3|5,6|3,3|2,4|0,0', '0,0|1,6'",
        "'2,3|0,1|1,2|3,4|4,5|1,1|0,1|4,6|5,7|1,1|3,5', '0,7'",
        "'1,3|0,2|2,3|4,6|4,5|5,5|0,2|3,3', '0,3|4,6'",
        "'1,2|3,4|5,6', '1,2|3,4|5,6'",
        "'0,10|6,12|17,25|4,15|2,8', '0,15|17,25'"
    })
    void merge(@ConvertWith(NestedIntArrayConverter.class) int[][] input,
        @ConvertWith(NestedIntArrayConverter.class) int[][] expected) {
        assertArrayEquals(expected, new Solution0056().merge(input));
    }
}