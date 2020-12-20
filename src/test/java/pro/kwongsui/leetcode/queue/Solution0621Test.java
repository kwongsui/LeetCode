package pro.kwongsui.leetcode.queue;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.CharArrayConverter;

class Solution0621Test {

    @ParameterizedTest
    @CsvSource({
        "'A,A,A,B,B,B', 0, 6",
        "'A,A,A,B,B,B', 2, 8",
        "'A,A,A,A,A,A,B,C,D,E,F,G', 2, 16",
        "'A,A,A,B,B,B,C,C,C,D,E,F', 3, 12",
        "'A,A,A,A,A,A,B,B,B,B,B,B,C,D,E,F,G', 3, 22",
        "'A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z', 5, 26"
    })
    void leastInterval(
        @ConvertWith(CharArrayConverter.class) char[] input, int n, int output) {
        assertEquals(output, new Solution0621().leastInterval(input, n));
    }
}