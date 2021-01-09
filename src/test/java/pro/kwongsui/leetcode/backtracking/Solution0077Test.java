package pro.kwongsui.leetcode.backtracking;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.NestedListConverter;

class Solution0077Test {

    @ParameterizedTest
    @CsvSource({
        "4, 2, '1,2|1,3|1,4|2,3|2,4|3,4'",
        "5, 3, '1,2,3|1,2,4|1,2,5|1,3,4|1,3,5|1,4,5|2,3,4|2,3,5|2,4,5|3,4,5'"
    })
    void combine(int n, int k,
        @ConvertWith(NestedListConverter.class) List<List<Integer>> expected) {
        assertIterableEquals(expected, new Solution0077().combine(n, k));
    }
}