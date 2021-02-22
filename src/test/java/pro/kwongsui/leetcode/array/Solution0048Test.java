package pro.kwongsui.leetcode.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.NestedIntArrayConverter;

class Solution0048Test {

    @ParameterizedTest
    @CsvSource({
        "'1,2,3|4,5,6|7,8,9', '7,4,1|8,5,2|9,6,3'",
        "'5,1,9,11|2,4,8,10|13,3,6,7|15,14,12,16', '15,13,2,5|14,3,4,1|12,6,8,9|16,7,10,11'",
        "'1', '1'",
        "'1,2|3,4', '3,1|4,2'"
    })
    void rotate(@ConvertWith(NestedIntArrayConverter.class) int[][] input,
        @ConvertWith(NestedIntArrayConverter.class) int[][] expected) {
        new Solution0048().rotate(input);
        assertArrayEquals(expected, input);
    }
}