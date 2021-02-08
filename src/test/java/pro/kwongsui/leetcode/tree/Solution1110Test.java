package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;
import pro.kwongsui.leetcode.util.NestedListConverter;

class Solution1110Test {

    @ParameterizedTest
    @CsvSource({
        "'1,2,3,4,5,6,7', '3,5', '1,2,4|6|7'"
    })
    void delNodes(@ConvertWith(IntegerArrayConverter.class) Integer[] input,
        @ConvertWith(IntArrayConverter.class) int[] to_delete,
        @ConvertWith(NestedListConverter.class) List<List<Integer>> output) {
        List<TreeNode> actual = new Solution1110().delNodes(BinaryTree.create(input), to_delete);
        int idx = 0;
        for (TreeNode node : actual) {
            assertIterableEquals(output.get(idx++), BinaryTree.bfs(node));
        }
    }
}