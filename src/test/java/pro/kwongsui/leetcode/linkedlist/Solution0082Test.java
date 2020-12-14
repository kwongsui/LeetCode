package pro.kwongsui.leetcode.linkedlist;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;
import pro.kwongsui.leetcode.util.ListNodeConverter;
import pro.kwongsui.leetcode.util.ListNode2List;

class Solution0082Test {

    @ParameterizedTest
    @CsvSource({
        "'', ''",
        "'1', '1'",
        "'1,2', '1,2'",
        "'1,1', ''",
        "'1,2,3', '1,2,3'",
        "'1,1,2', '2'",
        "'1,1,1', ''",
        "'1,1,1,2,3', '2,3'",
        "'1,2,3,3,4,5', '1,2,4,5'",
        "'1,2,3,3,3,4,4,4,4,5', '1,2,5'",
        "'1,2,3,4,5,5', '1,2,3,4'",
        "'1,2,3,4,5,5,5,5,5', '1,2,3,4'",
        "'1,2,3,4,5,5,5,5,5,6,7,8,8,8', '1,2,3,4,6,7'"
    })
    void deleteDuplicates(
        @ConvertWith(ListNodeConverter.class) ListNode input,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        assertIterableEquals(Arrays.asList(output),
            ListNode2List.convert(new Solution0082().deleteDuplicates(input)));
    }
}