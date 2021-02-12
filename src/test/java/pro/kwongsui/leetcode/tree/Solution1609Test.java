package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution1609Test {

    @ParameterizedTest
    @CsvSource({
        "'1,10,4,3,null,7,9,12,8,6,null,null,2', 'true'",
        "'5,4,2,3,3,7', 'false'",
        "'5,9,1,3,5,7', 'false'",
        "'1', 'true'",
        "'11,8,6,1,3,9,11,30,20,18,16,12,10,4,2,17', 'true'"
    })
    void isEvenOddTree(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        boolean expected) {
        assertEquals(expected, new Solution1609().isEvenOddTree(BinaryTree.create(input)));
    }
}