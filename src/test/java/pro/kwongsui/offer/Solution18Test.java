package pro.kwongsui.offer;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.linkedlist.ListNode;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;
import pro.kwongsui.leetcode.util.ListNode2List;
import pro.kwongsui.leetcode.util.ListNodeConverter;

class Solution18Test {

    @ParameterizedTest
    @CsvSource({
        "'4,5,1,9', 4, '5,1,9'",
        "'4,5,1,9', 5, '4,1,9'",
        "'4,5,1,9', 9, '4,5,1'",
        "'', 1, ''",
        "'4,5,1,9', 2, '4,5,1,9'"
    })
    void deleteNode(@ConvertWith(ListNodeConverter.class) ListNode input, int val,
        @ConvertWith(IntegerArrayConverter.class) Integer[] expected) {
        assertIterableEquals(Arrays.asList(expected),
            ListNode2List.convert(new Solution18().deleteNode(input, val)));
    }
}