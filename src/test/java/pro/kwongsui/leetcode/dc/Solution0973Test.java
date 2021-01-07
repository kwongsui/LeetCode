package pro.kwongsui.leetcode.dc;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.NestedIntArrayConverter;

class Solution0973Test {

    @ParameterizedTest
    @CsvSource({
        "'1,3|-2,2', 1, '-2,2'",
        "'3,3|5,-1|-2,4', 2, '3,3|-2,4'"
    })
    void kClosest(@ConvertWith(NestedIntArrayConverter.class) int[][] input, int k,
        @ConvertWith(NestedIntArrayConverter.class) int[][] expected) {
        assertArrayEquals(expected, new Solution0973().kClosest(input, k));
    }
}
