package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution1302Test {

    @ParameterizedTest
    @CsvSource({
        "'1,2,3,4,5,null,6,7,null,null,null,null,8', 15"
    })
    void deepestLeavesSum(@ConvertWith(IntegerArrayConverter.class) Integer[] input, int expected) {
        assertEquals(expected, new Solution1302().deepestLeavesSum(BinaryTree.create(input)));
    }
}