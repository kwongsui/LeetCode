package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0129Test {

    @ParameterizedTest
    @CsvSource({
        "'1,2,3', 25",
        "'4,9,0,5,1', 1026"
    })
    void sumNumbers(@ConvertWith(IntegerArrayConverter.class) Integer[] input, int expected) {
        assertEquals(expected, new Solution0129().sumNumbers(BinaryTree.create(input)));
    }
}