package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.NestedIntArrayConverter;

class Solution1466Test {

    @ParameterizedTest
    @CsvSource({
        "6, '0,1|1,3|2,3|4,0|4,5', 3",
        "5, '1,0|1,2|3,2|3,4', 2",
        "3, '1,0|2,0', 0"
    })
    void minReorder(int n, @ConvertWith(NestedIntArrayConverter.class) int[][] connections,
        int expected) {
        assertEquals(expected, new Solution1466().minReorder(n, connections));
    }
}