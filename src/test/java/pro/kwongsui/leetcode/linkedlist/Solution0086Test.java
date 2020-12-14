package pro.kwongsui.leetcode.linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;
import pro.kwongsui.leetcode.util.ListNodeConverter;
import pro.kwongsui.leetcode.util.ListNode2List;

class Solution0086Test {

    @ParameterizedTest
    @CsvSource({
        "'', 0, ''",
        "'1', 1, '1'",
        "'1,2', 2, '1,2'",
        "'1,1', 1, '1,1'",
        "'3,1', 2, '1,3'",
        "'1,2,3', 2, '1,2,3'",
        "'3,1,0,2', 2, '1,0,3,2'",
        "'1,4,3,2,5,2', 3, '1,2,2,4,3,5'",
        "'4,3,2,5,2,1', 2, '1,4,3,2,5,2'",
        "'4,3,2,5,2,1', 3, '2,2,1,4,3,5'",
        "'4,3,5,6', 2, '4,3,5,6'",
        "'1,2,4,5,3', 6, '1,2,4,5,3'"
    })
    void partition(
        @ConvertWith(ListNodeConverter.class) ListNode input,
        int x,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        assertIterableEquals(Arrays.asList(output),
            ListNode2List.convert(new Solution0086().partition(input, x)));
    }
}