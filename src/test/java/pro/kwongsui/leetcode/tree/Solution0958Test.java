package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0958Test {

    @ParameterizedTest
    @CsvSource({
        "'1,2,3,4,5,6', 'true'",
        "'1,2,3,4,5,null,7', 'false'",
        "'1,2,3,4,null,5,6,7,8', 'false'",
        "'1,2,3,null,null,7,8', 'false'"
    })
    void isCompleteTree(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        boolean expected) {
        assertEquals(expected, new Solution0958().isCompleteTree(BinaryTree.create(input)));
    }
}