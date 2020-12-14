package pro.kwongsui.leetcode.stack;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.tree.BinaryTree;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0145Test {

    @ParameterizedTest
    @CsvSource({
        "'', ''",
        "'1', '1'",
        "'1,null,2,3', '3,2,1'",
        "'1,2,3,null,null,4,5', '2,4,5,3,1'",
        "'3,9,20,2,16,15,7', '2,16,9,15,7,20,3'"
    })
    void postorderTraversal(
        @ConvertWith(IntegerArrayConverter.class) Integer[] input,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        assertIterableEquals(Arrays.asList(output),
            new Solution0145().postorderTraversal(BinaryTree.create(input)));
    }
}