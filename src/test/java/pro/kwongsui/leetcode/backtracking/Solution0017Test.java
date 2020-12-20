package pro.kwongsui.leetcode.backtracking;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.backtracking.Solution0017;

class Solution0017Test {

    @ParameterizedTest
    @CsvSource({
        "'', ''",
        "'1', ''",
        "'2', 'a,b,c'",
        "'23', 'ad,ae,af,bd,be,bf,cd,ce,cf'",
        "'789', 'ptw,ptx,pty,ptz,puw,pux,puy,puz,pvw,pvx,pvy,pvz,qtw,qtx,qty,qtz,quw,qux,quy,quz,"
            + "qvw,qvx,qvy,qvz,rtw,rtx,rty,rtz,ruw,rux,ruy,ruz,rvw,rvx,rvy,rvz,stw,stx,sty,stz,suw,"
            + "sux,suy,suz,svw,svx,svy,svz'"
    })
    void letterCombinations(String input, String output) {
        List<String> expected = new ArrayList<>();
        if (output.length() != 0) {
            expected = Arrays.asList(output.split(","));
        }
        Collections.sort(expected);
        List<String> actual = new Solution0017().letterCombinations(input);
        Collections.sort(actual);
        assertIterableEquals(expected, actual);
    }
}