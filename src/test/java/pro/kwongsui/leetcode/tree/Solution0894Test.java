package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.tree.BinaryTree;
import pro.kwongsui.leetcode.tree.Solution0894;
import pro.kwongsui.leetcode.tree.TreeNode;
import pro.kwongsui.leetcode.util.NestedListConverter;

class Solution0894Test {

    @ParameterizedTest
    @CsvSource({
        "1, '0'",
        "2, ''",
        "3, '0,0,0'",
        "4, ''",
        "5, '0,0,0,null,null,0,0|0,0,0,0,0'",
        "7, '0,0,0,null,null,0,0,null,null,0,0|0,0,0,null,null,0,0,0,0|0,0,0,0,0,0,0|0,0,0,0,0,"
            + "null,null,null,null,0,0|0,0,0,0,0,null,null,0,0'",
        "9, '0,0,0,null,null,0,0,null,null,0,0,null,null,0,0|0,0,0,null,null,0,0,null,null,0,0,0,0|"
            + "0,0,0,null,null,0,0,0,0,0,0|0,0,0,null,null,0,0,0,0,null,null,null,null,0,0|0,0,0,"
            + "null,null,0,0,0,0,null,null,0,0|0,0,0,0,0,0,0,null,null,null,null,null,null,0,0|"
            + "0,0,0,0,0,0,0,null,null,null,null,0,0|0,0,0,0,0,0,0,null,null,0,0|0,0,0,0,0,0,0,0,0|"
            + "0,0,0,0,0,null,null,null,null,0,0,null,null,0,0|0,0,0,0,0,null,null,null,null,"
            + "0,0,0,0|0,0,0,0,0,null,null,0,0,0,0|0,0,0,0,0,null,null,0,0,null,null,null,null,"
            + "0,0|0,0,0,0,0,null,null,0,0,null,null,0,0'"
    })
    void allPossibleFBT(int input,
        @ConvertWith(NestedListConverter.class) List<List<Integer>> output) {
        List<TreeNode> expected = new ArrayList<>();
        if (!output.isEmpty()) {
            for (List<Integer> l : output) {
                expected.add(BinaryTree.create(l.toArray(Integer[]::new)));
            }
        }
        List<TreeNode> actual = new Solution0894().allPossibleFBT(input);
        assertEquals(actual.size(), expected.size());
        int idx = 0;
        while (idx != actual.size()) {
            assertTrue(isSameTree(expected.get(idx), actual.get(idx)));
            idx++;
        }
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}