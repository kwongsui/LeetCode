package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0199Test {

    @ParameterizedTest
    @CsvSource({
        "'1,2,3,null,5,null,4', '1,3,4'",
        "'1,2,3,null,5,null,4,6', '1,3,4,6'",
        "'1,2,3,4,5,null,6,7,8,null,null,9,null,null,10,null,null,11,null,12,null,null,null,13', "
            + "'1,3,6,9,11,12,13'"
    })
    void rightSideView(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        @ConvertWith(IntegerArrayConverter.class) Integer[] expected) {
        assertIterableEquals(Arrays.asList(expected),
            new Solution0199().rightSideView(BinaryTree.create(input)));
    }
}