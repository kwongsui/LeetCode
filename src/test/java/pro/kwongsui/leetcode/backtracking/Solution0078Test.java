package pro.kwongsui.leetcode.backtracking;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;
import pro.kwongsui.leetcode.util.NestedListConverter;

class Solution0078Test {

    @ParameterizedTest
    @CsvSource({
        "'1,2,3', '1,2,3|1,2|1,3|1|2,3|2|3|'"
    })
    void subsets(@ConvertWith(IntArrayConverter.class) int[] input,
        @ConvertWith(NestedListConverter.class) List<List<Integer>> expected) {
        assertIterableEquals(expected, new Solution0078().subsets(input));
    }
}