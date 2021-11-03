package pro.kwongsui.leetcode.array;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0167Test {

    @ParameterizedTest
    @CsvSource({
        "'2,7,11,15', 9, '1,2'",
        "'2,3,4', 6, '1,3'",
        "'-1,0', -1, '1,2'",
        "'5,25,75', 100, '2,3'",
        "'1,2,3,4,4,9,56,90', 8, '4,5'",
        "'2,7,8,9,10,11,15', 26, '6,7'"
    })
    void twoSum(@ConvertWith(IntArrayConverter.class) int[] input, int target,
        @ConvertWith(IntArrayConverter.class) int[] expected) {
        assertArrayEquals(expected, new Solution0167().twoSum(input, target));
    }
}