package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution1339Test {

    @ParameterizedTest
    @CsvSource({
        "'1,2,3,4,5,6', 110",
        "'1,null,2,3,4,null,null,5,6', 90",
        "'2,3,9,10,7,8,6,5,4,11,1', 1025",
        "'1,1', 1"
    })
    void maxProduct(@ConvertWith(IntegerArrayConverter.class) Integer[] input, int expected) {
        assertEquals(expected, new Solution1339().maxProduct(BinaryTree.create(input)));
    }
}