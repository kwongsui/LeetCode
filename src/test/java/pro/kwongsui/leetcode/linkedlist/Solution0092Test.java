package pro.kwongsui.leetcode.linkedlist;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;
import pro.kwongsui.leetcode.util.ListNodeConverter;
import pro.kwongsui.leetcode.util.ListNode2List;

class Solution0092Test {

    @ParameterizedTest
    @CsvSource({
        "'1', 1, 1, '1'",
        "'1,2,3,4,5', 2, 4, '1,4,3,2,5'",
        "'1,2,3,4,5', 1, 5, '5,4,3,2,1'",
        "'1,2,3,4,5', 1, 3, '3,2,1,4,5'",
        "'1,2,3,4,5', 3, 5, '1,2,5,4,3'",
        "'1,2,3,4,5', 5, 5, '1,2,3,4,5'"
    })
    void reverseBetween(
        @ConvertWith(ListNodeConverter.class) ListNode input,
        int m, int n,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        assertIterableEquals(Arrays.asList(output),
            ListNode2List.convert(new Solution0092().reverseBetween(input, m, n)));
    }
}