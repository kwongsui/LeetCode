package pro.kwongsui.leetcode.dp;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.NestedListConverter;

class Solution0120Test {

    @ParameterizedTest
    @CsvSource({
        "'2|3,4|6,5,7|4,1,8,3', 11",
        "'-10', -10"
    })
    void minimumTotal(@ConvertWith(NestedListConverter.class) List<List<Integer>> input,
        int expected) {
        assertEquals(expected, new Solution0120().minimumTotal(input));
    }
}