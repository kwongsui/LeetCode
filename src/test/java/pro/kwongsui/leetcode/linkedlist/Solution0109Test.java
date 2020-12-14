package pro.kwongsui.leetcode.linkedlist;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.tree.BinaryTree;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;
import pro.kwongsui.leetcode.util.ListNodeConverter;

class Solution0109Test {

    @ParameterizedTest
    @CsvSource({
        "'-10,-3,0,5,9', '0,-10,5,-3,9'",
        "'-10,-5,-3,0,5,9,10', '0,-5,9,-10,-3,5,10'"
    })
    void sortedListToBST(
        @ConvertWith(ListNodeConverter.class) ListNode input,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        assertIterableEquals(Arrays.asList(output),
            BinaryTree.bfs(new Solution0109().sortedListToBST(input)));
    }
}