package pro.kwongsui.leetcode.linkedlist;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;
import pro.kwongsui.leetcode.util.ListNodeConverter;
import pro.kwongsui.leetcode.util.ListNode2List;

class Solution0002Test {

    @ParameterizedTest
    @CsvSource({
        "'0', '0', '0'",
        "'2,4,3', '5,6,4', '7,0,8'",
        "'1,9,9,9', '9', '0,0,0,0,1'",
        "'9,9,9,9,9,9,9', '9,9,9,9', '8,9,9,9,0,0,0,1'",
        "'9', '1,9,9,9,9,9,9,9,9,9', '0,0,0,0,0,0,0,0,0,0,1'"
    })
    void addTwoNumbers(
        @ConvertWith(ListNodeConverter.class) ListNode l1,
        @ConvertWith(ListNodeConverter.class) ListNode l2,
        @ConvertWith(IntegerArrayConverter.class) Integer[] output) {
        assertIterableEquals(Arrays.asList(output),
            ListNode2List.convert(new Solution0002().addTwoNumbers(l1, l2)));
    }
}