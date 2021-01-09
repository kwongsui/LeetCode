package pro.kwongsui.leetcode.backtracking;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;
import pro.kwongsui.leetcode.util.NestedListConverter;

class Solution0047Test {

    @ParameterizedTest
    @CsvSource({
        "'1,1,2', '1,1,2|1,2,1|2,1,1'",
        "'1,2,3', '1,2,3|1,3,2|2,1,3|2,3,1|3,1,2|3,2,1'",
        "'0,1,0,0,9', '0,0,0,1,9|0,0,0,9,1|0,0,1,0,9|0,0,1,9,0|0,0,9,0,1|0,0,9,1,0|0,1,0,0,9|"
            + "0,1,0,9,0|0,1,9,0,0|0,9,0,0,1|0,9,0,1,0|0,9,1,0,0|1,0,0,0,9|1,0,0,9,0|1,0,9,0,0|"
            + "1,9,0,0,0|9,0,0,0,1|9,0,0,1,0|9,0,1,0,0|9,1,0,0,0'"
    })
    void permute(@ConvertWith(IntArrayConverter.class) int[] input,
        @ConvertWith(NestedListConverter.class) List<List<Integer>> expected) {
        List<List<Integer>> actual = new Solution0047().permute(input);
        assertIterableEquals(expected, actual);
    }
}