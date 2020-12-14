package pro.kwongsui.leetcode.linkedlist;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;
import pro.kwongsui.leetcode.util.ListNodeConverter;
import pro.kwongsui.leetcode.util.ListNode2List;

class Solution0061Test {

    @ParameterizedTest
    @CsvSource({
        "'', 1, ''",
        "'1', 1, '1'",
        "'1,2', 1, '2,1'",
        "'1,2', 2, '1,2'",
        "'1,2', 6, '1,2'",
        "'1,2,3', 0, '1,2,3'",
        "'0,1,2', 4, '2,0,1'",
        "'1,2,3,4', 4, '1,2,3,4'",
        "'1,2,3,4,5', 2, '4,5,1,2,3'",
        "'1,2,3,4,5', 13, '3,4,5,1,2'"
    })
    void rotateRight(
        @ConvertWith(ListNodeConverter.class) ListNode input,
        int k,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        assertIterableEquals(Arrays.asList(output),
            ListNode2List.convert(new Solution0061().rotateRight(input, k)));
    }
}