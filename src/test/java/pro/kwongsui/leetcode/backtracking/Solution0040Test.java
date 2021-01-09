package pro.kwongsui.leetcode.backtracking;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;
import pro.kwongsui.leetcode.util.NestedListConverter;

class Solution0040Test {

    @ParameterizedTest
    @CsvSource({
        "'2,3,6,7', 7, '7'",
        "'2,3,5', 8, '3,5'",
        "'2,5,2,1,2', 5, '1,2,2|5'"
    })
    void combinationSum2(@ConvertWith(IntArrayConverter.class) int[] input, int target,
        @ConvertWith(NestedListConverter.class) List<List<Integer>> expected) {
        assertIterableEquals(expected, new Solution0040().combinationSum2(input, target));
    }
}