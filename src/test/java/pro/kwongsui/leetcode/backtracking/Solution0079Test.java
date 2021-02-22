package pro.kwongsui.leetcode.backtracking;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.NestedCharArrayConverter;

class Solution0079Test {

    @ParameterizedTest
    @CsvSource({
        "'A,B,C,E|S,F,C,S|A,D,E,E', ABCCED, true",
        "'A,B,C,E|S,F,C,S|A,D,E,E', SEE, true",
        "'A,B,C,E|S,F,C,S|A,D,E,E', ACBC, false"
    })
    void exist(@ConvertWith(NestedCharArrayConverter.class) char[][] input, String word,
        boolean expected) {
        assertEquals(expected, new Solution0079().exist(input, word));
    }
}