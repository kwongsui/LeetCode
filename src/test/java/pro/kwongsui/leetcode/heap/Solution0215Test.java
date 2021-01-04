package pro.kwongsui.leetcode.heap;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.heap.Solution0215;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0215Test {

    @ParameterizedTest
    @CsvSource({
        "'3,2,1,5,6,4', 2, 5",
        "'3,2,3,1,2,4,5,5,6', 4, 4"
    })
    void findKthLargest(@ConvertWith(IntArrayConverter.class) int[] input, int k, int expected) {
        assertEquals(expected, new Solution0215().findKthLargest(input, k));
    }
}