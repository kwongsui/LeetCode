package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.NestedListConverter;

class Solution0095Test {

    @ParameterizedTest
    @CsvSource({
        "3, '1,2,3|1,3,2|2,1,3|3,1,2|3,2,1'",
        "4, '1,2,3,4|1,2,4,3|1,3,2,4|1,4,2,3|1,4,3,2|"
            + "2,1,3,4|2,1,4,3|"
            + "3,1,4,2|3,2,4,1|"
            + "4,1,2,3|4,1,3,2|4,2,1,3|4,3,1,2|4,3,2,1'"
    })
    void generateTrees(int n,
        @ConvertWith(NestedListConverter.class) List<List<Integer>> expected) {
        List<TreeNode> output = new Solution0095().generateTrees(n);
        List<List<Integer>> actual = new ArrayList<>();
        for (TreeNode treeNode : output) {
            actual.add(BinaryTree.bfs(treeNode));
        }
        assertIterableEquals(expected, actual);
    }
}