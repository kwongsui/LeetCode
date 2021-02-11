package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.tree.Solution1261.FindElements;
import pro.kwongsui.leetcode.util.IntArrayConverter;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution1261Test {

    @ParameterizedTest
    @CsvSource({
        "'-1,null,-1', '1,2', '0,1'",
        "'-1,-1,-1,-1,-1', '1,3,5', '1,1,0'",
        "'-1,null,-1,-1,null,-1', '2,3,4,5', '1,0,0,1'"
    })
    void test(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        @ConvertWith(IntArrayConverter.class) int[] values,
        @ConvertWith(IntArrayConverter.class) int[] output) {
        FindElements findElements = new FindElements(BinaryTree.create(input));
        for (int i = 0; i < values.length; i++) {
            boolean expected = output[i] != 0;
            assertEquals(expected, findElements.find(values[i]));
        }
    }
}