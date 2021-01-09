package pro.kwongsui.leetcode.backtracking;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;
import pro.kwongsui.leetcode.util.NestedListConverter;

class Solution0039Test {

    @ParameterizedTest
    @CsvSource({
        "'2,3,6,7', 7, '2,2,3|7'",
        "'2,3,5', 8, '2,2,2,2|2,3,3|3,5'"
    })
    void combinationSum(@ConvertWith(IntArrayConverter.class) int[] input, int target,
        @ConvertWith(NestedListConverter.class) List<List<Integer>> expected) {
        assertIterableEquals(expected, new Solution0039().combinationSum(input, target));
    }
}
