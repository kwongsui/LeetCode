package pro.kwongsui.leetcode.stack;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.tree.BinaryTree;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;
import pro.kwongsui.leetcode.util.NestedListConverter;

class Solution0103Test {

    @ParameterizedTest
    @CsvSource({
        "'', ''",
        "'3,9,20,null,null,15,7', '3|20,9|15,7'",
        "'3,9,20,2,16,15,7', '3|20,9|2,16,15,7'"
    })
    void zigzagLevelOrder(
        @ConvertWith(IntegerArrayConverter.class) Integer[] input,
        @ConvertWith(NestedListConverter.class) List<List<Integer>> output) {
        assertIterableEquals(output,
            new Solution0103().zigzagLevelOrder(BinaryTree.create(input)));
    }
}