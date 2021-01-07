package pro.kwongsui.leetcode.dc;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.IntegerArrayConverter;

class Solution0241Test {

    @ParameterizedTest
    @CsvSource({
        "'2-1-1', '0,2'",
        "'2*3-4*5', '-34,-14,-10,-10,10'"
    })
    void diffWaysToCompute(String input,
        @ConvertWith(IntegerArrayConverter.class) Integer[] expected) {
        List<Integer> actual = new Solution0241().diffWaysToCompute(input);
        Collections.sort(actual);
        assertIterableEquals(Arrays.asList(expected), actual);
    }
}
