package pro.kwongsui.leetcode.stack;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.tree.BinaryTree;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0144Test {

    @ParameterizedTest
    @CsvSource({
        "'', ''",
        "'1', '1'",
        "'1,null,2,3', '1,2,3'",
        "'1,2,3,null,null,4,5', '1,2,3,4,5'",
        "'3,9,20,2,16,15,7', '3,9,2,16,20,15,7'"
    })
    void preorderTraversal(
        @ConvertWith(IntegerArrayConverter.class) Integer[] input,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        assertIterableEquals(Arrays.asList(output),
            new Solution0144().preorderTraversal(BinaryTree.create(input)));
    }
}