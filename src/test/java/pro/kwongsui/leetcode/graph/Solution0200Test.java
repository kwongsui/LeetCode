package pro.kwongsui.leetcode.graph;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.NestedCharArrayConverter;

class Solution0200Test {

    @ParameterizedTest
    @CsvSource({
        "'1,1,1,1,0|1,1,0,1,0|1,1,0,0,0|0,0,0,0,0', 1",
        "'1,1,0,0,0|1,1,0,0,0|0,0,1,0,0|0,0,0,1,1', 3"
    })
    void numIslands(@ConvertWith(NestedCharArrayConverter.class) char[][] input, int expected) {
        assertEquals(expected, new Solution0200().numIslands(input));
    }
}