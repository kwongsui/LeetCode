package pro.kwongsui.leetcode.greedy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntArrayConverter;

class Solution0134Test {

    @ParameterizedTest
    @CsvSource({
        "'2,3,4', '3,4,3', -1",
        "'1,2,3,4,5', '3,4,5,1,2', 3",
//        "'1,2,3,4,5', '1,2,3,4,5', 0", // 无唯一答案
        "'5,8,2,8', '6,5,6,6', 3"
    })
    void canCompleteCircuit(@ConvertWith(IntArrayConverter.class) int[] gas,
        @ConvertWith(IntArrayConverter.class) int[] cost, int expected) {
        assertEquals(expected, new Solution0134().canCompleteCircuit(gas, cost));
    }
}
