package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0662Test {

    @ParameterizedTest
    @CsvSource({
        "'1', 1",
        "'1,2,3,4,null,5', 3",
        "'1,2,3,4,null,5,null,6,null,7', 5",
        "'1,3,2,5,3,null,9', 4",
        "'1,null,3,5,3', 2",
        "'1,3,2,5', 2",
        "'1,3,2,5,null,null,9,6,null,null,7', 8",
        "'1,1,1,1,1,1,1,null,null,null,1,null,null,null,null,2,2,2,2,2,2,2,null,2,null,null,2,"
            + "null,2', 8",
        "'1,1,1,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,"
            + "null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,"
            + "null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,"
            + "null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,"
            + "null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,1,null,null,1,1,null,1,null,1,"
            + "null,1,null,1,null', 2147483645"
    })
    void widthOfBinaryTree(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        int expected) {
        assertEquals(expected, new Solution0662().widthOfBinaryTree(BinaryTree.create(input)));
    }
}