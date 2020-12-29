package pro.kwongsui.leetcode.sort;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.linkedlist.ListNode;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;
import pro.kwongsui.leetcode.util.ListNode2List;
import pro.kwongsui.leetcode.util.ListNodeConverter;

class Solution0148Test {

    @ParameterizedTest
    @CsvSource({
        "'', ''",
        "'1', '1'",
        "'4,2,1,3', '1,2,3,4'",
        "'-1,5,3,4,0', '-1,0,3,4,5'",
        "'3,8,9,2,3,4,0,7,4,2,0,1', '0,0,1,2,2,3,3,4,4,7,8,9'",
        "'6,9,0,3,1,2,5,4,8,7', '0,1,2,3,4,5,6,7,8,9'"
    })
    void sortList(@ConvertWith(ListNodeConverter.class) ListNode input,
        @ConvertWith(IntegerArrayConverter.class) Integer[] expected) {
        assertIterableEquals(Arrays.asList(expected),
            ListNode2List.convert(new Solution0148().sortList(input)));
    }
}