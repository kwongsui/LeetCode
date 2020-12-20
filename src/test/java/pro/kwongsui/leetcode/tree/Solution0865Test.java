package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.tree.BinaryTree;
import pro.kwongsui.leetcode.tree.Solution0865;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0865Test {

    @ParameterizedTest
    @CsvSource({
        "'1', '1'",
        "'0,1,3,null,2', '2'",
        "'0,1,3,2,4', '1,2,4'",
        "'3,5,1,6,2,0,8,null,null,7,4', '2,7,4'",
        "'3,5,1,6,2,0,8,null,null,7,4,9,10', '3,5,1,6,2,0,8,7,4,9,10'"
    })
    void subtreeWithAllDeepest(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        assertIterableEquals(Arrays.asList(output),
            BinaryTree.bfs(new Solution0865().subtreeWithAllDeepest(BinaryTree.create(input))));
    }
}