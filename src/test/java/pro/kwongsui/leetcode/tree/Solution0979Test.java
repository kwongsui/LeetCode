package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0979Test {

    @ParameterizedTest
    @CsvSource({
        "'3,0,0', 2",
        "'0,3,0', 3",
        "'1,0,2', 2",
        "'1,0,0,null,3', 4",
        "'0,2,2,0', 2"
    })
    void distributeCoins(@ConvertWith(IntegerArrayConverter.class) Integer[] input, int expected) {
        assertEquals(expected, new Solution0979().distributeCoins(BinaryTree.create(input)));
    }
}