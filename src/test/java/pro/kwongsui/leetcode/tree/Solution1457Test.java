package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution1457Test {

    @ParameterizedTest
    @CsvSource({
        "'2,3,1,3,1,null,1', 2",
        "'2,1,1,1,3,null,null,null,null,null,1', 1",
        "'9', 1"
    })
    void pseudoPalindromicPaths(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        int expected) {
        assertEquals(expected, new Solution1457().pseudoPalindromicPaths(BinaryTree.create(input)));
    }
}