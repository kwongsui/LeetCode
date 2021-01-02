package pro.kwongsui.leetcode.hash;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.Collections;
import java.util.List;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.CsvSource;
import pro.kwongsui.leetcode.util.NestedStringListConverter;

class Solution0049Test {

    @ParameterizedTest
    @CsvSource({
        "'', ''",
        "'a', 'a'",
//        "'eat,tea,tan,ate,nat,bat', 'ate,eat,tea|bat|nat,tan'",
        "'eat,tea,tan,ate,nat,bat', 'nat,tan|bat|ate,eat,tea'"
    })
    void groupAnagrams(String input,
        @ConvertWith(NestedStringListConverter.class) List<List<String>> expected) {
        List<List<String>> actual = new Solution0049().groupAnagrams(input.split(","));
        for (List<String> l : actual) {
            Collections.sort(l);
        }
        assertIterableEquals(expected, actual);
    }
}
