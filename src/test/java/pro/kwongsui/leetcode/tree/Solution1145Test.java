package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution1145Test {

    @ParameterizedTest
    @CsvSource({
        "'1,2,3,4,5,6,7,8,9,10,11', 11, 3, 'true'",
        "'1,2,3', 3, 2, 'true'"
    })
    void btreeGameWinningMove(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        int n, int x, boolean expected) {
        assertEquals(expected,
            new Solution1145().btreeGameWinningMove(BinaryTree.create(input), n, x));
    }
}