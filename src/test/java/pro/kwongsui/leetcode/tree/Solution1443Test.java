package pro.kwongsui.leetcode.tree;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.NestedIntArrayConverter;

class Solution1443Test {

    @ParameterizedTest
    @CsvSource({
        "7, '0,1|0,2|1,4|1,5|2,3|2,6', 'false,false,true,false,true,true,false', 8",
        "7, '0,1|0,2|1,4|1,5|2,3|2,6', 'false,false,true,false,false,true,false', 6",
        "7, '0,1|0,2|1,4|1,5|2,3|2,6', 'false,false,false,false,false,false,false', 0",
        "4, '0,2|0,3|1,2', 'false,true,false,false', 4",
        "6, '0,5|0,4|3,5|1,3|2,3', 'false,true,true,true,false,true', 8"
    })
    void minTime(int n, @ConvertWith(NestedIntArrayConverter.class) int[][] edges, String bool,
        int expected) {
        List<Boolean> hasApple = new ArrayList<>();
        for (String b : bool.split(",")) {
            hasApple.add(Boolean.parseBoolean(b));
        }
        assertEquals(expected, new Solution1443().minTime(n, edges, hasApple));
    }
}