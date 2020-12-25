package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;
import pro.kwongsui.leetcode.util.NestedListConverter;

class Solution0652Test {

    @ParameterizedTest
    @CsvSource({
        "'10,2,22,1,12,1,1', '1'",
        "'0,0,0,0,null,null,0,null,null,null,0', '0'",
        "'1,1,1,1,null,null,1,null,null,null,1', '1'",
        "'1,2,3,null,4,2,2,null,null,3,4,null,4', '4|2,4'",
        "'1,2,3,4,4,2,4,5,6,null,null,4,4,5,null,null,null,null,null,5,6', "
            + "'5|6|4,5,6|4|2,4,4,5,6'"
    })
    void findDuplicateSubtrees(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        @ConvertWith(NestedListConverter.class) List<List<Integer>> expected) {
        List<TreeNode> nodeList =
            new Solution0652().findDuplicateSubtrees(BinaryTree.create(input));
        List<List<Integer>> actual = new ArrayList<>();
        for (TreeNode node : nodeList) {
            actual.add(BinaryTree.bfs(node));
        }
        assertIterableEquals(expected, actual);
    }
}