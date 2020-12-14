package pro.kwongsui.leetcode.linkedlist;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;
import pro.kwongsui.leetcode.util.ListNodeConverter;
import pro.kwongsui.leetcode.util.ListNode2List;

class Solution0024Test {

    @ParameterizedTest
    @CsvSource({
        "'', ''",
        "'1', '1'",
        "'1,2', '2,1'",
        "'1,2,3', '2,1,3'",
        "'1,2,3,4', '2,1,4,3'",
        "'1,2,3,4,5', '2,1,4,3,5'",
        "'1,2,3,4,5,6', '2,1,4,3,6,5'"
    })
    void swapPairs(
        @ConvertWith(ListNodeConverter.class) ListNode input,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        assertIterableEquals(Arrays.asList(output),
            ListNode2List.convert(new Solution0024().swapPairs(input)));
    }
}