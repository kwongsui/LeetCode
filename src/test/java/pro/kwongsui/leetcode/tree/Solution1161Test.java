package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution1161Test {

    @ParameterizedTest
    @CsvSource({
        "'1,7,0,7,-8,null,null', 2",
        "'989,null,10250,98693,-89388,null,null,null,-32127', 2"
    })
    void maxLevelSum(@ConvertWith(IntegerArrayConverter.class) Integer[] input, int expected) {
        assertEquals(expected, new Solution1161().maxLevelSum(BinaryTree.create(input)));
    }
}