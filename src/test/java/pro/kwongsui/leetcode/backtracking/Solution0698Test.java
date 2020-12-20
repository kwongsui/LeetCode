package pro.kwongsui.leetcode.backtracking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.backtracking.Solution0698;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0698Test {

    @ParameterizedTest
    @CsvSource({
        "'1', 1, 'true'",
        "'1,2', 2, 'false'",
        "'2,2', 2, 'true'",
        "'4,3,2,3,5,2,1', 4, 'true'",
        "'4,3,2,3,4,2,2', 4, 'false'",
        "'4,15,1,1,1,1,3,11,1,10', 3, 'true'",
        "'10,10,10,7,7,7,7,7,7,6,6,6', 3, 'true'"
    })
    void canPartitionKSubsets(
        @ConvertWith(IntArrayConverter.class) int[] input, int k, boolean output) {
        assertEquals(output, new Solution0698().canPartitionKSubsets(input, k));
    }
}