package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution1026Test {

    @ParameterizedTest
    @CsvSource({
        "'8,3,10,1,6,null,14,null,null,4,7,13', 7",
        "'1,null,2,null,0,3', 3"
    })
    void maxAncestorDiff(@ConvertWith(IntegerArrayConverter.class) Integer[] input, int expected) {
        assertEquals(expected, new Solution1026().maxAncestorDiff(BinaryTree.create(input)));
    }
}