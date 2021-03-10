package pro.kwongsui.offer;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.linkedlist.ListNode;
import pro.kwongsui.leetcode.util.IntArrayConverter;
import pro.kwongsui.leetcode.util.ListNodeConverter;

class Solution06Test {

    @ParameterizedTest
    @CsvSource("'2,3,1', '1,3,2'")
    void reversePrint(@ConvertWith(ListNodeConverter.class) ListNode input,
        @ConvertWith(IntArrayConverter.class) int[] expected) {
        assertArrayEquals(expected, new Solution06().reversePrint(input));
    }
}