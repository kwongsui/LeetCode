package pro.kwongsui.leetcode.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0116Test {

    @ParameterizedTest
    @CsvSource({
        "'1,2,3,4,5,6,7', '1,#,2,3,#,4,5,6,7,#'",
        "'1,2,3,4,5,6,7,8,9,10,11,12,13,14,15', '1,#,2,3,#,4,5,6,7,#,8,9,10,11,12,13,14,15,#'"
    })
    void connect(@ConvertWith(IntegerArrayConverter.class) Integer[] input, String output) {
        List<String> expected = Arrays.asList(output.split(","));
        List<String> actual = bfs(new Solution0116().connect(BinaryTree.create(input)));
        Assertions.assertIterableEquals(expected, actual);
    }

    public List<String> bfs(TreeNode tree) {
        List<String> list = new ArrayList<>();
        if (tree == null) {
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(tree);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            list.add(String.valueOf(treeNode.val));
            if (treeNode.next == null) {
                list.add("#");
            }
            if (treeNode.left != null) {
                queue.offer(treeNode.left);
            }
            if (treeNode.right != null) {
                queue.offer(treeNode.right);
            }
        }
        return list;
    }
}