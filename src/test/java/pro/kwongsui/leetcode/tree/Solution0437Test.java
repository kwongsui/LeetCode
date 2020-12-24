package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0437Test {

    @ParameterizedTest
    @CsvSource({
        "'10,5,-3,3,2,null,11,3,-2,null,1', 8, 3",
        "'1,-2,-3,1,3,-2,null,-1', -1, 4"
    })
    void pathSum(@ConvertWith(IntegerArrayConverter.class) Integer[] input, int sum, int expected) {
        assertEquals(expected, new Solution0437().pathSum(BinaryTree.create(input), sum));
    }
}