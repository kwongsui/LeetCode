package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import pro.kwongsui.leetcode.tree.Solution0173.BSTIterator;

class Solution0173Test {

    @Test
    void test() {
        Integer[] input = new Integer[]{7, 3, 15, null, null, 9, 20};
        BSTIterator iterator = new BSTIterator(BinaryTree.create(input));
        assertEquals(3, iterator.next());
        assertEquals(7, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(9, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(15, iterator.next());
        assertTrue(iterator.hasNext());
        assertEquals(20, iterator.next());
        assertFalse(iterator.hasNext());
    }
}