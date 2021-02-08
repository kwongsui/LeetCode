package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0951Test {

    @ParameterizedTest
    @CsvSource({
        "'1,2,3,4,5,6,null,null,null,7,8', '1,3,2,null,6,4,5,null,null,null,null,8,7', 'true'",
        "'', '', 'true'",
        "'', '1', 'false'",
        "'0,null,1', '', 'false'",
        "'0,null,1', '0,1', 'true'"
    })
    void flipEquiv(@ConvertWith(IntegerArrayConverter.class) Integer[] input1,
        @ConvertWith(IntegerArrayConverter.class) Integer[] input2, boolean expected) {
        assertEquals(expected, new Solution0951().flipEquiv(
            BinaryTree.create(input1), BinaryTree.create(input2)));
    }
}