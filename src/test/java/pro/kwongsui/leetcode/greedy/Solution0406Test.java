package pro.kwongsui.leetcode.greedy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.NestedIntArrayConverter;

class Solution0406Test {

    @ParameterizedTest
    @CsvSource({
        "'7,0|4,4|7,1|5,0|6,1|5,2', '5,0|7,0|5,2|6,1|4,4|7,1'",
        "'6,0|5,0|4,0|3,2|2,2|1,4', '4,0|5,0|2,2|3,2|1,4|6,0'"
    })
    void reconstructQueue(@ConvertWith(NestedIntArrayConverter.class) int[][] input,
        @ConvertWith(NestedIntArrayConverter.class) int[][] expected) {
        assertArrayEquals(expected, new Solution0406().reconstructQueue(input));
    }
}