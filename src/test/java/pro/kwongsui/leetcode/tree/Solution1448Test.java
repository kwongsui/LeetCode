package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution1448Test {

    @ParameterizedTest
    @CsvSource({
        "'3,1,4,3,null,1,5', 4",
        "'3,3,null,4,2', 3",
        "'1', 1",
        "'2,null,4,10,8,null,null,4', 4"
    })
    void goodNodes(@ConvertWith(IntegerArrayConverter.class) Integer[] input, int expected) {
        assertEquals(expected, new Solution1448().goodNodes(BinaryTree.create(input)));
    }
}