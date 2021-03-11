package pro.kwongsui.offer;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.backtracking.Solution0079;
import pro.kwongsui.leetcode.util.NestedCharArrayConverter;

class Solution12Test {

    @ParameterizedTest
    @CsvSource({
        "'A,B,C,E|S,F,C,S|A,D,E,E', ABCCED, true",
        "'A,B,C,E|S,F,C,S|A,D,E,E', SEE, true",
        "'A,B,C,E|S,F,C,S|A,D,E,E', ACBC, false"
    })
    void exist(@ConvertWith(NestedCharArrayConverter.class) char[][] input, String word,
        boolean expected) {
        assertEquals(expected, new Solution12().exist(input, word));
    }
}