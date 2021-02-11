package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.linkedlist.ListNode;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;
import pro.kwongsui.leetcode.util.ListNodeConverter;

class Solution1367Test {

    @ParameterizedTest
    @CsvSource({
        "'4,2,8', '1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3', 'true'",
        "'1,4,2,6', '1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3', 'true'",
        "'1,4,2,6,8', '1,4,4,null,2,2,null,1,null,6,8,null,null,null,null,1,3', 'false'"
    })
    void isSubPath(@ConvertWith(ListNodeConverter.class) ListNode head,
        @ConvertWith(IntegerArrayConverter.class) Integer[] input, boolean expected) {
        assertEquals(expected, new Solution1367().isSubPath(head, BinaryTree.create(input)));
    }
}